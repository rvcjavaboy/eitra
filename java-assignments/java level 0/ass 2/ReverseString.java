class ReverseString 
{
	public static void main(String[] args) 
	{
		String input="Ranjit";
		char in[]=input.toCharArray();
		char out[]=new char[in.length];
		int size=in.length-1;

		for(int i=0;i<in.length;i++){
		
			out[size]=in[i];

		size--;
		}
			for(char c:out)
			System.out.print(c);
		System.out.println();
	}
}
