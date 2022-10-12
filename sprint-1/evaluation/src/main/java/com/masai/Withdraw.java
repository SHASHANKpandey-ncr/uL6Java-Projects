package com.masai;

public class Withdraw {

	public static void main(String[] args) {
		AccountDao dao=new AccountDaoImpl();
		
		String str= dao.withdraw(100, 1);
		
		
			System.out.println(str);
	}
	
}
