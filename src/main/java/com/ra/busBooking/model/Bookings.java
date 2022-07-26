package com.ra.busBooking.model;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Bookings")
public class Bookings {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private int noOfPersons ;
	
	private Double totalCalculated ;
	
	private String filterDate;
	
	private String toDestination;
	
	private String fromDestination;
	
	private String BusName;
	
	private int userId;
	
	private String time;
	
	private String fileName;
	
	private boolean tripStatus;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNoOfPersons() {
		return noOfPersons;
	}

	public void setNoOfPersons(int noOfPersons) {
		this.noOfPersons = noOfPersons;
	}

	public Double getTotalCalculated() {
		return totalCalculated;
	}

	public void setTotalCalculated(Double totalCalculated) {
		this.totalCalculated = totalCalculated;
	}

	public String getFilterDate() {
		return filterDate;
	}

	public void setFilterDate(String filterDate) {
		this.filterDate = filterDate;
	}

	public String getToDestination() {
		return toDestination;
	}

	public void setToDestination(String toDestination) {
		this.toDestination = toDestination;
	}

	public String getFromDestination() {
		return fromDestination;
	}

	public void setFromDestination(String fromDestination) {
		this.fromDestination = fromDestination;
	}

	public String getBusName() {
		return BusName;
	}

	public void setBusName(String busName) {
		BusName = busName;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public boolean isTripStatus() {
		return tripStatus;
	}

	public void setTripStatus(boolean tripStatus) {
		this.tripStatus = tripStatus;
	}
	

}
