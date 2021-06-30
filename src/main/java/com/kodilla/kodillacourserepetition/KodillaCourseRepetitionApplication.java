package com.kodilla.kodillacourserepetition;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaCourseRepetitionApplication {

    public static void main(String[] args) {
        SpringApplication.run(KodillaCourseRepetitionApplication.class, args);

        Euklides euklides = new Euklides(100,12);
        euklides.euklidesAlgorithm();
    }
}
