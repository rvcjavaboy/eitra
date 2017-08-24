/**
 * 
 */

/**
 * @author Ranjit Chavan
 * @Date Jul 20, 2017
 * @File Name Pizza.java
 */
public class Pizza {

	private double _price; 			// pizza price
	private IShape _shape; 			//Ishape interface reference
	
	

	/**
	 * Pizza Constructor 
	 * @param double price 
	 * @param Ishape reference
	 */
	public Pizza(double p,IShape s) {
		_price=p;
		_shape=s;
		
	}
	
	/**
	 * This method return pizza price
	 * @return double 
	 */
	public double getPrice(){
		
		
		return _price;
	}
	
	/**
	 * This method return Ishape interface reference
	 * 
	 * @return IShape
	 */
	
	public IShape getShape(){
		
		return _shape;
	}
	/**
	 * This method return class name
	 * @return String
	 */
	public String toString(){
		
		return _shape.toString();
	}
	

}
