-- MySQL dump 10.13  Distrib 5.7.25, for macos10.14 (x86_64)
--
-- Host: localhost    Database: treasurehunt
-- ------------------------------------------------------
-- Server version	5.7.25

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Dumping data for table `configurationKeyValues`
--

LOCK TABLES `configurationKeyValues` WRITE;
/*!40000 ALTER TABLE `configurationKeyValues` DISABLE KEYS */;
INSERT INTO `configurationKeyValues` VALUES ('Aaryavarta-day','1'),('Aaryavarta-hint',''),('Aaryavarta-img1',''),('Aaryavarta-img2',''),('Aaryavarta-img3',''),('Aaryavarta-img4',''),('Aaryavarta-stage','1'),('Akhandadweepa-day','1'),('Akhandadweepa-hint',''),('Akhandadweepa-img1',''),('Akhandadweepa-img2',''),('Akhandadweepa-img3',''),('Akhandadweepa-img4',''),('Akhandadweepa-stage','1'),('COINS_REQUIRED_UNLOCK_CLUE','16'),('day','1'),('DevaBhumi-day','1'),('DevaBhumi-hint',''),('DevaBhumi-img1',''),('DevaBhumi-img2',''),('DevaBhumi-img3',''),('DevaBhumi-img4',''),('DevaBhumi-stage','1'),('Karusha-day','1'),('Karusha-hint',''),('Karusha-img1',''),('Karusha-img2',''),('Karusha-img3',''),('Karusha-img4',''),('Karusha-stage','1'),('key1','32'),('key2','46'),('key3','90'),('Mahishaka-day','1'),('Mahishaka-hint',''),('Mahishaka-img1',''),('Mahishaka-img2',''),('Mahishaka-img3',''),('Mahishaka-img4',''),('Mahishaka-stage','1'),('MAX_ATTEMPTS_PUZZLE','5'),('Nishadha-day','1'),('Nishadha-hint',''),('Nishadha-img1',''),('Nishadha-img2',''),('Nishadha-img3',''),('Nishadha-img4',''),('Nishadha-stage','1'),('passkey-1','32'),('passkey-2','46'),('passkey-3','90'),('passkey-4','239094306'),('Shalwa-day','1'),('Shalwa-hint',''),('Shalwa-img1',''),('Shalwa-img2',''),('Shalwa-img3',''),('Shalwa-img4',''),('Shalwa-stage','1');
/*!40000 ALTER TABLE `configurationKeyValues` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `has_answered_puzzle`
--

LOCK TABLES `has_answered_puzzle` WRITE;
/*!40000 ALTER TABLE `has_answered_puzzle` DISABLE KEYS */;
/*!40000 ALTER TABLE `has_answered_puzzle` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `has_answered_question`
--

LOCK TABLES `has_answered_question` WRITE;
/*!40000 ALTER TABLE `has_answered_question` DISABLE KEYS */;
/*!40000 ALTER TABLE `has_answered_question` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `puzzle`
--

LOCK TABLES `puzzle` WRITE;
/*!40000 ALTER TABLE `puzzle` DISABLE KEYS */;
INSERT INTO `puzzle` VALUES (1,'TEXT',NULL,'icecreamText_1.png',2,NULL),(2,'IMAGE',NULL,'toysImg_2.png',2,'game of thrones,got'),(3,'TEXT',NULL,'fiftysixText_3.png',2,NULL),(4,'TEXT',NULL,'numbersText_4.png',2,'280'),(5,'IMAGE',NULL,'boxesImg_5.png',2,'9'),(6,'TEXT',NULL,'deviceText_6.png',2,'ipod,i-pod'),(7,'IMAGE',NULL,'companyImg_7.png',2,'delhivery'),(8,'IMAGE',NULL,'playerImg_8.png',2,'royal challengers bangalore,rcb,royal challengers bengaluru'),(9,'TEXT',NULL,'famousSongText_9.png',2,'why this kolaveri di,kolaveri,why this kolaveri kolaveri di?,why this kolaveri kolaveri di,why this kolaveri di?'),(10,'IMAGE','These pictures are related..any guesses?','timeImg_10.png',2,'1989'),(11,'TEXT',NULL,'sequencetText_11.png',2,'21'),(12,'IMAGE',NULL,'mensaImg_12.png',2,'6'),(13,'TEXT','ITSY YWZXY GWZYZX','caesarText_13.png',2,'dont trust brutus'),(14,'TEXT',NULL,'spartaText_14.png',2,'300'),(15,'TEXT',NULL,'trophyausText_15.png',2,'women\'s  big bash league,wbbl,,women big bash league,women\'s big bash,women big bash'),(16,'TEXT',NULL,'scofieldImg_16.png',2,'purdue hill alabama'),(17,'IMAGE','How are these images related?..We as ComputerScience engineers can surely give a try!','engineImg_17.png',2,'javascript engines,,js engines,ecmascript engines'),(18,'IMAGE','What does the gif say?\n','gif_18.gif',2,NULL),(19,'TEXT',NULL,'googlecollideText_19.png',2,'Why are the galaxies in a spiral shape?, why are galaxies in spiral shape?,Why are the galaxies in a spiral shape?, why are galaxies in a spiral shape?,'),(20,'TEXT',NULL,'dayQText_20.png',2,'wednesday'),(21,'TEXT',NULL,'illuminate45Text_21.png',2,NULL),(22,'TEXT','','spiritualText_22.png',2,NULL),(23,'VOICE','Name the music instrument used!','music_23.mp3',2,'accordion'),(24,'TEXT','Name the famous cricket shot!','cricketshotImg_24.png',2,'dil scoop'),(25,'VOICE','Guess the speaker...','dream_25.mp3',2,'martin luther king,martin luther king junior,martin luther king jr,martin luther '),(26,'IMAGE','Moments where opponents regret Sledging...who was the bowler?','revengeImg_26.png',2,'venkatesh prasad,venkatesh'),(27,'VOICE','Guess the famous speaker...','fearlessVoice_27.mp3',2,'lal bahadur shastri'),(28,'TEXT',NULL,'shadowImg_28.png',2,'jimmy anderson,anderson,james anderson'),(29,'TEXT',NULL,'murderbookText_29.png',2,'angels and demons'),(30,'TEXT',NULL,'gamegoText_30.png',2,'pokemon go'),(31,'TEXT',NULL,'harryImg_31.png',2,'diary ring cup,diary cup ring,ring diary cup,ring cup diary,cup ring diary,cup diary ring'),(32,'TEXT','Based on what are the countries grouped?','colours_32.png',2,'passports, passport colours,passport, passport books,passport book,passports of countries');
/*!40000 ALTER TABLE `puzzle` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `question`
--

LOCK TABLES `question` WRITE;
/*!40000 ALTER TABLE `question` DISABLE KEYS */;
INSERT INTO `question` VALUES (1,_binary 'PK\0\0\ÃHšP\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0word/numbering.xml\ÅWË\Ó0ış!ò¾Í£\éCÑ¤³`4„\Ã¸›X\ã—l\'~v°\å\Ûøœ÷´H(-²©•û8÷÷ôD½»a\Ô)°\ÒDğøs8˜#‘\Æ\à\ë\Ó\ãlm O \Ç\àˆ5¸ß¾¹;D<g;¬lc!¸ŠAfŒŒ\\W£3¨\çBbn“{¡4öQ¥.ƒ\ê9—3$˜„†\ì%\æ\è·\rŒˆA®x\Ô@\ÌAJh±7eK$ö{‚ps´j\ÈÜº\åA œanª‰®\Â\Ô\î ¸Îˆ\Ô-\Z»\Í&³¤ø‰‚Ñ¶\î ‡LK<\Ø{f´t*‘J ¬µ>\Ô\É\Ñ÷\\`	\ÑuY\átf»	ƒ„w0¥:Î€º\Ùs;»¹´\nª\'\Òß…¦C©S\ÉNAuü{x\Å}¾\î—dŠ\Ïl—\ÉU\'\Èk P•i\è5T gœ¼…¼€˜“tœÏSY/R}\Ñ7\ë{grù’A‰{´ôÿ\Ğ\Ş)‘\Ë^\î\á5h¯~şò2€ \ØZ„;mD\æSÎœ“§÷‰5Óª„Ô¦ˆ=b\àUk§\Ê\ØXiY\änk3}d]p—SŠM±Oø¥Kışù½‹@m”\â}S.?«ò <±¹2ƒu`Mıe§•«/V^Y\ëvÅª>ò[§o*ª”[M;\'\ãß‚Ì·K\Éøa8\n›\àl~üº”M\à¯Fa³˜DhÁf3\n›p¥\Ù\åGa³œDi\ábXM¢´¥7¬\'Q\Úr=l&Q\Ú*¼•¸\'¯\Ôfo§ú\ìß¯\'/\İšnUÙõ•\íPK%,7K\0\0ñ\0\0PK\0\0\ÃHšP\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0word/settings.xml¥•\Ín\Û0ÇŸ`\ï\èø£I6uzX±í°\Ò=\0#É¶}A’\ã\å\í\'Ç–Õ¤@\áf§H’?\ÒM?>ı|q¢\Æ2%K”­R´ +\Âd]¢?¯?–\ß\Ğ\Â:¸’´Dgj\Ñ\Ó\î\ËcWX\êœ÷²O¶¸DsºH‹*À®”¦\Ò+e85u\"À[½\ÄJhp\ìÀ8s\ç$O\Ó-\Z1ªD­‘ÅˆX\n†²ªr}H¡ªŠa:ş„3\'\ïò¬p+¨t—Œ‰¡\Ü× ¤m˜¶&\î¥yc §\â$xğ\ëôœl\Ä@\ç-ø¨S†h£0µÖ«Ïƒq\"f\éŒöˆ)bN	\×9C%˜œ0ıpÜ€¦\Ü+Ÿ{l\Ú$ö\Âò9…¦\ß\ì`Àœ\ßWwôóm¼f³¦ø†\à£\\k¦¼0.\0ø=®ğ‘’\ï O0\r3©gó\r‰0¨\rˆ8¤öSÿl–ŞŒË¾M#­ş?\ÚO£Z\Ç}}\í\Í˜m>\È`\çW ¡´Ü½\Âa\ï”^t\Å	ü\ÍS”ô\æa\Ë\Å\Ó~Ø˜Á/\Û ” ü›sµ_¡½©5l~q}\Ê\ä*\'7û>ˆ¾€\ÖC\ÚC•ˆ³ºqY\ÏwşFüB¾\\u>\Úò‹-l—`\ì÷œ÷QËƒö\Æ\ï!hQ[mµM\Ğ6Q\Ûm\Ûk\ÍYSÃ™<ú6„c¯WŠs\ÕQò+\Ú\ßIc?\ÂWj÷PK³Ã¤\0\0\ê\0\0PK\0\0\ÃHšP\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0word/fontTable.xml¥”\İN\ã0…Ÿ`\ßÁò}›-h‘¢h¹.¶\ìL\'±°=\Ö\Øi\è\Û\ã\Òü@A(d¯¢x|¾3Ÿ\äò\ê\Ùh¶“\äÚœ¯–)g\Ò\n,”­rş\ïñ\Ï\âg>€-@£•9\ßKÏ¯\Ö?.Û¬D<‹r\ë3#r^‡\à²$ñ¢–ü´±X\"ñ•ª\Ä\0=5n!\Ğ8j«´\nû\ä,M/x‡Áœ7d³±0Jz,\ÃA’aY*!»G¯ )¾G\É\rŠ\ÆH^’:ö€\Ö\×\Êùf\æ\Òb±\î!»¯±3º\ß×º)nA\ï\Â\è£Q‹T8B!½«7\Ç\â@\\¥x@Š)-¼÷\ì;1 \ì€9$\ã4x/£w7´W\Ôxq^Oi\äXºS[\Ú\ìf\Ìó­Ş©I)>!DUhh\ä„¨B\Ğs\ZÅ“,®Á\î`sQMŠó	©PP˜1¤ş[7»JOâ²©ÁÉ‘Vıí–°qc\ÜÎ¡½ùW\ç\ßœõ€u÷ÿcmfÁ\Äğÿ&š\'\Ö•‘=È–ıEö“\×-\Ù¬g÷›C=\é~­\ëPK^x@•\0\0œ\0\0PK\0\0\ÃHšP\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0word/styles.xmlÕ–\ín\Ú0†¯`÷€ò¿MHCQiUµ\ê6©ê¦µ»€ƒcˆUÇ¶lÊ®~\Î7$¡Jü\0û¼\Ç~ü:\Î\Õ\Í[LGk,\áln/k„\â!a«¹õ\ç\å\ábf”\åÏ­-V\Ö\Íõ—«M ô–b52ùL1š[‘\Ö\"°m…\"ƒº\ä3Ó¹\ä2mšre\Ç _qx,@“¡Dom\×q¦V!\Ã\çV\"YPH\\\ÄI®øR§)_.	\Â\ÅO™!û\Ô\ÍS\î9Jb\ÌtVÑ–˜š9p¦\"\"T©U3Q)²~oë˜–\ã6¢OµP\Â\ÆlFLóB.C!9\ÂJ™\è}\ŞY)\0S‰*£\Ïök–3‰°J&µFC¨ª}ij\Ğ2©z!5EûL$\ïz$	rÛà¹›/H/7L–Nde\È!(©K:DrôŠ\Ã;`k¨\Ì®zÙ¹¡XIˆk“ª\í\ì\Øi\Ø\å9kµ\Õqj\ß$ODmwˆ\Ú\Î	O>&\à–\×\ært—P­Ò¦ü%‹f\Ñ\Ê~8\Ój´	@!B\æÖ­$`\Êo¤v\Z”¾UvB\Ñ-S\Õx;•RMx\ræ ¸n¹S\Í¶*c˜¥1»˜Œİœ¢h¶2Mˆd”¤‡\Úı:µŠ\Æï„š\0$š²¢\İ²[\\²{\ÂH\è­0\éd\ê/¥ªY×pn=¥~\Ì\Ö\æ™\æ*\Ê3ˆq¹–\Êkg©my\rŠ÷¤_\ÒH/ıl\ä\è©G•\îE|Ç^›m\á(\ïó-Z€\Â\áOVö\ÖM~\Ó]ñbs^1O;C\nÁ4üh6H5\âõ^\ÂRcsS]\'ñ›óo–\á;\Îû{[Ù¸öï´½—\Çv|6›{›ûÉ°yÓ¾\Ø¥²\Ó<\Â^\Ç\ÎcGbôbôÎq¶O\ÑJq\Êe\å=/ı¶³\'\ä\ìxıƒxıÏ…×õÅ»‡sš}Z8ıœş	pN\âœ|2œş)q¼¿\Ä9=ˆsú¿\â$\r\á³\à}!Ú¼U´\Ş²è™¹N÷¸~ü>ŸtÀš\ë9Y\èN^UÇ™‘y\î f\'|•¯L\İu£u›\Ú\ëx\ïò¼w•ÿ\Ôõ?PKˆ\ÎE\0\0\ß\0\0PK\0\0\ÃHšP\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0word/document.xml\í\\\ïn\Û8‚}‡¿\Ü.\ÈNšv{Æ¦Ešl[\İ^‘\äZÜ§--®)R ){µŸúwÀ\İ\ËõIn†’\ì8	\n\Ç\Ûd•Dşb‹†\ÃÑ3¿¡(ÿôò÷LÁ­“Föö¢AP\Ç&‘zz\Øû\çù\ë\İ\ç=p^\èD(£ñ°W¢\ë½|ñ\İO‹ab\â\"C\í$h7\Ì\â\Ã^\ê}>\ì÷]œb&\\dr\ÔT916.í´Ÿ	;+ò\İ\Ød¹ğr,•ôe0xÖ«Å˜\Ã^aõ°±›\É\Ø\Zg&»\Íd\"c¬¿šv“q«.\'µ\ÊaÄ¾EE:\íR™»FZ¶­4ªL!ó¯Mb©¦\İ\"\ßd´ÄŠİLU-ŒMrkbtJOªÊ¥Ä½Ád\Ë›¨°>f£I&¤^Šap\\´;¢±k£Q«‰¬l\á\Ô&ŠTU\ï\ä\Ø\n[^\ÕBlaÏ‹ıs¹Š/I ^¾°K@n#\"N…õ\0µe\â&\ÇB\Ï\Å\Ì\Ét#8_’”H1µ\"[\Ô\İ\è\Î\î\r.Á\å,9®¤Mÿœ´7\Öù\n\î\ÛH»°÷\ŞLÀ~#\à¹À±IJş\Îa1$šœöõ§W ºZø\áj\Ñ\é	ND¡ü55\ìZ\á\ŞÁ0VŒ’e\é^P&ÿ`ù\Ë\Ö_¯öDKy\Ø;—:x85™\Ğ,<v\×£pş\ÈIqmez¤\İ5\Òú<¤ûƒ\Z\Ì\Íwÿ )9v\ëeıZÁşJß¯\ê\Zƒ®›£ı3&Å¼jŠm°†\Ø9t¹ˆ\Éy\æ\Ú9ö^|JQCi\nŠ\Ä-œ\à\\\æ…;\àS´Ò\0e<˜	B3\ÃADfôr4¹\Âh¤!“‰M|*üõa\É\Ë\Ì\Ä÷¹•\èü\\·ıQ\ÈY*´pDN‹M\ĞZpA\nı<\n]y3m¬H\ÒL‡qI\n5³0—Nzn\Ã\Õ1…õ\è-IÊ¤«úN\åƒDn0Ã’\Ë4ş\îCcA¤¨rHe±•|e«\n--Xgû\İ:û\nœ[u«t·ª½3\Ş\Â%®ü\Ó\à1³5Ş¥r*µƒiœË¸ğİ¥Ë„R0vJl¯•\Î\å Cl{g¼b)?D”ûhTFaˆÁZBÁG\éR]À)\åŒ\Æ;1üC‡H\Í]v\Ä29/†­K…’L\É]¯×”ˆs\Ø\å¨\ëŠño{·s&2ŠÀ©€T8JØBœÊ¨t)\"\Äsn¸&¡Ñ‘-E‰³V®‹§İºhïŒ·Xÿ2\Å>1\Ò\Ù1WÀ{\ÙF\à=\ë€\×\ŞÿI\n1òcV<³·b\n2Jy¤\Æ\è\Â•D\â\ä\ÙSN\Ù\ß¿(QX\Ø\ì\à\è$‚·U¥Â‰§„…|.\Æ=K“\nrrìš\\RJÆ•ck˜ŒìœŠiJ\ŞÈ½*‰QŠ*\ÎwØ¯“\Û\'™s\Î\ÔHkOÎ¹i’0QLS\Z\ËPÇ\Ö\áÚ˜Œª*ºJ£\n\Ç51B¾|ş)l\â°\ëIÕ¬‹\ÉD\ÎtŠ;:¤‘8°	<’‚6®²7-Æ¬g\ĞdJc†\à³*c\ÏBU£\07	i!q±¾|ş\ï¦º*V6\n¼,VE°\í\"Pµ4\Ä\ÉTò\î3DoŒI\à]Ï¾|ş_ôª]\éµªªB\Ï9ò2üñı¶ÑüØ¹“û’<>\ïnU{g¼…\ç\'_]Â«\Ú·\Ñ7üı\"\àt‘U?¤š¯O4Ô’¦l¯üªƒ\æ:ö€‡½÷\Ãøğ¦\áQŞ“gµˆ\ÚT¸¾¸~{´k¨\ê\ìt8Xø÷]Y\ê\Ød2&^ ür\Ö\Ø\éJ\á\ÊJWªj­—‡¹\×V\à­YL¡ê¬µ±“¯(dC@\"$\èb\â³\È3%\Æ|$‰\é1gü€\Ö\ë\Ù7º5“\İJx\ÔE\è{y^[“\Õ\Ï¦\æñE\ê¢)\à|_\á–F<3…O\ín…¼±\âİ\Ì\Ú©?{\×\Í.“¬v\å!¿\rƒpw\Î?:\Ş‰‰´‡>Â¤E§ tÈù@§\Ç\è|I˜R)˜ppšnJ\Ì\ĞEos¯z\ß%p\ï?E.½P\át\ËB\ë½g›f¿7\Õó‹‰!\ãH\Å\áuK+VH›\ë[ùD÷UÇ¥\ï-\èÖ¹4;\Å\ç3…\Õ\áL\ßB\Ø\Äu$g{’£i\İv$gC’Á±5õc\Å\Ü\ÒÈ»Z™H¡w\Â3\È\Ä,£¾\ã.7\ã.œ»Ø‡D[nü\"“BªWXKvK0q	b\Øv§Ú“ü(g\ä¹\ËA\É9&\Ñ\ÈW¤{Ì°E\ïK’¤(ò:Š·1n\ß}\Ün)R:ªp3ªPo~<:ò-w=X\ÕGgÀ\Ûjg};\ã\ìBÿ¯üyHv»­\rŠ‘\ïøp›OºÏ§ğ”Oû\é?\\\\¨œ_u\0¹¢ş	\'L\ÕKRü\Şf\ÆK ª`!A‘D­Œú\']\Ô\ï¢ş\æ\ë\â\\Ìª—p&¤\Ø\Ã\Êa\ï\ÈC†œòñ_K?x\ïñ¶Œ6¹À6\rd\åòœs@d J>SÌ§­\ëİ€_«H71|\Ô\ZZ\éz\îÎ¡¶w\Æ[€ô­É«\çm›f\í\Ìò_w kïŒ·\0İ™%81Áè“ ?0\"¶}{ƒ}_¹É­ºU—ÿu¤ÿš\Âa\ì«öùôŒ\ï]J,\í\éóƒ A¿÷÷\ê#Ÿş\"X»±ñ\ŞdTuPµò&_]TyJse\å4½p™R®†v™\ÆLŒñ\Íe=\Âû\";/\É×“b^X¿J‡\Z=û\Í\ÇôWÿ£õ\âÿPKh›\Ô\0\0ŒK\0\0PK\0\0\ÃHšP\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0word/_rels/document.xml.rels­’Mj\Ã0…O\Ğ;ˆ\Ù×²\ÓJ‰œMd[\Ü(òø‡Z#!MJ}ûŠ”$Ó…—\ï‰yóÍŒÖ›;ˆo±w¤ \ÈrH\Æ\Õ=µ\n>«\İ\ãˆÈšj=8B#FØ”\ë4§š\Øõ>ŠBQA\Ç\ìß¥Œ¦C«c\æ<Rzi\\°š“­ô\Ú|\é\å*\Ï_e˜f@y“)öµ‚°¯\Õ\èñ?Ù®izƒ[g‰ï´œj1\ê\Ğ\"+8\É?³\ÈR\Èû«%\"2§\å\Æ+\ÆÙ™CxZ¡qÄ•>“U\\¬9ˆ\ç%!\èh\Ò\ÜWˆ‹5ñ²\è1xpzŠ“>·—7Ÿ¼üPK\0«\ëñ\0\0\0,\0\0PK\0\0\ÃHšP\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0_rels/.rels\Ï;\Â0\àp‡\È;MË€j\Ò!uE\å\0Q\â¦\ÍCIxôöd`\0\ÄÀhû÷g¹\ív&7Œ\ÉxÇ ©j \è¤W\Æi\ç\á¸\ŞIY8%f\ïÁ‚	:¾jO8‹\\v\ÒdB\"q‰Á”s\ØSš\ä„V¤\Ête2úhE.e\Ô4y\Zé¦®·4¾À?L\Ò+±W\ra	ø\í\Ç\ÑH<xyµ\èò_‰\"‹¨13¸û¨¨zµ«\Â\å-ıx‘?PK-h\Ï\"±\0\0\0*\0\0PK\0\0\ÃHšP\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0word/theme/theme1.xml\íYKo\Û6¿\Øw toe\ÙV\êuŠØ±Û­M$n‡i‰–\ØP¢@\ÒI|\Ú\ã€Ãºa‡\Øm‡a[Ø¥û4\Ù:lĞ¯°¿–)›Î£M·­6Iış\ïIùò•Ãˆ¡}\"$\åq\Ûr.\Ö,Dbû4\Ú\Ö\íAÿB\ËBR\á\ØÇŒÇ¤mMˆ´®¬øÁe¼¦Bô±\\\Ãm+T*Y³m\éÁ2–yBbx6\â\"\Â\n¦\"°}€o\Ä\ìz­¶bG˜\ÆŠqloF\Ô#h²´Ö§\Ì{¾b%\Ó‰]/“¨SdX\ÏI\äDv™@û˜µ-\ãóƒ9TbX*xĞ¶j\ÙÇ²\×/\Û%SKh5º~ö)\è\n¯Ñ‰`X:ı\æ\ê¥Í’=ç¿ˆ\ëõzİSò\Ë\0\ØóÀRg\Ûì·œÎ”§Ê‡‹¼»5·Ö¬\â5şüj§\ÓqW+ø\Æ\ß\\À·j+Ízßœ\á\İEı;\İ\îJ\ï\Îğ+øş¥Õ•fŸBF\ã½t\Z\Ï22%d\Ä\Ù5#¼ğ\Ö4f([Ë®œ>V\Ër-\Â÷¸\è .V4Fj’ö\0\×ÅŒM\à5‚µ\'ù’\'–RYHz‚&ªm}œ`¨ˆ\ä\å³_>{‚\î?=ºÿ\ËÑƒG÷6P]\Ãq S½øş‹¿}Šşzòİ‹‡_™ñR\Çÿş\Óg¿ıú¥¨t\àó¯ÿñôñóo>ÿó‡‡ø†ÀC> ‘\è&9@;<\Ã\ÈPœbbªSlÄ\Ä1Ni\è\n+\è›Ì°\×!U\Ş\ĞLÀ«\ã{…wC1V\Ô\0¼F\à\ç¬Ã…Ñ¦\ë©,\İ\ã80c·ƒñ¾Ivw.¾½q¹LM,»!©¨¹\Í \ä8 1Q(}\Æ÷1İ¥´\â\×-\ê	.ùH¡»u05ºd@‡\ÊLtF—‰IAˆw\Å7[wP‡3ûM²_EBU`fbIXÅWñX\áÈ¨1˜¼UhRrw\"¼ŠÃ¥‚H„q\Ôó‰”&š[bRQ÷:´sØ·\Ø$ª\"…¢{&\ä\rÌ¹\Ü\ä{\İG‰Qg\Z‡:ö#¹)Š\Ñ6WF%xµB\Ò9\Ä\ÇK\Ã}‡u¶Ú¾MƒĞœ é“±0•\á\Õzœ°&q\Ñ\á+½:¢ñq;‚¾Ï»qC«|ş\í£ÿQ\Ë\Ş\0\'˜jf¾Q/\ÃÍ·\ç.>}û»ó&\Ç\Û\n\â}s~ßœ\ß\Åæ¼¬Ï¿%Ïº°­´36\Ñ\ÒS÷ˆ2¶«&ŒÜYÿ–`ß‡\Ål’•‡ü$„a!®‚\Î\ÆHpõ	U\ánˆ\ãdY°$J¸„«…µ”wv?¥`s¶\æN/•€\Æj‹ûùrC¿l–l²Y uA”Ái…5.½0\'Ršãš¥¹\ÇJ³5oB\İ œ¾JpV\ê¹hHÌˆŸú=g0\r\Ë‘S\ÓbbŸ–5ûœ\Æñ¦{&%\Î\ÇÉµ\'Û‹\Õ\Ä\â\ê´­U·\îZ\È\ÃI\Û\ZÁi	†Qüd\Úi0\â¶\å©\ÜÀ“kq\Î\âUsV95w™Á‰j\Ë0§\ÊM_¥\Ä3ı\ën3õ\Ãù`h&§Ó¢\ÑrşC-\ìùĞ’Ñˆxj\É\ÊlZ<\ãcE\Än\è !‹z7ó\ìò©„N_ŸN\äv³H¼j\áµ1ÿÊ¦¨Ì’\Ù\Ş\ÒbŸÃ³q©C6\ÓÔ³—\èşŠ¦4\Î\Ñ÷\İ5%\Í\\8Ÿ6ü\ì\Ò»¸À(\ÍÑ¶Å…\n9t¡$¤^_À¾Ÿ\É½”Eªb\é\èTW²?\ë[9¼\É¡Ú¡:\n!Ûª°ófN]\ß§ŒŠ>Sª+“üwHö	¤Õ»’\Úo¡p\ÚM\nGd¸ù Ù¦\ê\Zı·ø\à\Ò|¥g&¨y–Í¯©5}m+X}=N³k\â\êf‹\ë\îÒg~«M\à–\Ò/h\ÜTxlv<ğˆ>*÷y‰x¡U”_¹8[šq)«\ë\ÔZ\ïó<;j\În,qöñ\â^\İÙ®Á\×\îñ®¶K\Ô\Ö\î!\Ùl\á(>¼²7\áz3fùŠL`–¶Efğû“b\Èd\ŞrGL[:‹w\ÈQÿp\Z\Ö9ÿô”›ùN. µ½$lœLX\àg›HI\\?™¸¤˜\ŞñJ\â\ìgbÀf’s|\å²E–bñ\ë¸\ìÊ›]f\Ì\ŞÓº\ìz—©\Ã\ã]Vx\Ê6%9Tw§]AşÚ³”]ÿPK!Z¢„,\0\0\Û\0\0PK\0\0\ÃHšP\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0[Content_Types].xmlµ“Mn\Â0…O\Ğ;D\ŞV\Ä\ĞEUUıY¶]\Ğ\Î¬úO\Â\í;	©•šeûÍ¼÷y$O\ç;\ïŠ-f²1TjRUÁ\ÄÚ†U¥>¯£UC¨ÁÅ€•\Ú#©ù\ìfº\Ø\'¤BšUjÍœµ&³FTÆ„A”&f,Ç¼\Ò	\Ì¬Pß\Ç÷\Ú\ÄÀxÄ­‡šMŸ±\ã\â\ép\ßZW\nRr\Ö\0—3U¼\ìD<`¶gı‹¾m¨\Ï`FG2£\ëjhmİˆJmÂ»L&\Û\Zÿ›\Æ\Z¬£\Ùxi)¿c®S‰d¨Ş•„Ì²;¦~@\æ7ğb«\ÛJ}R\Ë\ã#‡A\à½\Ãk\06h|#^X:¼L\ĞËƒB„_b–ıeˆ^¢W<\Øp¤/ùG–zeøtX\'§H\İıö\ÙPK3¯·,\0\0-\0\0PK\0\0\0\ÃHšP%,7K\0\0ñ\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0word/numbering.xmlPK\0\0\0\ÃHšP³Ã¤\0\0\ê\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0‹\0\0word/settings.xmlPK\0\0\0\ÃHšP^x@•\0\0œ\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\Ï\0\0word/fontTable.xmlPK\0\0\0\ÃHšPˆ\ÎE\0\0\ß\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0¤\0\0word/styles.xmlPK\0\0\0\ÃHšPh›\Ô\0\0ŒK\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0ş	\0\0word/document.xmlPK\0\0\0\ÃHšP\0«\ëñ\0\0\0,\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0word/_rels/document.xml.relsPK\0\0\0\ÃHšP-h\Ï\"±\0\0\0*\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0L\0\0_rels/.relsPK\0\0\0\ÃHšP!Z¢„,\0\0\Û\0\0\0\0\0\0\0\0\0\0\0\0\0\0\06\0\0word/theme/theme1.xmlPK\0\0\0\ÃHšP3¯·,\0\0-\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0¥\Z\0\0[Content_Types].xmlPK\0\0\0\0	\0	\0B\0\0\0\0\0\0','taiga,TAIGA','the paths mentioned before reaching Samvisha\'s location covers South-East Asia,Oceania and Europe',1);
/*!40000 ALTER TABLE `question` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `team`
--

LOCK TABLES `team` WRITE;
/*!40000 ALTER TABLE `team` DISABLE KEYS */;
INSERT INTO `team` VALUES (1,'Amaravathi',0,0),(2,'Akhandadweepa',0,0),(3,'Nishadha',0,0),(4,'Aaryavarta',0,0),(5,'Shalwa',0,0),(6,'Mahishaka',0,0),(7,'DevaBhumi',0,0),(8,'Karusha',0,0);
/*!40000 ALTER TABLE `team` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `team_members`
--

LOCK TABLES `team_members` WRITE;
/*!40000 ALTER TABLE `team_members` DISABLE KEYS */;
INSERT INTO `team_members` VALUES (2,'Anant'),(2,'Ananya'),(2,'Girish'),(2,'Mallikarjuna'),(2,'Manoj Reddy'),(2,'Supreetha'),(3,'Akshath'),(3,'Hariprasad'),(3,'Harshith'),(3,'Mithun'),(3,'Shivaraju'),(3,'Subbareddy'),(4,'Abhishek'),(4,'Gayatri'),(4,'Jagadish Dande'),(4,'Sanjay'),(4,'Srikant T'),(4,'Supreeth'),(5,'Jagadeesha K'),(5,'Kushal'),(5,'Prabhu'),(5,'Sabyasachi'),(5,'Vinay Ramakrishna'),(5,'Vivek'),(6,'Anoop'),(6,'Nikhil'),(6,'Shrikanth AK'),(6,'Sowjanya'),(6,'Subham'),(6,'Vinayraj'),(7,'Bikash'),(7,'Chethan'),(7,'Guruprasad'),(7,'Jatinder'),(7,'Karthik'),(7,'Shwetha'),(8,'Bharatesh'),(8,'Jagadish Chinta'),(8,'Madhuri'),(8,'Manoj Dighe'),(8,'Saurabh Garg'),(8,'Thomas');
/*!40000 ALTER TABLE `team_members` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'admin','$2a$10$YkEmZvBWnFRjuvf2QDq.QeKArgg8MCuL3gpXyRfZ1x0LuZTdV0Byi',1,'ADMIN','Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImF1dGhvcml0aWVzIjpbIlJPTEVfQURNSU4iXSwiaWF0IjoxNTg3ODM3NTkwLCJleHAiOjE1ODc4NjYzOTB9.IxQc15xFbwrALGKDlDvFPucrDpeE71eTZRD_O9Rn226FlJmMcHE1Sfm1qkqCCIbhd8oKCZ8BGe5whEK3zENtrw','2020-04-26 01:59:50.595'),(2,'Akhandadweepa','$2a$10$EETLPFfcQXK3/kAOJwzuGuQlCWkBXozGxGVOCGdTtarXYgQZ7FqyK',2,'TEAM','Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJBa2hhbmRhZHdlZXBhIiwiYXV0aG9yaXRpZXMiOlsiUk9MRV9URUFNIl0sImlhdCI6MTU4NzgzNzc0MywiZXhwIjoxNTg3ODY2NTQzfQ.02R76OqsZKVl8LGL7o2B1mbMtUSZmE5sMTe7KQdb2GuqFxdesga6WBy7wTZBHsKHJKBv6GM6eJY6FA1Xgxgo4Q','2020-04-26 02:02:23.373'),(3,'Nishadha','$2a$10$eiOQKl7kox4sx8wTr8.4leXSUKLe4TnK5v6rQiNcNhcZpvIq/WnQa',3,'TEAM',NULL,NULL),(4,'Aaryavarta','$2a$10$UYMTHR1RFwR3yKz0aoLlGuQiK01ScevV5mTz11H9Rc5A/G7ZufwtS',4,'TEAM',NULL,NULL),(5,'Shalwa','$2a$10$NgH8k.fZ1wJvySI02eKfKeYocTMJvQBK/4pFFy3WxDYR.C9POX.jy',5,'TEAM',NULL,NULL),(6,'Mahishaka','$2a$10$elcW.o1vwNnA456NICxvWuA0EJxX2yqTXn4lN7xDdElkDjUleh2bq',6,'TEAM',NULL,NULL),(7,'DevaBhumi','$2a$10$Omj4VWglxB8/kTeZoO2/kuKaW2VP4Zql5JpUnfoKDo91x0yWBTZZa',7,'TEAM',NULL,NULL),(8,'Karusha','$2a$10$X97kerru9tPclJao9lrDqu5/kFmQqpqe12EcjodBY1.85RArz1MhC',8,'TEAM','Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJLYXJ1c2hhIiwiYXV0aG9yaXRpZXMiOlsiUk9MRV9URUFNIl0sImlhdCI6MTU4NzgzNzgxMywiZXhwIjoxNTg3ODY2NjEzfQ.DkLwIRSzBAzBQv4QpD5GbD2f3LjQByasLsn1bDpW6npeA2vUh4Bot866fMYMI0inq9HAs8oKtfbrd8nSYIiuzQ','2020-04-26 02:03:33.337');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-04-26 22:23:03
