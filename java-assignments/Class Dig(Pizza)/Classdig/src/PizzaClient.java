/**
 * 
 */

/**
 * @author Ranjit Chavan
 * @Date Jul 20, 2017
 * @File Name PizzaClient.java
 */
public class PizzaClient {

	/**
	 * @This method create the object Circle and Rectangle
	 */
	
	
	private static void run(){
	Circle c=new Circle(200);   		//Circle Class Object @param radius
	Rectangle r=new Rectangle(10, 10);	//Rectangle class Object @param width height
	
	Pizza p=new Pizza(1000,c);			//Pizza Class Object @param price and circle Object
	Pizza p2=new Pizza(300,r);			//Pizza Class Object @param price and Rectangle Object
	PizzaDeal pd=new PizzaDeal();		//create Object Pizza Deal Class
	System.out.println("Better Deal.......");
	if(pd.betterDeal(p, p2)){   		// check better pizza deal
		System.out.println("Pizza Pirce  "+p.getPrice());
		System.out.println("Pizza Type  "+p.toString());
		
		
	}else{
		System.out.println("Pizza Pirce  "+p2.getPrice());
		System.out.println("Pizza Type  "+p2.toString());
		
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			run(); 						// run method call
	}

}
