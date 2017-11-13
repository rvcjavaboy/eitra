package com.bank.operation.utils;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.bank.account.bean.Account;
import com.bank.data.EBankData;

public class DisplayAllAccount {

	public static Account[] displayAllAccounts() {
		
		HashMap<Integer, Account> hm=EBankData.getBankData();
		Account a[]=new Account[hm.size()];
		int i=0;
		  Set entrySet = hm.entrySet();
		  Iterator it = entrySet.iterator();
		  while(it.hasNext()){
		       Map.Entry me = (Map.Entry)it.next();
		       a[i]=(Account) me.getValue();
		       a[i].setAccno((Integer) me.getKey());
		       i++;
		   }
		  
		
		return a;
		
		
		
	}
	
	
	
}
