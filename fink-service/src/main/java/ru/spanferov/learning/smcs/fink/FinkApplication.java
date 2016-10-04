package ru.spanferov.learning.smcs.fink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FinkApplication {

    public static void main(String[] args) {
        System.out.println("fink service application!");
        SpringApplication.run(FinkApplication.class, args);
    }

}
