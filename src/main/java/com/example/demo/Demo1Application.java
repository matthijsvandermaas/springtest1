package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;

import static org.springframework.boot.autoconfigure.SpringBootApplication.*;

@SpringBootApplication

public class Demo1Application {
    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);

    }
}
