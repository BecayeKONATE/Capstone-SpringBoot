package com.saraya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.saraya.service.FlightServiceImpl;

@Controller
public class ListController {

	@Autowired
	FlightServiceImpl fs;
	
	@RequestMapping(value="/list-flight", method=RequestMethod.GET)
	public String flightList(ModelMap model) {
		model.addAttribute("flights", fs.listFlight());
		return "listFlight";
	}
}
