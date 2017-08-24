/**
 * 
 */

/**
 * @author Ranjit Chavan
 * @Date Jul 20, 2017
 * @File Name Circle.java
 */
public class Circle implements IShape{

	
	private double _radius;

	Circle(double _radius){
			
			this._radius=_radius;
	}
	
	/* (non-Javadoc)
	 * @see IShape#getArea()
	 */
	
	public double getArea() {
		// TODO Auto-generated method stub
		return 3.14*(_radius*_radius);
	}
	
	/**
	 * This method return class name
	 * @return String
	 */
	
	public String toString(){
		
		
		return this.getClass().getName();
	}
	
	
}
