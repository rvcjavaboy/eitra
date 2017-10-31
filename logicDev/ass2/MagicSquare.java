/*
@Author:Ranjit Chavan
@Title:Magic Square
@Date :11/9/2017


*/

public class MagicSquare{
	public static void main(String a[]){
	java.util.Scanner s=new java.util.Scanner(System.in);	

	System.out.println("Enter The Matrix Size In N");    
		int num=s.nextInt();
        while(true){
            if(num%2==0){             //accept input as integer matrix size in odd value only 
                System.out.println("Enter Only Odd Size");
                num=s.nextInt();
            }else
                break;


        }
        magic(num);                  //function write the magic square 
    
    }

	



	 public static void magic(int n)
    {
        int[][] ms = new int[n][n];                 //creating matrix with n size
         int i = n/2;                              //first postion value set  
        int j = n-1;
  
        for (int num=1; num <= n*n; num)
        {
            if (i==-1 && j==n) 
            {
                j = n-2;
                i = 0;
            }
            else
            {
                if (j == n)
                    j = 0;
                     
                if (i < 0)
                    i=n-1;
            }
             
            if (ms[i][j] != 0) 
            {
                j -= 2;
                i++;
                continue;
            }
            else
                ms[i][j] = num++; 
                 j++;  i--; 
        }
  
        for(i=0; i<n; i++)         //printing matrix 
        {
            for(j=0; j<n; j++)
                System.out.print(ms[i][j]+" ");
            System.out.println();
        }
        System.out.println("Sum :: "+n*(n*n+1)/2);   //printing sum
        
    }
     

}
