package com.bank.validation;

public class BankValidation {
	static java.util.Scanner sc=new java.util.Scanner(System.in);
	public static String getName() {
			String name;
	
		do {
			name=sc.next();
			if(name.length()<5)System.out.println("Name should be more than 5 characters");
		}while(name.length()<5);
		
		return name;
		
		
	}public static double getBalance() {
		double  balance;
		
		do {
			balance=sc.nextDouble();
			if(balance<100)System.out.println("balance should be more than 100.");
		}while(balance<100);
		
	
	
	return balance;
	
	
}
	public static String getEmail() {
		String email;
	do{
		email=sc.next();
		if((!email.contains("@")&&!email.contains(".")))
			System.out.println("email should contain . and @");
		
		
	}while((!email.contains("@")&&!email.contains(".")));
	
	
	
	return email;
	
	
}public static String getPhone() {
	String phone;
do{
	phone=sc.next();
	if(phone.length()!=10)
	System.out.println("phone should be of 10 digits.(phone properties is String)⁠⁠⁠⁠");
	
}while(phone.length()!=10);


return phone;


}


}
