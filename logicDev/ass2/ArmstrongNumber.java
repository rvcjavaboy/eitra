/*
@Author:Ranjit Chavan
@Title:Check Number is ArmstrongNumber
@Date :11/9/2017


*/
public class ArmstrongNumber{

	public static void main(String a[]){

		System.out.println(print(1634));                   //passing the value to the function
	}


	public static boolean print(int num){
		int rem=0,temp=num;
		int a[]=new int[100];
		int size=0;

		while(temp!=0){                              //calculating size of the number
			a[size]=temp%10;						 //storing number into the array
			temp/=10;
			size++;
		}
		
		for(int i=0;i<size;i++)						
			rem+=Math.pow(a[i],size);				//calcualting power of each digit

		if(rem==num)								//comparing rem with num
			return true;							// number is Armstrong


		return false;								//number is not Armstrong


	}

}