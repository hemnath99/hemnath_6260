package com.bean;

public class Place {
	private String city;

	public Place() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Place(String city) {
		super();
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Place [city=" + city + "]";
	}
	
	
}
