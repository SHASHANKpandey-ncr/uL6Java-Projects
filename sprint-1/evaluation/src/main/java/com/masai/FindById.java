package com.masai;

public class FindById {

	public static void main(String[] args) {
		AccountDao dao=new AccountDaoImpl();
		
		Account account= dao.findById(1);
		
		if(account!=null)
		System.out.println(account);
		else 
			System.out.println("Account not found..!!");
	}
	
}
