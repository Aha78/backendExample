package com.example.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;

@RestController
 class HelloController {

	@GetMapping("/")
	public String index() {
		return "Greetings2 from Spring Boot!";
	}

	@CrossOrigin(origins = "*")
	@RequestMapping("/api/summary")
	public ResponseEntity<DetailsRow> hello1() throws ClassNotFoundException, SQLException {
		DetailsBla details=new DetailsBla();
		return  ResponseEntity.ok(details.getDetails());
	}

}
@SpringBootApplication
public class BackendApplication {


	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

}
