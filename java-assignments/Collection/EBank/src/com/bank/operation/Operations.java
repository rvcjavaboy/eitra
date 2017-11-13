package com.bank.operation;

import com.bank.account.bean.Account;

public interface Operations {
	
/*	Add Account
	2. Display an Account
	3. Display All Accounts
	4. Remove an Account
	5. withdraw 
	6. deposit 
	7. transfer
	8. search account using name
	9. search account using email
	10. search account using phone*/
	
	public boolean addAccount(Account a);
	public Account displayAccount(int accno);
	public Account[] displayAllAccount();
	public boolean removeAccount(Account a);
	public double withdrawMoney(Account accno,double amount);
	public double  deposite(Account accno,double amount);
	public double  transfer(Account a,int recver_accno,double amount);
	public Account[] searchAccountByName(String name);
	public Account[] searchAccountByEmail(String email);
	public Account[] searchAccountByPhone(String phone);
	
	
	
	
}
