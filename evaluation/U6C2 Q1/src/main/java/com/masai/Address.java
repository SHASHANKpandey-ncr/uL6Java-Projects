package com.masai;

public class Address {

	private String city;
	private String state;
	private String pincode;
	public Address(String city, String state, String pincode) {
		super();
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}
	
	
}
