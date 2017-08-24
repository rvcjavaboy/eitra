class Occurance 
{
	public static void main(String[] args) 
	{
		char a[]=args[0].toCharArray();
		char ser[]=args[1].toCharArray();
		int len=0;
		for(char element :a){
			if(element==ser[0])
				len++;
		}
		
		System.out.println("Occurance:.."+len);
	}
}
