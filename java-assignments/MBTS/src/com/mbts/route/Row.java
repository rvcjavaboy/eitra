/**
 * 
 */
package com.mbts.route;

import com.mbts.route.bean.RouteInfo;

/**
 * @author Ranjit Chavan
 * @Date Jul 18, 2017
 * @File Name Row.java
 */
public interface Row {
	/**
     * This method for set avg speed!
     */
	public RouteInfo setAvgSpeedRow(double mph);
	/**
     * This method does get avg speed 
     */
	public  double getAvgSpeedRow();
	/**
     * This method set route length 
     */
	public RouteInfo 	setRouteLenRow(double miles);
	/**
     * This method get route length
     */
	public double getRouteLenRow();
	/**
     * This method for set route name
     */
	public RouteInfo setRouteNameRow(String routename);
	/**
     * This method for get route name
     */
	public String getRouteNameRow();
	/**
     * This method for set headyway in double
     */
	public RouteInfo setHeadwayRow(double minutes);
	/**
     * This method  get headyway in minutes 
     */
	public double getHeadwayRow();
}
