package com.masai;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public interface AccountDao {

	Account findById(int id);
	String save(Account account);
	String update(Account account);
	String remove(int id);
	String withdraw(double amount,int accountId);
	String deposit(double amount,int accountId);

	
}

class AccountDaoImpl implements AccountDao{

	@Override
	public Account findById(int id) {
		EntityManagerFactory factory=
				Persistence.createEntityManagerFactory("accountUnit");
		
		EntityManager em=factory.createEntityManager();
		
		Account account=em.find(Account.class, id);
		
		
		return account;
	}

	@Override
	public String save(Account account) {
		String result="Not saved..!!";
		
		EntityManagerFactory factory=
				Persistence.createEntityManagerFactory("accountUnit");
		
		EntityManager em=factory.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(account);
		
		em.getTransaction().commit();
		
		em.close();
		
		result="saved..!!";
		
		return result;
	}

	@Override
	public String update(Account account) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String remove(int id) {
		String result="Not removed..!!";
		EntityManagerFactory factory=
				Persistence.createEntityManagerFactory("accountUnit");
		
		EntityManager em=factory.createEntityManager();
		
		Account account=em.find(Account.class, id);
		
		if(account!=null) {
		em.getTransaction().begin();
		
		em.remove(account);
		
		em.getTransaction().commit();
		
		em.close();
		
		result="removed..!!";}
		else result="account not found..!!";
			
		
		return result;
		
		
		
	}

	@Override
	public String withdraw(double amount, int accountId) {
		String string="withdraw not done..!!";
		EntityManagerFactory factory=
				Persistence.createEntityManagerFactory("accountUnit");
		
		EntityManager em=factory.createEntityManager();
		
		Account account=em.find(Account.class, accountId);
		
		if(account!=null) {
			
			em.getTransaction().begin();
			
			account.setBalance(account.getBalance()-amount);
			
			em.getTransaction().commit();
			
			em.close();
			
			string="withdraw done..!!";
			
		}
		else string="account not found..!!";
		
		
		return string;
	}

	@Override
	public String deposit(double amount, int accountId) {
		String string="deposit not done..!!";
		EntityManagerFactory factory=
				Persistence.createEntityManagerFactory("accountUnit");
		
		EntityManager em=factory.createEntityManager();
		
		Account account=em.find(Account.class, accountId);
		
		if(account!=null) {
			
			em.getTransaction().begin();
			
			account.setBalance(account.getBalance()+amount);
			
			em.getTransaction().commit();
			
			em.close();
			
			string="deposit done..!!";
			
		}
		else string="account not found..!!";
		
		
		return string;
	}
	
}
