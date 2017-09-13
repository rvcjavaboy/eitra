/*
@Author:Ranjit Chavan
@Title:1. Write program to find whether a string is Palindrome 
		  or not without using String Functions.
@Date:12/9/2017		   

*/

public class Palidroma{
	/*
		this class for string palidroma checking
	*/
	public static void main(String a[]){

		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.print("Enter The String::");
		String str=s.next();


		char start[]=str.toCharArray();     //string converted into char array
		int j=start.length-1;          
		boolean flag=true;
		for(int i=0;i<start.length;i++){   //comparing charter 
	 		if(start[i]!=start[j])
				flag=false;

			j--;
		}

		if(flag)
			System.out.println("String is Palidroma !!!!!!!");
		else
			System.out.println("String not is Palidroma !!!!!");
			
	}

}