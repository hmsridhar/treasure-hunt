package com.gigsky.treasurehunt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin(origins = "http://127.0.0.1")
public class TreasureHuntApplication {
    private static final Logger logger= LoggerFactory.getLogger(TreasureHuntApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(TreasureHuntApplication.class, args);
    }

}
