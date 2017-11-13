import javax.security.auth.login.AccountNotFoundException;

import com.bank.account.bean.Account;
import com.bank.exception.InsufficientBalanceExceptions;
import com.bank.exception.InvalidAccountExceptions;
import com.bank.operation.AccountUtils;

import com.bank.validation.BankValidation;

public class Tester {

	public Tester() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String a1[]) {
		Account a=new Account();
		java.util.Scanner sc=new java.util.Scanner(System.in);
		AccountUtils autil=new AccountUtils();
		int ch=0;
		do {
			/*
			1. Add Account
			2. Display an Account
			3. Display All Accounts
			4. Remove an Account
			5. withdraw 
			6. deposit 
			7. transfer
			8. search account using name
			9. search account using email
			10. search account using phone
			11. exit.*/
			
			System.out.println("1. Add Account");
			System.out.println("2. Display an Account");
			System.out.println("3. Display All Accounts");
			System.out.println("4. Remove an Account");
			System.out.println("5. withdraw ");
			System.out.println("6. deposit ");
			System.out.println("7. transfer");
			System.out.println("8. search account using name");
			System.out.println("9. search account using email");
			System.out.println("10. search account using phone");
			System.out.println("11. exit.");
			ch=sc.nextInt();
			double res=0;
			switch(ch) {
			
				case 1:
					a=new Account();
					System.out.println("*************Add Account**********");
					System.out.print("Enter Name ::\t");
					a.setName(BankValidation.getName());
					System.out.print("\nEnter Email ::\t");
					a.setEmail(BankValidation.getEmail());
					System.out.print("\nEnter Phone ::\t");
					a.setPhone(BankValidation.getPhone());
					System.out.print("\n Add Balance ::\t");
					a.setBalance(BankValidation.getBalance());
					
					autil.addAccount(a);
					
				break;

				case 2:
					a=new Account();
					System.out.println("*************Display Account**********");
					System.out.print("Enter Account No ::\t");
					a.setAccno(sc.nextInt());
					System.out.println();
					
					Account dis=autil.displayAccount(a.getAccno());

					if(dis==null) {
						try {
						throw new AccountNotFoundException("Account Not Found");
						
						}catch(AccountNotFoundException e) {
							System.out.println(e);
							
							
						}}else {
							System.out.println(" Account No::\t"+dis.getAccno());
							System.out.println(" Name::\t"+dis.getName());
							System.out.println(" Email::\t"+dis.getEmail());
							System.out.println(" Phone::\t"+dis.getPhone());
							System.out.println(" Balance::\t"+dis.getBalance());
						}
					
					
				break;
				case 3:
					
					Account accounts[]=autil.displayAllAccount();
					System.out.println("*************Display All Accounts**********");
					for(int i=0;i<accounts.length;i++) {
						System.out.println(" Account No::\t"+accounts[i].getAccno());
						System.out.println(" Name::\t"+accounts[i].getName());
						System.out.println(" Email::\t"+accounts[i].getEmail());
						System.out.println(" Phone::\t"+accounts[i].getPhone());
						System.out.println(" Balance::\t"+accounts[i].getBalance());
					System.out.println("--------------------------------------------");;
					}
					
				break;
				case 4:
					a=new Account();
					
					System.out.println("*************Remove Account**********");
					System.out.println("Enter Account No::\t");
					a.setAccno(sc.nextInt());
					
					if(!autil.removeAccount(a)) {
						try {
						throw new AccountNotFoundException("Account Not Found");
						}catch(AccountNotFoundException e) {
							System.out.println(e);
							
							
						}		
					}
						
					
				break;
				case 5:
					a=new Account();
					
					System.out.println("*************Withdraw **********");
					System.out.println("Enter Account No::\t");
					a.setAccno(sc.nextInt());
					System.out.println("Withdraw Amount ::\t");
					double amount=sc.nextDouble();
					
					if((res=autil.withdrawMoney(a, amount))==-999) {
						
						try{
							throw new InsufficientBalanceExceptions("InsufficientBalance Account");
						}catch(InsufficientBalanceExceptions e) {
							System.out.println(e);
						}
					}else {
						System.out.print("Withdraw Sucessfully");
						System.out.println("Available Balance::\t"+res);
					}
				break;
				case 6:
					a=new Account();
					System.out.println("*************Depsite **********");
					System.out.println("Enter Account No::\t");
					a.setAccno(sc.nextInt());
					System.out.println("Deposite Amount ::\t");
					amount=sc.nextDouble();	
					if((res=(autil.deposite(a, amount)))==-999999) {
						try {
							throw new InvalidAccountExceptions("InvalidAccount");
							
						}catch(InvalidAccountExceptions e) {
							System.out.println(e);
						}
					}else {
						System.out.print("Depsite Sucessfully");
						System.out.println("Available Balance::\t"+res);
					}
					
					
				break;
				case 7:
					a=new Account();
					System.out.println("*************Depsite **********");
					System.out.println("Enter Account No::\t");
					a.setAccno(sc.nextInt());
					System.out.println("Deposite Person Account No::\t");
					int rec_accno = sc.nextInt();
					
					System.out.println("Deposite Amount ::\t");
					amount=sc.nextDouble();	
					res=autil.transfer(a, rec_accno, amount);
					if(res==-404) {
						try {
							throw new AccountNotFoundException("Account Not found");
						}catch(AccountNotFoundException e) {
							System.out.println(e);
						}
					}else if(res==-777) {
						try {
							throw new InvalidAccountExceptions("Reciver Account not found");
						}catch(InvalidAccountExceptions e) {
							System.out.println(e);;
						}
					}else if(res==-999) {
						try {
							throw new InsufficientBalanceExceptions("InsufficientBalance");
						}catch(InsufficientBalanceExceptions e) {
							System.out.println(e);;
						}
					}else {
						System.out.println("Transaction Sucessfully Completed !!!!!!!1");;
					}
					
					
				break;
				case 8:
					
					 
					System.out.println("*************Search By Name**********");
					System.out.println("Enter Name ::\t");
					
					accounts=autil.searchAccountByName(BankValidation.getName());
					for(int i=0;i<accounts.length;i++) {
						if(accounts[i]!=null) {
						System.out.println(" Account No::\t"+accounts[i].getAccno());
						System.out.println(" Name::\t"+accounts[i].getName());
						System.out.println(" Email::\t"+accounts[i].getEmail());
						System.out.println(" Phone::\t"+accounts[i].getPhone());
						System.out.println(" Balance::\t"+accounts[i].getBalance());
					System.out.println("--------------------------------------------");;
					}
					}
				break;
				case 9:
					System.out.println("*************Search By Email**********");
					System.out.println("Enter Email ::\t");
				
					accounts=autil.searchAccountByEmail(BankValidation.getEmail());
					for(int i=0;i<accounts.length;i++) {
						if(accounts[i]!=null) {
						System.out.println(" Account No::\t"+accounts[i].getAccno());
						System.out.println(" Name::\t"+accounts[i].getName());
						System.out.println(" Email::\t"+accounts[i].getEmail());
						System.out.println(" Phone::\t"+accounts[i].getPhone());
						System.out.println(" Balance::\t"+accounts[i].getBalance());
					System.out.println("--------------------------------------------");;
					}
					}
					
				break;
				case 10:
					System.out.println("*************Search By Phone**********");
					System.out.println("Enter Phone ::\t");
				
					accounts=autil.searchAccountByPhone(BankValidation.getPhone());
					for(int i=0;i<accounts.length;i++) {
						if(accounts[i]!=null) {
						System.out.println(" Account No::\t"+accounts[i].getAccno());
						System.out.println(" Name::\t"+accounts[i].getName());
						System.out.println(" Email::\t"+accounts[i].getEmail());
						System.out.println(" Phone::\t"+accounts[i].getPhone());
						System.out.println(" Balance::\t"+accounts[i].getBalance());
						System.out.println("--------------------------------------------");;
					}
					}
					
				break;
				case 11:
					System.exit(0);
					
				break;
			
			
			}
			
			
		}while(ch!=11);
		
		
	}

}
