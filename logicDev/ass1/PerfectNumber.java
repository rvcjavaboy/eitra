 /*



@Author:Ranjit Chavan
@Title:Find Perfect Number Range 
@Date :11/9/2017


*/
public class PerfectNumber{

	public static void main(String a[]){

		print(1,500);                                //passing the min and max value to the function
	
	}
	public static void print(int min,int max){

		int sum=0;									//initalizing sum with 0
		
		for(int i=min;i<=max;i++){

			sum=0;									//initalizing sum with 0
			for(int j=1;j<i;j++)
				if(i%j==0)							
					sum+=j;
			
			if(sum==i)								//comparing the sum with number
				System.out.println(i);
		
		}



	}
}
