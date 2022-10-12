package com.masai;

public class Remove {

	public static void main(String[] args) {
		AccountDao dao=new AccountDaoImpl();
		
		String str= dao.remove(1);
		
		
			System.out.println(str);
	}
	
}
