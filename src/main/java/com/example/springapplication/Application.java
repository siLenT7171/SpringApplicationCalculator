package com.example.springapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@SpringBootApplication
@RestController
@RequestMapping("/calculator/")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @GetMapping("/add")
    public String addition(@RequestParam Map<String,String> requestParams) {
        double num1 = Double.parseDouble(requestParams.get("num1"));
        double num2 = Double.parseDouble(requestParams.get("num2"));
        return "Result - " + (num1 + num2);
    }

    @PostMapping("/subtract")
    public String subtraction(@RequestParam Map<String,String> requestParams) {
        double num1 = Double.parseDouble(requestParams.get("num1"));
        double num2 = Double.parseDouble(requestParams.get("num2"));
        return "Result - " + (num1 - num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam Map<String,String> requestParams) {
        double num1 = Double.parseDouble(requestParams.get("num1"));
        double num2 = Double.parseDouble(requestParams.get("num2"));
        return "Result - " + (num1 * num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam Map<String,String> requestParams) {
        double num1 = Double.parseDouble(requestParams.get("num1"));
        double num2 = Double.parseDouble(requestParams.get("num2"));
        if (num2 == 0) {
            return "Cannot divide by zero";
        }
        return "Result - " + (num1 / num2);
    }
}
