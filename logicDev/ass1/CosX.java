 /*



@Author:Ranjit Chavan
@Title:4. CosX .
@Date :11/9/2017


*/
public class CosX{
	public static void main(String a[]){

		System.out.println(print(2,10));
	}
	public static int print(int x,int n){
			/*	
			this method for Calculating Cosx

			*/	
			int add=Math.abs((int)(1-Math.pow(x,2))/fact(x));   //converting negative value to postive

			for(int i=4;i<=n;i=i+2){


				add+=(Math.pow(x,i))/fact(x);                     //calculting the iteration
			}
			return add;
	}



	public static int fact(int x){
		/*	
			this method for Calculating factorial

		*/
		int fact_number=1;
		for(int i=1;i<=x;i++)
			fact_number*=i;

		return fact_number;
	}

}
