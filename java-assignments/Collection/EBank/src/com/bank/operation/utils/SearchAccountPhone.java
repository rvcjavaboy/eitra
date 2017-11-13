package com.bank.operation.utils;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.bank.account.bean.Account;
import com.bank.data.EBankData;

public class SearchAccountPhone {

public static Account[] searchAccountByEmail(String phone) {
		

		HashMap<Integer, Account> hm=EBankData.getBankData();
		Account a[]=new Account[hm.size()];
		int i=0;
		  Set entrySet = hm.entrySet();
		  Iterator it = entrySet.iterator();
		  while(it.hasNext()){
		       Map.Entry me = (Map.Entry)it.next();
		       if(((Account)me.getValue()).getPhone().equals(phone)) {
		    	a[i]=(Account) me.getValue();
		    	i++;
		       }
		   }
		
		
		return a;
		
	}

}
