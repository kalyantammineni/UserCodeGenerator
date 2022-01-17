package com.zkteco.example.UserCodeGenerator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zkteco.example.UserCodeGenerator.entity.User;
import com.zkteco.example.UserCodeGenerator.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;

	@RequestMapping(value = "/result", method = RequestMethod.GET)
	   public String getComputedString() {
	      return userService.getComputedString();
	   }
	@RequestMapping(value = "/post", method = RequestMethod.POST)
	public String setComputedString(@RequestBody User user) {
//		return new ResponseEntity<>(userService.setComputedString(), HttpStatus.OK);
		userService.setComputedString(user.getUserInputString());
		return "Request sent: "+user.getUserInputString();
	}
}
