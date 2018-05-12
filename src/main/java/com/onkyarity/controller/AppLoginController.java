package com.onkyarity.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppLoginController {
	
	public String validateLogin(HttpServletRequest request, HttpServletResponse response) {
		
		return "Success";
	}
}
