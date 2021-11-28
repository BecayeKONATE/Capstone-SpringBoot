package com.saraya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.saraya.service.UserValidation;

@Controller
public class LoginController {

	@Autowired
	UserValidation uv;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginFlight() {
		return "home";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String home(ModelMap model, @RequestParam String username,
			@RequestParam String pswrd) {
		model.addAttribute("user", username);
		boolean valid = uv.isValid(username, pswrd);
		if(valid) {
			return "welcome";
		}else {
			model.addAttribute("errorMessage", "Wrong credential");
			return "redirect:/login";	
		}
	}
	
}
