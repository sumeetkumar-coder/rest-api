package com.sumeet.webservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sumeet.webservice.exception.NoResourceFoundException;
import com.sumeet.webservice.model.User;

@RestController
public class UserDetails {

	@GetMapping(value = "/rest/getUserDetails", consumes = "application/json", produces = "application/json")
	public User getUserDetails(@RequestParam(name = "userName") String userName) {

		if ("sumeet".equalsIgnoreCase(userName)) {
			return new User.UserBuilder("sumeet").addAddress("Thane").addContactNo(9619222065L).build();
		}

		throw new NoResourceFoundException("Resource not found :" + userName);

	}

}
