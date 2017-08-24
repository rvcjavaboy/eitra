class Pattern3 
{
	public static void main(String[] args) 
	{	
	    int n=7, i, j, len=1;
 		
        len = n-1;
		
        for(j=1; j<=n; j++)
        {
            for(i=1; i<=len; i++)
            {
                System.out.print(" ");
            }
            len--;
            for(i=1; i<=(2*j-1); i++)
            {
                System.out.print("#");
            }
            System.out.println();
        }
		
        len = 1;
		
        for(j=1; j<=(n-1); j++)
        {
            
			
			for(i=1; i<=len; i++)
            {
                System.out.print(" ");
            }
            len++;

            for(i=1; i<=(2*(n-j)-1); i++)
            {
                System.out.print("#");
            }
            System.out.println();
        }
		
    }
}
	
