class RandomNumber 
{
	public static void main(String[] args) 
	{

		int len=Integer.parseInt(args[0]);
         java.util.Random r=new java.util.Random();
		for(int i=0;i<len;i++)

		System.out.println(r.nextInt());
	}
}
