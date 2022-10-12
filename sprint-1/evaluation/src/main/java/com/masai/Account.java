package com.masai;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {

	@Id
	private int id;
	
	private String email;
	private String address;
	private double balance;
	
	
	public Account() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "account [id=" + id + ", email=" + email + ", address=" + address + ", balance=" + balance + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double d) {
		this.balance = d;
	}


	public Account(int id, String email, String address, double balance) {
		super();
		this.id = id;
		this.email = email;
		this.address = address;
		this.balance = balance;
	}
	
	
}
