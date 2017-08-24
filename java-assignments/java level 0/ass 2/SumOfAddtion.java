class SumOfAddtion
{
	public static void main(String[] args) 
	{
		int sum=0;
		int a=Integer.parseInt(args[0]);	
		
		int b=Integer.parseInt(args[1]);

		for(int i=a;i<=b;i++){
		sum+=i;
		}
		System.out.println(sum);
	}
}