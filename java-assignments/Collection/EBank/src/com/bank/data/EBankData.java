package com.bank.data;
import java.util.HashMap;

import com.bank.account.bean.Account;
public class EBankData {
	private static HashMap <Integer,Account> hm=null;
	private EBankData() {
		hm=new HashMap<Integer,Account>();
	}
	public static HashMap<Integer,Account> getBankData() {
		if(hm==null) 
			new EBankData();
		
		
		
		return hm;
		
		
		
	}
}
