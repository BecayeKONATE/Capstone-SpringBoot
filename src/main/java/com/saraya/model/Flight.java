package com.saraya.model;

import java.time.LocalDate;
import java.util.Objects;

import javax.validation.constraints.Size;

public class Flight {

	private String flightId;
	
	@Size(min = 5, message = "Enter at least 5 digits")
    private String airlines;
    private String source;
    private String destination;
    private Double fare;
    private LocalDate journeyDate;
    private Integer seatCount;
	public Flight() {
	}
	
	public Flight(String flightId, String airlines, String source, String destination, Double fare, LocalDate journeyDate,
			Integer seatCount) {
		this.flightId = flightId;
		this.airlines = airlines;
		this.source = source;
		this.destination = destination;
		this.fare = fare;
		this.journeyDate = journeyDate;
		this.seatCount = seatCount;
	}

	public String getFlightId() {
		return flightId;
	}

	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}

	public String getAirlines() {
		return airlines;
	}

	public void setAirlines(String airlines) {
		this.airlines = airlines;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Double getFare() {
		return fare;
	}

	public void setFare(Double fare) {
		this.fare = fare;
	}

	public LocalDate getJourneyDate() {
		return journeyDate;
	}

	public void setJourneyDate(LocalDate journeyDate) {
		this.journeyDate = journeyDate;
	}

	public Integer getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(Integer seatCount) {
		this.seatCount = seatCount;
	}

	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", airlines=" + airlines + ", source=" + source + ", destination="
				+ destination + ", fare=" + fare + ", journeyDate=" + journeyDate + ", seatCount=" + seatCount + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(flightId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flight other = (Flight) obj;
		return Objects.equals(flightId, other.flightId);
	}

	
    
}
