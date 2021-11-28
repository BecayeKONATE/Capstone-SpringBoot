package com.saraya.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.saraya.model.Flight;

@Repository("flightRepository")
public class FlightRepositoryImpl implements FlightRepository{

	private static List<Flight> listFlight = new ArrayList<>();
	private static int id = 20;
	private static String count = "1001-" + ++id;
	
	static {
		listFlight.add(new Flight("1001-1","Senegal Airlines","Senegal","New York",1000.00,LocalDate.of(2022, 12, 3),76));
		listFlight.add(new Flight("1001-2","Senegal Airlines","Senegal","New York",1000.00,LocalDate.of(2022, 12, 3),76));
		listFlight.add(new Flight("1001-3","Senegal Airlines","Senegal","New York",1000.00,LocalDate.of(2022, 12, 3),76));
		listFlight.add(new Flight("1001-4","Senegal Airlines","Senegal","New York",1000.00,LocalDate.of(2022, 12, 3),76));
		listFlight.add(new Flight("1001-5","Senegal Airlines","Senegal","New York",1000.00,LocalDate.of(2022, 12, 3),76));
		listFlight.add(new Flight("1001-6","Senegal Airlines","Senegal","New York",1000.00,LocalDate.of(2022, 12, 3),76));
		listFlight.add(new Flight("1001-7","Senegal Airlines","Senegal","New York",1000.00,LocalDate.of(2022, 12, 3),76));
		listFlight.add(new Flight("1001-8","Senegal Airlines","Senegal","New York",1000.00,LocalDate.of(2022, 12, 3),76));
		listFlight.add(new Flight("1001-9","Senegal Airlines","Senegal","New York",1000.00,LocalDate.of(2022, 12, 3),76));
		listFlight.add(new Flight("1001-10","Senegal Airlines","Senegal","New York",1000.00,LocalDate.of(2022, 12, 3),76));
		listFlight.add(new Flight("1001-11","Senegal Airlines","Senegal","New York",1000.00,LocalDate.of(2022, 12, 3),76));
		listFlight.add(new Flight("1001-12","Senegal Airlines","Senegal","New York",1000.00,LocalDate.of(2022, 12, 3),76));
		listFlight.add(new Flight("1001-13","Senegal Airlines","Senegal","New York",1000.00,LocalDate.of(2022, 12, 3),76));
		listFlight.add(new Flight("1001-14","Senegal Airlines","Senegal","New York",1000.00,LocalDate.of(2022, 12, 3),76));
		listFlight.add(new Flight("1001-15","Senegal Airlines","Senegal","New York",1000.00,LocalDate.of(2022, 12, 3),76));
		listFlight.add(new Flight("1001-16","Senegal Airlines","Senegal","New York",1000.00,LocalDate.of(2022, 12, 3),76));
		listFlight.add(new Flight("1001-17","Senegal Airlines","Senegal","New York",1000.00,LocalDate.of(2022, 12, 3),76));
		listFlight.add(new Flight("1001-18","Senegal Airlines","Senegal","New York",1000.00,LocalDate.of(2022, 12, 3),76));
		listFlight.add(new Flight("1001-19","Senegal Airlines","Senegal","New York",1000.00,LocalDate.of(2022, 12, 3),76));
		listFlight.add(new Flight("1001-20","Senegal Airlines","Senegal","New York",1000.00,LocalDate.of(2022, 12, 3),76));
	}
	
	
	
	@Override
	public void addFlight(String airlines, String source, String destination, Double fare, LocalDate journeyDate, Integer seatCount) {
		listFlight.add(new Flight(count,airlines,source, destination, fare, journeyDate, seatCount));
		
	}

	@Override
	public List<Flight> listFlight() {
		return listFlight;
	}

	@Override
	public Flight searchFlight(String source, String destination, LocalDate journeyDate) {
		List<Flight> list = new ArrayList<>();
		for(Flight fly : listFlight) {
			if(fly.getSource() == source && fly.getDestination() == destination 
					&& fly.getJourneyDate().equals(journeyDate)) { 
				list.add(fly);
				if(fly.getJourneyDate().getMonth().equals("December") || 
						fly.getJourneyDate().getMonth().equals("January")) {
					fly.setFare(fly.getFare() + fly.getFare()*20/100);
				}
				return (Flight) list;
			}
		}
		return null;
	}

	
}
