package com.gigsky.treasurehunt.controller;

import com.gigsky.treasurehunt.model.beans.*;
import com.gigsky.treasurehunt.model.dbbeans.HasAnsweredPuzzle;
import com.gigsky.treasurehunt.model.dbbeans.HasAnsweredQuestion;
import com.gigsky.treasurehunt.model.dbbeans.ResponseMessage;
import com.gigsky.treasurehunt.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.Principal;
import java.util.Arrays;
import java.util.List;

/**
 * Created by harshams on 20/04/2020
 */
@RestController
@RequestMapping("/team")
public class TeamController {

    private static final Logger logger= LoggerFactory.getLogger(TeamController.class);

    @Autowired
    TeamService teamService;
    @Autowired
    PuzzleService puzzleService;

    @Autowired
    QuestionService questionService;

    @Autowired
    TeamMembersService teamMembersService;
    @Autowired
    UserService userService;
    @Autowired
    ConfigurationKeyValuesService configurationKeyValuesService;


    @GetMapping(value = "",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getTeams(){

        return new ResponseEntity<>(teamService.getAllTeams(), HttpStatus.OK);
    }




    @GetMapping("/{teamId}/points")
    public ResponseEntity<?> getTeamPoints(@PathVariable("teamId") Long teamId, Principal principal){
        if(!userService.existsByUsernameAndTeamId(principal.getName(),teamId)){
            ResponseMessage responseMessage = new ResponseMessage();
            responseMessage.setMessage("INVALID DATA ACCESS!");
            return new ResponseEntity<>(responseMessage,HttpStatus.FORBIDDEN);
        }
       TeamPoints teampoints=teamService.getPoints(teamId);
       if(teampoints==null){
           return new ResponseEntity<>(teampoints, HttpStatus.NO_CONTENT);
       }
       else{
            return new ResponseEntity<>(teampoints, HttpStatus.OK);
        }
    }

    @GetMapping("/{teamId}/answers")
    public ResponseEntity<?> getAnswerStatus(@PathVariable("teamId")Long teamId, Principal principal) throws Exception{
        if(!userService.existsByUsernameAndTeamId(principal.getName(),teamId)){
            ResponseMessage responseMessage = new ResponseMessage();
            responseMessage.setMessage("INVALID DATA ACCESS!");
            return new ResponseEntity<>(responseMessage,HttpStatus.FORBIDDEN);
        }
        try {
            TeamAnswers teamAnswers=new TeamAnswers();
            TeamPuzzleAnswers teamPuzzleAnswers=puzzleService.getPuzzleInfoTeam(teamId);
            //TeamQuestionAnswers teamQuestionAnswers=questionService.getQuestionAnswersTeamInfo(teamId);
            teamAnswers.setTeamPuzzleAnswers(teamPuzzleAnswers);
            //teamAnswers.setTeamQuestionAnswers(teamQuestionAnswers);

            /*List<HasAnsweredPuzzle> puzzlesResponse = puzzleService.getAnsweredListForTeam(teamId);
            List<HasAnsweredQuestion> questionResponse = questionService.getAnsweredListForTeam(teamId);
            AnswerStatus answerStatus = new AnswerStatus();
            answerStatus.setAnsweredPuzzles(puzzlesResponse);
            answerStatus.setAnsweredQuestions(questionResponse);*/

            return new ResponseEntity<>(teamAnswers,HttpStatus.OK);
        }catch (Exception e){
            logger.error("***exception caught"+e+"****");
        }
        return null;
    }


    @GetMapping("/{teamId}")
    public ResponseEntity<?> getTeamInfo(@PathVariable("teamId")Long teamId, Principal principal){
        if(!userService.existsByUsernameAndTeamId(principal.getName(),teamId)){
            ResponseMessage responseMessage = new ResponseMessage();
            responseMessage.setMessage("INVALID DATA ACCESS!");
            return new ResponseEntity<>(responseMessage,HttpStatus.FORBIDDEN);
        }
        TeamInfo teamInfo=teamMembersService.getTeamInfoByTeam(teamId);
        if(teamInfo==null){
            logger.info("***teamInfo is null***");
        }
        return new ResponseEntity<>(teamInfo,HttpStatus.OK);

    }


    @GetMapping("/score")
    public ResponseEntity<?> generateLeaderBoard(){

       TeamScoresList teamScoresList=teamService.generateLeaderBoard();
       if(teamScoresList.getList().size()==0){
           return new ResponseEntity<>(teamScoresList,HttpStatus.NO_CONTENT);
       }
       else{
           return new ResponseEntity<>(teamScoresList,HttpStatus.OK);
       }

    }

    @PostMapping(value = "/{teamId}/upload",consumes = "multipart/form-data")
    public ResponseEntity<?> uploadTeamImage(@PathVariable Long teamId, @RequestParam("file")MultipartFile file, Principal principal){
        if(!userService.existsByUsernameAndTeamId(principal.getName(),teamId)){
            ResponseMessage responseMessage = new ResponseMessage();
            responseMessage.setMessage("INVALID DATA ACCESS!");
            return new ResponseEntity<>(responseMessage,HttpStatus.FORBIDDEN);
        }
        ResponseMessage responseMessage = new ResponseMessage();
        String teamName = teamService.getTeamNameFromTeamId(teamId).getName();
        Integer day = configurationKeyValuesService.getIntegerConfigValue(teamName+"-day");
        String imagepath = configurationKeyValuesService.getStringConfigValue(principal.getName()+"-img"+day);
        if(!imagepath.equals("")){
            responseMessage.setMessage("Image already uploaded");
            return new ResponseEntity<>(responseMessage,HttpStatus.BAD_REQUEST);
        }
        if(file.isEmpty()){
            responseMessage.setMessage("Invalid Image");
            return new ResponseEntity<>(responseMessage,HttpStatus.BAD_REQUEST);
        }
        try {
            String fileType = file.getContentType();
            if(!Arrays.asList("image/png","image/jpg","image/jpeg").contains(fileType)){
                responseMessage.setMessage("Invalid file type");
                return new ResponseEntity<>(responseMessage,HttpStatus.BAD_REQUEST);
            }
            byte[] bytes = file.getBytes();
            Path path = Paths.get(""+file.getOriginalFilename());
            Files.write(path,bytes);
            System.out.println(path);
            configurationKeyValuesService.updateConfigValue(principal.getName()+"-img"+day,path.toString());
            responseMessage.setMessage("Image upload successful!");
            return new ResponseEntity<>(responseMessage,HttpStatus.OK);
        }catch (Exception e){
            logger.error("Exception occurred ",e);
            responseMessage.setMessage("could not upload file");
            return new ResponseEntity<>(responseMessage,HttpStatus.BAD_REQUEST);
        }

    }

    @GetMapping("/image/download")
    public ResponseEntity<?> getTeamImage(@RequestParam Long teamId,@RequestParam Long day, @RequestParam String passkey)throws Exception{
        if(!passkey.equals("Hitherto shalt thou come, but no further")){
            return new ResponseEntity<>("INVALID DATA ACCESS! ",HttpStatus.FORBIDDEN);
        }
        String teamName = teamService.getTeamNameFromTeamId(teamId).getName();
//        Integer day = configurationKeyValuesService.getIntegerConfigValue(teamName+"-day");
        String path = configurationKeyValuesService.getStringConfigValue(teamName+"-img"+day);
        if("".equals(path) || path == null){
            return new ResponseEntity<>("No Image has been uploaded ",HttpStatus.OK);
        }
        Path filePath = Paths.get(path);
        Resource resource = new UrlResource(filePath.toUri());
        if(!resource.exists()){
            return new ResponseEntity<>("File not found",HttpStatus.OK);
        }
        String contentType = "application/octet-stream";
        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(contentType))
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
                .body(resource);

    }

    @PostMapping("/image/approve")
    public ResponseEntity<?> approveTeamImageUpload(@RequestParam Long teamId, Principal principal){
        ResponseMessage responseMessage = new ResponseMessage();
//        if(!userService.existsByUsernameAndTeamId(principal.getName(),teamId)){
//            responseMessage.setMessage("INVALID DATA ACCESS!");
//            return new ResponseEntity<>(responseMessage,HttpStatus.FORBIDDEN);
//        }
        if(configurationKeyValuesService.isMoveValid(teamId,4)){
            String teamName = teamService.getTeamNameFromTeamId(teamId).getName();
            configurationKeyValuesService.updateConfigValue(teamName+"-stage","5");
            responseMessage.setMessage("Team Image Successfully verified");
            return new ResponseEntity<>(responseMessage,HttpStatus.OK);
        }
        responseMessage.setMessage("Team Image verification failed");
        return new ResponseEntity<>(responseMessage,HttpStatus.BAD_REQUEST);
    }


}
