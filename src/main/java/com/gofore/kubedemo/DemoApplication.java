package com.gofore.kubedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import java.time.*;
import java.time.format.*;


@RestController
@SpringBootApplication
public class DemoApplication {

	
	@GetMapping("/")
	String home() {
	    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	    LocalDateTime now = LocalDateTime.now();
	    System.out.println(dtf.format(now)); //2016/11/16 12:08:43
		return "Current time is: " + dtf.format(now) + " and I'm happy to announce that Spring is here! Delivered by Gitlab";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
