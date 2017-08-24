/**
 * 
 */

/**
 * @author Ranjit Chavan
 * @Date Jul 20, 2017
 * @File Name Rectangle.java
 */
public class Rectangle implements IShape{
	
	private double _width,_radius;
	
	/**
	 * 
	 */
	public Rectangle(double w,double r) {
	
		_width=w;
		_radius=r;
		
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see IShape#getArea()
	 */
	public double getArea() {
		// TODO Auto-generated method stub
		return (_width*_radius);
	}
	
	/**
	 * This method return class name
	 * @return String
	 */
	
	public String toString(){
		
		
		return this.getClass().getName();
	}

}
