class CommandLineLarge
{
	public static void main(String[] args) 
	{
		int max=0;
		for(int i=0;i<args.length;i++)
			if(max<Integer.parseInt(args[i]))
				max=Integer.parseInt(args[i]);
			
	System.out.println("Max Number:. "+max);
	}
}
