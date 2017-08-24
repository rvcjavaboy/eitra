/**
 * 
 */
package com.mbts.urban;

import com.mbts.route.RouteType;

/**
 * @author Ranjit Chavan
 * @Date Jul 18, 2017
 * @File Name Urban.java
 */
public abstract class UrbanRail extends RouteType{
	
	protected double length,staff;
	
	/**
     * This method for get staff
     * @return double
     */
	protected abstract double getStaff();
	
	/**
     * This method for set staff
     * @param double
     */
	protected abstract  void setStaff(double staff);
	
	/**
     * This method for set length
     * @param double
     */
	protected abstract void setLength(double length);
	
	/**
     * This method for get length
     * @return double
     */
	protected abstract double getLength();


}
