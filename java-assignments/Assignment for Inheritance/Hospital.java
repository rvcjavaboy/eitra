

import java.util.Calendar;

/**
 * 
 */

/**
 * @author Ranjit Chavan
 * @Date Jul 10, 2017
 * @File Name Hospital.java
 */
class Person{
	
	private String firstName,lastName,gender;
	private int age,id;
	
	/**
	 * @return the id
	 */
	protected int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	protected void setId(int id) {
		this.id = id;
	}

	Person(int id,String firsName,String lastName,String gender,int age){
		this.id=id;
		this.firstName=firsName;
		this.lastName=lastName;
		this.gender=gender;
		this.age=age;
		
	}
	
	/**
	 * @return the firstname
	 */
	protected String getFirstname() {
		return firstName;
	}
	/**
	 * @param firstname the firstname to set
	 */
	protected void setFirstname(String firstname) {
		this.firstName = firstname;
	}
	/**
	 * @return the lastname
	 */
	protected String getLastname() {
		return lastName;
	}
	/**
	 * @param lastname the lastname to set
	 */
	protected void setLastname(String lastname) {
		this.lastName = lastname;
	}
	/**
	 * @return the gender
	 */
	protected String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	protected void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the age
	 */
	protected int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	protected void setAge(int age) {
		this.age = age;
	}
	
	protected void display(){
		
		System.out.println("**************Personal Information******************");
		System.out.println("Id :. "+this.getId());
		System.out.println("First Name :. "+this.firstName);
		System.out.println("Last Name :. "+this.getLastname());
		System.out.println("Gender :. "+this.getGender());
		System.out.println("Age :. "+this.getAge());
		
		
	}
	
}

class Paitent extends Person{

	int yearOfJoin;
	private String hospitalName;
	/**
	 * @return the yearOfJoin
	 */
	protected int getYearOfJoin() {
		return yearOfJoin;
	}
	/**
	 * @return the hospitalName
	 */
	protected String getHospitalName() {
		return hospitalName;
	}
	/**
	 * @param hospitalName the hospitalName to set
	 */
	protected void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	/**
	 * @param yearOfJoin the yearOfJoin to set
	 */
	protected void setYearOfJoin(int yearOfJoin) {
		this.yearOfJoin = yearOfJoin;
	}
	/**
	 * @param firsName
	 * @param lastName
	 * @param gender
	 */
	
	Paitent(String firsName, String lastName, String gender,int id,String hospitalName,int yearOfJoin,int age) {
		super(id,firsName, lastName, gender,age);
		// TODO Auto-generated constructor stub
		this.hospitalName=hospitalName;
		this.yearOfJoin=yearOfJoin;
	
	}
	protected void display(){
		
		super.display();

		System.out.println("Hospital Name :. "+this.getHospitalName());
		System.out.println("Year of Join :. "+this.getYearOfJoin());
		
	}
	
	
}class Money extends Paitent{

	/**
	 * @param firsName
	 * @param lastName
	 * @param gender
	 * @param id
	 * @param hospitalName
	 * @param yearOfJoin
	 */
	private double basicPerYear;
	
	Money(String firsName, String lastName, String gender, int id, String hospitalName, int yearOfJoin,int age,double basicPerYear) {
		super(firsName, lastName, gender, id, hospitalName, yearOfJoin,age);
		this.basicPerYear=basicPerYear;
		// TODO Auto-generated constructor stub
		
	}
	public double amountPay(){
		this.display();
		Calendar now = Calendar.getInstance();   // Gets the current date and time
		int year = now.get(Calendar.YEAR); 
		
		int year1=year-yearOfJoin;
		if(year==0){return 1*basicPerYear;}
		return year1*basicPerYear;
	}
	
	

	
	
	
	
	
}
public class Hospital {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firsName;
		 String lastName, gender = null, hospitalName;
		int id,yearOfJoin,age; 
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.println("Enter  Id :.");id=s.nextInt();
		System.out.println("Enter First Name:.");firsName=s.next();
		
		System.out.println("Enter Last Name:.");lastName=s.next();
		System.out.println("Enter Gender Name:.");int ch=0;
			while(ch!=1||ch!=2){
				System.out.println("1 Male");
				System.out.println("2 Female");
				 ch=s.nextInt();
					
				if(ch==1){
					gender="Male";
					break;
				}else{
					
					gender="Female";
					break;
				}
				
			}
		System.out.println("Enter Age Name:.");age=s.nextInt();
		System.out.println("Enter  Hospital Name:.");hospitalName=s.next();
		System.out.println("Enter Year Of Join Name:.");yearOfJoin=s.nextInt();
		
		
		Money m=new Money(firsName, lastName, gender, id, hospitalName, yearOfJoin,age, 120050);
	//	m.display();
		System.out.println("Money Payable :. "+m.amountPay());
	}

}
