 /*



@Author:Ranjit Chavan
@Title:Pattern Print

            1 
          1 2 1 
        1 2 3 2 1 
      1 2 3 4 3 2 1 
    1 2 3 4 5 4 3 2 1 
  1 2 3 4 5 6 5 4 3 2 1 
1 2 3 4 5 6 7 6 5 4 3 2 1 

@Date :11/9/2017


*/
public class PatterPrint{
	public static void main(String a[]){

		run(7);                                     //passing size of pattern

	}public static void run(int n){

		for(int i=1;i<=n;i++){

			for(int j=1;j<=(n-i);j++)
				System.out.print("  ");            //spaceing pattern
			

			for(int j=1;j<=i;j++)
				System.out.print(j+" ");          //print the forword value
			
			
			for(int j=i-1;j>=1;j--)
				System.out.print(j+" ");          //print the  backword   value
			


			System.out.println();                 //print the next iteration with next line
		
		}





	}


}
