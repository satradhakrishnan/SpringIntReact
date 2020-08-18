package com.demo.model;

import java.io.Serializable;
import java.util.List;

public class CityMdl implements Serializable{
	private static final long serialVersionUID = 7789287333610225064L;
	
	
	private int club;
	private String location;
	private double latitude;
	private double logitude;
	private List<WeatherDetail> weatherDetails;
	
	
	public int getClub() {
		return club;
	}
	public void setClub(int club) {
		this.club = club;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLogitude() {
		return logitude;
	}
	public void setLogitude(double logitude) {
		this.logitude = logitude;
	}
	public List<WeatherDetail> getWeatherDetails() {
		return weatherDetails;
	}
	public void setWeatherDetails(List<WeatherDetail> weatherDetails) {
		this.weatherDetails = weatherDetails;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
