package com.saraya.service;

import java.time.LocalDate;
import java.util.List;

import com.saraya.model.Flight;

public interface FlightService {

	public void addFlight(String airlines, String source, String destination, Double fare, LocalDate journeyDate, Integer seatCount);
	public List<Flight> listFlight();
	public Flight searchFlight(String source,String destination, LocalDate journeyDate);
}
