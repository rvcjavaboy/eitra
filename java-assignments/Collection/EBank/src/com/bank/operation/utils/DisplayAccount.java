package com.bank.operation.utils;

import java.util.HashMap;

import com.bank.account.bean.Account;
import com.bank.data.EBankData;

public class DisplayAccount {

	public static Account displayAccount(int accno) {
		HashMap<Integer,Account> data=EBankData.getBankData();

		return (Account)data.get(accno);
		
	}

}
