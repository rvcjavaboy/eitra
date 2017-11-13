package com.bank.operation.utils;

import java.util.HashMap;

import com.bank.account.bean.Account;
import com.bank.data.EBankData;

public class TransferAmount {

	public static double transferAmount(Account a,int  rec_acc,double amount) {
		
		
		HashMap<Integer,Account> hm=EBankData.getBankData();
		
		
		Account ac=(Account)hm.get(a.getAccno());
		Account ac_rec=(Account)hm.get(rec_acc);
		if(ac==null) {
			
			return -404;
		}else if(ac_rec==null) {
			return -777;
			
		}
		else if(ac.getBalance()-amount<0) {
			return -999; //error signal
			
		}else 
			ac.setBalance((ac.getBalance()-amount));
			ac_rec.setBalance(ac_rec.getBalance()+amount);
			hm.put(ac.getAccno(),ac );
			hm.put(ac_rec.getAccno(),ac_rec);
			return 202;
		
		
		
		
		
	}

}
