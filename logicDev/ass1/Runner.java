 /*



@Author:Ranjit Chavan
@Title:4. Find the second fastest runner person’s name and time.
@Date :11/9/2017


*/

 class Student {                                
	/*
		Data Structure for storing value
		with gets and sets
	*/
	private String name;
	private int runing;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRuning() {
		return runing;
	}
	public void setRuning(int runing) {
		this.runing = runing;
	}

}



public class Runner{
	public static void main(String a[]){
	java.util.Scanner sc=new java.util.Scanner(System.in);	 //creating scanner object
	System.out.println("Enter The Number of Size ");        //entering the size of entery    
		Student s[]=new Student[sc.nextInt()];
		for(int i=0;i<s.length;i++){
			s[i]=new Student();
			System.out.println("Enter The Name ::");		//accept the name
			s[i].setName(sc.next());
			System.out.println("Enter The Running ::");		//accept speed
			s[i].setRuning(sc.nextInt());
		}
		System.out.println("second fastest runner persons time. "+getSecondNext(s));  //calculating second lagreget time
	}
	
	public static int getSecondNext(Student []s){
		/*
			method for calculating second  larget  number

		*/
		int min=s[0].getRuning();		//initalizing min and max with first value 
		int max=s[0].getRuning();
		for(int i=0;i<s.length;i++){

			if(s[i].getRuning()>max){	//comparing the value of next iternation to the max
				min=max;
				max=s[i].getRuning();
			}if(s[i].getRuning()>min&&s[i].getRuning()!=max) 
				min=s[i].getRuning();

			

		}
		return min;   //returing the min value
	} 

}