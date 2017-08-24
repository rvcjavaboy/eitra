/**
 * 
 */
package com.mbts.bus;

import com.mbts.route.RouteType;

/**
 * @author Ranjit Chavan
 * @Date Jul 18, 2017
 * @File Name Bus.java
 */
public abstract class Bus extends RouteType{
	
	 /**
     * This method for calculating number of staff 
     */
		protected abstract double getStaff();
		
	
}
