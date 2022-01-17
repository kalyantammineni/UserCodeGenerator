package com.zkteco.example.UserCodeGenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@SpringBootApplication
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserCodeGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserCodeGeneratorApplication.class, args);
		
	}
}
