/**
 * 
 */
package com.rvc.ass2;

/**
 * @author Ranjit Chavan
 * @Date Jul 6, 2017
 * @File Name Rectangle.java
 */
 interface Shape {
     double area();
     double perimeter();
}


 class Rectangle implements Shape {

	private double length,breadth;
	Rectangle(){}
	Rectangle(double length,double breadth){
		
		this.length=length;
		this.breadth=breadth;
		
	}
	public double area() {
		return length*breadth;
	}

	public double perimeter() {
	
		return (2*(length+breadth));
	
	}
	
 }class Circle {
		public static void main(String args[]){
			
			java.util.Scanner s=new java.util.Scanner(System.in);
			System.out.println("Enter The Length And breadth:.");
			Rectangle r=new Rectangle(s.nextDouble(), s.nextDouble());
			System.out.println("Area:."+r.area());
			System.out.println("perimeter:.:."+r.perimeter());
			
		}

}
