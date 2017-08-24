/**
 * 
 */
package com.mbts.bus;

import com.mbts.route.bean.RouteInfo;

/**
 * @author Ranjit Chavan
 * @Date Jul 18, 2017
 * @File Name SharedBus.java
 */
public class SharedBus extends Bus {

	/* (non-Javadoc)
	 * @see com.mbts.bus.Bus#getStaff()
	 */

	private int nbrOfStop;   // Number of stops
	private double vechical; //additional vehicles
	
	/**
	 * @return the nbrOfStop
	 */
	public int getNbrOfStop() {
		return nbrOfStop;
	}

	/**
	 * @param nbrOfStop the nbrOfStop to set
	 */
	public void setNbrOfStop(int nbrOfStop) {
		this.nbrOfStop = nbrOfStop;
	}

	@Override
	protected double getStaff() {
		/*
		 * @return no of staff 
		 * 
		 */
		return this.getVehicles();
	}

	/* (non-Javadoc)
	 * @see com.mbts.route.RouteType#getVehicles()
	 */
	protected double getVehicles() {
		 double vech=2*60*RouteInfo.getInstance().getRouteLength()*vechical/(RouteInfo.getInstance().getAvgSpeed()*RouteInfo.getInstance().getHeadways());
		
		 /*
		 * calculate the number of Vehicles
		 * @return no of Vehicles
		 */
		
		return vech;
	}
	
	public void getData(){
		/*
		 * the method for filling data from user
		 */
		RouteInfo.getInstance().setRouteName("77");
		@SuppressWarnings("resource")
		java.util.Scanner scan=new java.util.Scanner(System.in);
		System.out.println("Enter Bus Name");
		RouteInfo.getInstance().setRouteName(scan.nextLine());
		System.out.println("Route length");
		RouteInfo.getInstance().setRouteLength(scan.nextDouble());
		System.out.println("Avg speed");
		RouteInfo.getInstance().setAvgSpeed(scan.nextDouble());
		System.out.println("Nbr stops");
		this.setNbrOfStop(scan.nextInt());
		System.out.println("Headway");
		RouteInfo.getInstance().setHeadways(scan.nextDouble());
		System.out.println("Addl vehicles");
		vechical+=scan.nextDouble();
	//	scan.close();
		
	}
	
	public void showData(){
		/*
		 * This method show the bus information
		 */
		
		System.out.print(RouteInfo.getInstance().getRouteName());
		System.out.print("\t Staff:"+this.getStaff());
		System.out.print("\t Vehicles:"+this.getVehicles());
		System.out.println("\t Stops"+this.getNbrOfStop());
		
	
	}
	

}
