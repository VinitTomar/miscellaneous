package com.jwt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	@RequestMapping("/")
	public String homePage(){
		return "index";
	}
	
	@RequestMapping("/language")
	public @ResponseBody String changeLanguage(){
		return "done with changing language";
	}
}
