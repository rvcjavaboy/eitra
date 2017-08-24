/**
 * 
 */
package com.mbts.commuter;

import com.mbts.route.RouteType;

/**
 * @author Ranjit Chavan
 * @Date Jul 18, 2017
 * @File Name CommuterRail.java
 */
public abstract class CommuterRail extends RouteType{
	
	protected double staff; 	//no of staff
	protected int station; 		//no of station 
	
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
     * This method for set station 
     * @param double
     */
	protected abstract void setStation(int station);
	
	/**
     * This method for get station 
     * @return double
     */
	protected abstract double getStation();

}
