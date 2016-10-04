package ru.spanferov.learning.smcs.rent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RentApplication {

    public static void main(String[] args) {
        System.out.println("rent service application!");
        SpringApplication.run(RentApplication.class, args);
    }

}
