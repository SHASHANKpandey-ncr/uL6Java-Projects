package com.masai;

public class FindCustomer {

	public static void main(String[] args) {
		CustomerDao dao=new CustomerDaoImpl();
		
		Customer customer=dao.findCustomer(5);
		
		System.out.println(customer.getAddresses());
	}
	
}
