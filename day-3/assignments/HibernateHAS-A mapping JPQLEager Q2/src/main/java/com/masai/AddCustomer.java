package com.masai;

public class AddCustomer {

	public static void main(String[] args) {
		CustomerDao dao=new CustomerDaoImpl();
		Customer customer=new Customer();
		customer.setName("Shyam");
		customer.setMobileNumber("4321567890");
		customer.setEmail("Shyam@gmail.com");
		
		customer.getAddresses()
		.add(new Address("Up", "Agra", "646445", "office"));
		
		customer.getAddresses()
		.add(new Address("Up", "Kanpur", "489656", "home"));
		
		
		dao.addCustomer(customer);
	}
	
}
