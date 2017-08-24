/**
 * 
 */
package com.mbts.route.bean;

/**
 * @author Ranjit Chavan
 * @Date Jul 18, 2017
 * @File Name RouteInfo.java
 */
public class RouteInfo {
	private static RouteInfo info=new RouteInfo();
	
	private String routeName;
	private double routeLength,avgSpeed,headways;// l  v  h
	private  String routeType,rowType;
	
	
	/**
	 * @return the routeName
	 */
	
	private RouteInfo(){}
	
	public static RouteInfo getInstance(){
		
		
		
		return info;
	
	}
	
	public String getRouteName() {
		return routeName;
	}
	/**
	 * @param routeName the routeName to set
	 */
	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}
	/**
	 * @return the routeLength
	 */
	public double getRouteLength() {
		return routeLength;
	}
	/**
	 * @param routeLength the routeLength to set
	 */
	public void setRouteLength(double routeLength) {
		this.routeLength = routeLength;
	}
	/**
	 * @return the avgSpeed
	 */
	public double getAvgSpeed() {
		return avgSpeed;
	}
	/**
	 * @param avgSpeed the avgSpeed to set
	 */
	public void setAvgSpeed(double avgSpeed) {
		this.avgSpeed = avgSpeed;
	}
	/**
	 * @return the headways
	 */
	public double getHeadways() {
		return headways;
	}
	/**
	 * @param headways the headways to set
	 */
	public void setHeadways(double headways) {
		this.headways = headways;
	}

	/**
	 * @return the routeType
	 */
	public String getRouteType() {
		return routeType;
	}

	/**
	 * @param routeType the routeType to set
	 */
	public void setRouteType(String routeType) {
		this.routeType = routeType;
	}

	/**
	 * @return the rowType
	 */
	public String getRowType() {
		return rowType;
	}

	/**
	 * @param rowType the rowType to set
	 */
	public void setRowType(String rowType) {
		this.rowType = rowType;
	}
	
	
}
