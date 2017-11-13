package com.bank.operation.utils;

import java.util.HashMap;

import com.bank.account.bean.Account;
import com.bank.data.EBankData;

public class DepositeMoney {

	public static double depositMoney(Account a,double amount) {
		
		HashMap<Integer, Account> hm=EBankData.getBankData();
		
		Account newa=(Account)hm.get(a.getAccno());
		if(newa==null) {
			
			return -999999; // error code
		}
		
		newa.setBalance(a.getBalance()+amount);
		hm.put(a.getAccno(), newa);
		return newa.getBalance();
		
		
		
	}

}
