package com.saraya.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saraya.model.Flight;
import com.saraya.repository.FlightRepositoryImpl;

@Service
public class FlightServiceImpl implements FlightService{

	@Autowired
	FlightRepositoryImpl fr;
	
	
	@Override
	public void addFlight(String airlines, String source, String destination, Double fare, LocalDate journeyDate, Integer seatCount) {
		fr.addFlight(airlines,source, destination, fare, journeyDate, seatCount);
	}

	@Override
	public List<Flight> listFlight() {
		return fr.listFlight();
	}

	@Override
	public Flight searchFlight(String source,String destination, LocalDate journeyDate) {
		return fr.searchFlight(source, destination, journeyDate);
	}

}
