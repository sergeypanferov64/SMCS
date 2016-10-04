package ru.spanferov.learning.smcs.fee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FeeApplication {

    public static void main(String[] args) {
        System.out.println("fee service application!");
        SpringApplication.run(FeeApplication.class, args);
    }

}
