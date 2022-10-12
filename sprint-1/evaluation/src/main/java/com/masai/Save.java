package com.masai;

public class Save {

	public static void main(String[] args) {
		AccountDao dao=new AccountDaoImpl();
		
		String string= dao.save(new Account(1, "sp@gmail.com", "Raipur", 2000));
		
		System.out.println(string);
	}
	
}
