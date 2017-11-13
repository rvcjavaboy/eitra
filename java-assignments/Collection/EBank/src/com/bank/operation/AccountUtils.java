package com.bank.operation;

import com.bank.account.bean.Account;
import com.bank.operation.utils.AddAccount;
import com.bank.operation.utils.DepositeMoney;
import com.bank.operation.utils.DisplayAccount;
import com.bank.operation.utils.DisplayAllAccount;
import com.bank.operation.utils.RemoveAccount;
import com.bank.operation.utils.SearchAccountEmail;
import com.bank.operation.utils.SearchAccountName;
import com.bank.operation.utils.SearchAccountPhone;
import com.bank.operation.utils.TransferAmount;
import com.bank.operation.utils.WithdrawMoney;

public class AccountUtils implements Operations{

	public boolean addAccount(Account a) {
		
		return AddAccount.addAccount(a);
	}

	public Account displayAccount(int accno) {
		
		return DisplayAccount.displayAccount(accno);
	}

	public Account[] displayAllAccount() {
		// TODO Auto-generated method stub
		return DisplayAllAccount.displayAllAccounts();
	}

	public boolean removeAccount(Account a) {
		
		return RemoveAccount.removeAccount(a);
	}
	
	public double withdrawMoney(Account accno, double amount) {
		// TODO Auto-generated method stub
		
		return WithdrawMoney.withdrawMoney(accno, amount);
	}

	public double deposite(Account accno, double amount) {
		// TODO Auto-generated method stub
		return DepositeMoney.depositMoney(accno, amount);
	}

	public double transfer(Account accno, int recver_accno, double amount) {
		// TODO Auto-generated method stub
		
		
		return TransferAmount.transferAmount(accno, recver_accno, amount);
	}

	public Account[] searchAccountByName(String name) {
		// TODO Auto-generated method stub
		return SearchAccountName.searchAccountByNames(name);
	}

	public Account[] searchAccountByEmail(String email) {
		// TODO Auto-generated method stub
		return SearchAccountEmail.searchAccountByEmail(email);
	}

	public Account[] searchAccountByPhone(String phone) {
		// TODO Auto-generated method stub
		return SearchAccountPhone.searchAccountByEmail(phone);
	}

	

}
