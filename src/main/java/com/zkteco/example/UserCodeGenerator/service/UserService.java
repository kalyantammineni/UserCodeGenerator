package com.zkteco.example.UserCodeGenerator.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.stereotype.Service;

import com.zkteco.example.UserCodeGenerator.entity.User;

@Service
public class UserService {
	
	String inputString;
	ArrayList<User> usersList  = new ArrayList<>();
	public String getComputedString() {
		User usr = usersList.get(0);
//		inputString = "AAbAcccDffD";
		if(null==usr || null==usr.getUserInputString()) {
			return "No input string provided, Please provide an input to compute its characters";
		}
		
		Map<Character, Integer> resultMap = new HashMap<Character, Integer>();
		Map<String, Integer> repeatedCharsMap = new HashMap<String, Integer>();
		StringBuilder resultString = new StringBuilder();
		int count = 1;
		char character = ' ';
		char previous = ' ';
		inputString = usr.getUserInputString();
		for (int i = 0; i < inputString.length(); i++) {

			character = inputString.charAt(i);
			if (previous == character) {
				count++;
				resultMap.put(character, count);
			} else {

				count = 1;
				if (resultMap.containsKey(character)) {
					repeatedCharsMap.put(character + "" + count, i);
				} else {

					resultMap.put(character, count);
				}

			}

			previous = inputString.charAt(i);
		}

		for (Entry<Character, Integer> entry : resultMap.entrySet()) {
			resultString.append(entry.getKey());
			resultString.append(entry.getValue());
		}

		System.out.println("Count Alphabets method !!" + resultMap.toString());
		System.out.println("Count Alphabets method: " + resultString.toString());
		return resultString.toString();
	}

	public Object setComputedString(String inputString) {
		User user = new User();
		user.setUserInputString(inputString);
		usersList.add(user);
		return "User string has been set";
	}

}
