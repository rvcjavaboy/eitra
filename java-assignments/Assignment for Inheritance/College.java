/**
 * @author Ranjit Chavan
 * @Date Jul 10, 2017
 * @File Name Colleage.java
 */
class Person{
		private String firstName,lastName,address;
		private int id;
		Person(){
			
			
		}
		Person(String firstName,String lastName,String address,int id){
			this.firstName=firstName;
			this.lastName=lastName;
			this.address=address;
			this.id=id;
			
		}
		
		protected String getFirstName() {
			return firstName;
		}
		
		protected void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		
		protected String getLastName() {
			return lastName;
		}
		
		protected void setLastName(String lastName) {
			this.lastName = lastName;
		}
		
		protected String getAddress() {
			return address;
		}
		
		protected void setAddress(String address) {
			this.address = address;
		}
		
		protected int getId() {
			return id;
		}
		
		protected void setId(int id) {
			this.id = id;
		}
		
		
		protected void display(){
			System.out.println("**************Personal Information******************");
			System.out.println("Id :. "+this.getId());
			System.out.println("First Name :. "+this.getFirstName());
			System.out.println("Last Name :. "+this.getLastName());
			System.out.println("Address :. "+this.getAddress());
			
		}
		
		
	
}

class Student extends Person{
	
	private double gpa;
	
	Student(){
		
	}

	Student(double gpa){
		this.gpa=gpa;
		
	}

	/**
	 * @return the gpa
	 */
	public double getGpa() {
		return gpa;
	}

	/**
	 * @param gpa the gpa to set
	 */
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	
	public void display(){
		super.display();
		System.out.println("**************Student Information******************");
		System.out.println("gpa :. "+this.getGpa());
		
		
	}
	
	
}
class Employee extends Person{
	
	private String jobTitle;

	/**
	 * @return the jobTitle
	 */
	Employee(){}
	Employee(String jobTitle){
		
		this.jobTitle=jobTitle;
	}
	
	public String getJobTitle() {
		return jobTitle;
	}

	/**
	 * @param jobTitle the jobTitle to set
	 */
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	public void display(){
		super.display();
		System.out.println("**************Employee Information******************");
		System.out.println("Job Title :. "+this.getJobTitle());
	
		
	}
	
}

public class College {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			java.util.Scanner s=new java.util.Scanner(System.in);
			int ch=0;
			while(ch!=3){
				System.out.println("\n\n\n****************************************************");
				System.out.println("1  Student");
				System.out.println("2  Employee");
				System.out.println("3  Exit");
				ch=s.nextInt();
				if(ch==3)System.exit(1);
				
				
				if(ch==1){
					Student stuObj =new Student();
					System.out.println("Enter Id  :.");stuObj.setId(s.nextInt());
					System.out.println("Enter First Name :.");stuObj.setFirstName(s.next());
					System.out.println("Enter Last Name :.");stuObj.setLastName(s.next());
					System.out.println("Enter Address  :.");stuObj.setAddress(s.next());
					System.out.println("Enter GPA  :.");stuObj.setGpa(s.nextDouble());
					stuObj.display();
					
				}else{
					
					Employee empObj=new Employee();
					System.out.println("Enter Id  :.");empObj.setId(s.nextInt());
					System.out.println("Enter First Name :.");empObj.setFirstName(s.next());
					System.out.println("Enter Last Name :.");empObj.setLastName(s.next());
					System.out.println("Enter Address  :.");empObj.setAddress(s.nextLine());
					System.out.println("Enter Job Title  :.");empObj.setJobTitle(s.next());
					empObj.display();
				}
				System.gc();
				
				
			
			}
			
			
			
			
		
			
			
		
	}

}
