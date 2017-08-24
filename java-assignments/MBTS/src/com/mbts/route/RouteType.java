/**
 * 
 */
package com.mbts.route;

import com.mbts.route.bean.RouteInfo;

/**
 * @author Ranjit Chavan
 * @Date Jul 18, 2017
 * @File Name RouteType.java
 */
public abstract class RouteType implements com.mbts.route.Row{
	
	/**
     * This method set route type
     */
	protected final RouteInfo setRouteType(String RouteType){
			RouteInfo info=RouteInfo.getInstance();
			info.setRouteType(RouteType);
			return info;
	}
	
	/**
     * This method get route type
     */
	protected final String getRouteType(){
		
			return RouteInfo.getInstance().getRouteType();
	
	}
	
	/**
     * This method for set row type
     */
	protected final RouteInfo setRowType(String RowType){
			RouteInfo info=RouteInfo.getInstance();
			info.setRowType(RowType);
			return info;
	}

	/**
     * This method for get row type!
     */
	protected final String getRowType(){
	
			return RouteInfo.getInstance().getRowType();

	}

	/* (non-Javadoc)
	 * @see com.mbts.route.Row#setAvgSpeedRow(double)
	 */
	@Override
	public RouteInfo setAvgSpeedRow(double mph) {
		// TODO Auto-generated method stub
			RouteInfo info=RouteInfo.getInstance();
			info.setAvgSpeed(mph);
			return info;
	}

	/* (non-Javadoc)
	 * @see com.mbts.route.Row#getAvgSpeedRow()
	 */
	@Override
	public double getAvgSpeedRow() {
		// TODO Auto-generated method stub
			return RouteInfo.getInstance().getAvgSpeed();
	}

	/* (non-Javadoc)
	 * @see com.mbts.route.Row#setRouteLenRow(double)
	 */
	@Override
	public RouteInfo setRouteLenRow(double miles) {
		// TODO Auto-generated method stub
			RouteInfo info=RouteInfo.getInstance();
			info.setRouteLength(miles);
			return info;
	}

	/* (non-Javadoc)
	 * @see com.mbts.route.Row#getRouteLenRow()
	 */
	@Override
	public double getRouteLenRow() {
		// TODO Auto-generated method stub
			return RouteInfo.getInstance().getRouteLength();
		
	}

	/* (non-Javadoc)
	 * @see com.mbts.route.Row#setRouteNameRow(java.lang.String)
	 */
	@Override
	public RouteInfo setRouteNameRow(String routename) {
		// TODO Auto-generated method stub
			RouteInfo info=RouteInfo.getInstance();
			info.setRouteName(routename);
			return info;
	}

	/* (non-Javadoc)
	 * @see com.mbts.route.Row#getRouteNameRow()
	 */
	@Override
	public String getRouteNameRow() {
		// TODO Auto-generated method stub
			return RouteInfo.getInstance().getRouteName();
		
	}

	/* (non-Javadoc)
	 * @see com.mbts.route.Row#setHeadwayRow(double)
	 */
	@Override
	public RouteInfo setHeadwayRow(double minutes) {
		// TODO Auto-generated method stub
			RouteInfo info=RouteInfo.getInstance();
			info.setHeadways(minutes);
			return info;
	}

	/* (non-Javadoc)
	 * @see com.mbts.route.Row#getHeadwayRow()
	 */
	@Override
	public double getHeadwayRow() {
		// TODO Auto-generated method stub
			return RouteInfo.getInstance().getHeadways();
	}
	
	
	/**
     * This abstract method vehicles for calculation vehicles
     */
	protected abstract double getVehicles();

	
	
	
}