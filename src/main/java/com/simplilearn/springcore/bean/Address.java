package com.simplilearn.springcore.bean;

public class Address {
	
	private String city;
	private String State;
	private String country;
	
	public Address(String city, String state, String country) {
		super();
		this.city = city;
		State = state;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", State=" + State + ", country=" + country + "]";
	}
	
	


}
