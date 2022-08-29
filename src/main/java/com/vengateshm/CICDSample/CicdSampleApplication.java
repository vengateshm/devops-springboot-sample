package com.vengateshm.CICDSample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class CicdSampleApplication {

    @GetMapping
    public String getMessage() {
        return "Application deployed successfully!";
    }

    public static void main(String[] args) {
        System.out.println("From main function!");
        SpringApplication.run(CicdSampleApplication.class, args);
    }

}
