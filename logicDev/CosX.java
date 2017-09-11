/*
@Author:Ranjit Chavan
@Title:CosX
@Date :11/9/2017


*/
public class CosX{
	public static void main(String a[]){

		System.out.println(print(2,10));
	
	}
	
	public static int print(int x,int n){
			
			int add=Math.abs((int)(1-Math.pow(x,2))/fact(x));

			for(int i=4;i<=n;i=i+2){


				add+=(Math.pow(x,i))/fact(x);
			}
			return add;
	}

	public static int fact(int x){
		int fact_number=1;
		for(int i=1;i<=x;i++)
			fact_number*=i;

		return fact_number;
	}

}