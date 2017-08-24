/**
 * 
 */

/**
 * @author Ranjit Chavan
 * @Date Jul 20, 2017
 * @File Name PizzaDeal.java
 */
public class PizzaDeal {

	/**
	 * This method Calculate the pizza points
	 */
	public double deal(Pizza p){
		Circle c;
		Rectangle r;
		
		if(p.getShape().toString().equals(Circle.class.getName())){
			c=(Circle)p.getShape();

			return (p.getPrice()*c.getArea());
		}else{
			r=(Rectangle)p.getShape();
			return (p.getPrice()*r.getArea());
		}
		
		
		
	}
	/**
	 * This method compare which is better deal
	 * 
	 */
	public boolean betterDeal(Pizza p1,Pizza p2){
		
		if(deal(p1)>deal(p2))
			return true;
		else
			return false;
		
	}  
}
