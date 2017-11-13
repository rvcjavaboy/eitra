package com.bank.operation.utils;

import java.util.HashMap;

import com.bank.account.bean.Account;
import com.bank.data.EBankData;

public class RemoveAccount {

	public static boolean removeAccount(Account a) {
		HashMap<Integer,Account> hm=EBankData.getBankData();
		Account ac=hm.remove(a.getAccno());
		
		if(ac==null) 
			return false;
		return true;
		
	}

}
