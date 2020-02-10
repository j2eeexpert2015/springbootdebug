package com.example.Helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration(exclude = HibernateJpaAutoConfiguration.class)
@SpringBootApplication
@RestController
public class HelloworldApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(HelloworldApplication.class, args);
	}
	
	@RequestMapping(value = "/")
	public String hello()
	{
		return "Hello World";
	}


}
