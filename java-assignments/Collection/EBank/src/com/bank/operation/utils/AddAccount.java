package com.bank.operation.utils;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.bank.account.bean.Account;
import com.bank.data.EBankData;

public class AddAccount {
	
	public static boolean addAccount(Account a) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
			/*System.out.print("Enter Name ::\t");
			a.setName(sc.next());
			System.out.print("Enter Email ::\t");
			a.setEmail(sc.next());
			System.out.print("Enter Phone ::\t");
			a.setPhone(sc.next());*/
			
			HashMap<Integer,Account> hm=EBankData.getBankData();
			 Set entrySet = hm.entrySet();
			  Iterator it = entrySet.iterator();
			  Integer last=0;
			  while(it.hasNext()){
			       Map.Entry me = (Map.Entry)it.next();
			    last= (Integer) me.getKey();
			   }
			a.setAccno(last);
			System.out.println(a.getAccno());
			hm.put(a.getAccno()+1, a);
			System.out.println("All Cccc"+hm);
			
		
			
			
			
			return true;
	}

}
