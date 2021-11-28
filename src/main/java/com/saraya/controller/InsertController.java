package com.saraya.controller;

import java.time.LocalDate;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.saraya.model.Flight;
import com.saraya.service.FlightServiceImpl;


@Controller
public class InsertController {

	@Autowired
	FlightServiceImpl fs;
	
	@RequestMapping(value="/add-flight", method=RequestMethod.GET)
	public String addFlight(ModelMap model) {
		model.addAttribute("flight", new Flight());
		return "addFlight";
	}
	
	@RequestMapping(value="/add-flight", method=RequestMethod.POST)
	public String addFlight(ModelMap model, @Valid @ModelAttribute("flight") Flight fly, BindingResult result) {
//		if(result.hasErrors())
//			return "addFlight";
		fs.addFlight(fly.getAirlines(), fly.getSource(), fly.getDestination(), fly.getFare(), fly.getJourneyDate(), fly.getSeatCount());
		model.clear();
		return "redirect:/list-flight";
	}
	@RequestMapping(value="/search-flight", method=RequestMethod.GET)
	public String searchFlight(ModelMap model) {
		model.addAttribute("search", new Flight());
		return "searchFlight";
	}
	
	@RequestMapping(value="/search-flight", method=RequestMethod.POST)
	public String searchFlight(ModelMap model, @Valid @ModelAttribute("search") 
	Flight fly, BindingResult result, @RequestParam String source, @RequestParam String destination, @RequestParam LocalDate journeyDate) {
//		if(result.hasErrors())
//			return "addFlight";
		model.addAttribute("search", fs.searchFlight(source, destination, journeyDate));
		fs.searchFlight(source, destination, journeyDate);
		model.clear();
		return "findSearch";
	}
}
