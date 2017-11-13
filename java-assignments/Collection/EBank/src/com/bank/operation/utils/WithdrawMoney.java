package com.bank.operation.utils;

import java.util.HashMap;

import com.bank.account.bean.Account;
import com.bank.data.EBankData;

public class WithdrawMoney {

	public static double withdrawMoney(Account a,double amount) {
		
		HashMap<Integer,Account> hm=EBankData.getBankData();
		
		
		Account ac=(Account)hm.get(a.getAccno());
		if(ac==null) {
			
			return -404;
		}else if(ac.getBalance()-amount<0) {
			return -999; //error signal
			
		}else 
			return  ac.getBalance()-amount;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
