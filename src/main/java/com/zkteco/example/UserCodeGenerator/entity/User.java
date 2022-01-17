package com.zkteco.example.UserCodeGenerator.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@EntityScan
@Component
@Getter
@Setter
public class User {

	public String inputString;

	public String getUserInputString() {
		return inputString;
	}

	public void setUserInputString(String userInputString) {
		this.inputString = userInputString;
	}
}
