 /*



@Author:Ranjit Chavan
@Title:Prime Range 
@Date :11/9/2017


*/
public class PrimeRange{
	public static void main(String a[]){
	
		print(1,20);     //passing min and max range to the function	
	}

	public static void print(int min,int max){
		boolean flag=true;
		for(int i=min;i<=max;i++){
			if(i==1||i==2)
				System.out.println(i);                         //print 1 and 2 defualt prime number
			else{
				flag=true;
				for(int j=2;j<=i/2;j++){
					if(i%j==0){
						flag=false;                             //checking prime number or not
						continue;
					}

				}
				if(flag)
					System.out.println(i);            //printing prime number
				

			}


		}
	}
}
