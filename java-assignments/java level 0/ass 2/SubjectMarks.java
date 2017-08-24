class SubjectMarks 
{
	public static void main(String[] args) 
	{	double marks=0;
		for(int i=0;i<args.length;i++)
			marks+=Double.parseDouble(args[i]);	

		double per=marks/args.length;
		if(per >80&& per<101)
			System.out.println("Distination  "+per+" %");
		else if(per>70&&per<81)
			System.out.println("1 St Class"+per+" %");
		else if(per>60&&per<70)
			
			System.out.println("2 St Class"+per+" %");

		else if (per>61&&per<49){
			System.out.println("Pass"+per+" %");
			
		}else{
			System.out.println("Faile"+per+" %");
		
		}
		
		
	}
}
