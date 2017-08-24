import java.util.*;

interface IShape{
	public double getArea();
}

class Circle implements IShape{
	private double _radius;
	double area;
	public Circle(double radius){
		this._radius = radius;
	}

	public double getArea(){
		area = 3.14*_radius*_radius;
		return area;
	}

	public String toString(){
		return "Circle";
	}
}

class Rectangle implements IShape{

	private double _width;
	private double _height;
	double area;

	public Rectangle(double w, double h){
		this._width = w;
		this._height = h;
	}

	public double getArea(){
		area = _width * _height;
		return area;
	}

	public String toString(){
		return "Rectangle";
	}
}

class Pizza{
	
	private double _price;
	private IShape _shape;

	public Pizza(double p, IShape s){
		this._price = p;
		this._shape = s;
	}

	public double getPrice(){
		return _price;
	}

	public IShape getShape(){
		return _shape;
	}

	public String toString(){
		return String.format("Price of "+_shape+ " pizza is: "+_price);
	}
}


class PizzaDeal{

	public double deal(Pizza p){
		return p.getShape().getArea();
	}

	public boolean betterDeal(Pizza p1, Pizza p2){
		double d1 = deal(p1)*p1.getPrice();
		double d2 = deal(p2)*p2.getPrice();
		if(d1 > d2)
			return true;
		else
			return false;
	}
}

class PizzaClient{
	public static void main(String args[]){
		PizzaClient pc1 = new PizzaClient();
		pc1.run();
	}

	public static void run(){

		Circle c1 = new Circle(5);
		Rectangle r1 = new Rectangle(1.2,2.5);
		Pizza p1 = new Pizza(150,c1);
		Pizza p2 = new Pizza(180,r1);
		System.out.println(p1);
		System.out.println(p2);

		PizzaDeal pd1 = new PizzaDeal();
		System.out.println(pd1.deal(p1));

		if(pd1.betterDeal(p1,p2))
			System.out.println("Circle Pizza is better.");
		else
			System.out.println("Rectangle Pizza is better.");

		p1.getPrice();
	}
}