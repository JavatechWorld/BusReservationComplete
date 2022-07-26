package com.ra.busBooking.DTO;

import java.sql.Date;

public class ReservationDTO {

	
	private String filterDate;
	
	private String to;
	
	private String from;


	public String getFilterDate() {
		return filterDate;
	}

	public void setFilterDate(String filterDate) {
		this.filterDate = filterDate;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}
	
	
	
}
