package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/")
    String displayDefaultMessage() {
        return "Hello World, Spring Boot!";
    }
    
    @GetMapping("/hello")
    String displayDefaultMessageWithParameter(@RequestParam String input) {
    	if(input==null)
    	{
    		input="NA";
    	}
        return "Hello World, input is :"+input+" !!!!!";
    }

}