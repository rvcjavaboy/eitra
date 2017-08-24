/**
 * 
 */
package com.mbts.bus;

import com.mbts.route.bean.RouteInfo;

/**
 * @author Ranjit Chavan
 * @Date Jul 18, 2017
 * @File Name DedicatedBus.java
 */
public class DedicatedBus extends Bus{

	/* (non-Javadoc)
	 * @see com.mbts.bus.Bus#getStaff()
	 */
	private int station;
	private int number_of_staff_per_station;
	@SuppressWarnings("unused")
	private double vechical=0;
	
	/**
	 * @param station the station to set
	 */
	public void setStation(int station) {
		this.station = station;
	}

	@Override
	protected double getStaff() {

		/*
		 * calculate the number of staff
		 * @return no of staff 
		 */
		
		return (this.getVehicles()+(this.getStation()*this.getNumber_of_staff_per_station()));
	
	}

	/* (non-Javadoc)
	 * @see com.mbts.route.RouteType#getVehicles()
	 */
	@Override
	protected double getVehicles() {
		/*
		 * calculate the number of Vehicles
		 * @return no of Vehicles
		 */

		double vech=2*60*RouteInfo.getInstance().getRouteLength()/(RouteInfo.getInstance().getAvgSpeed()*RouteInfo.getInstance().getHeadways());
		return vech;	
		
	}

	public double getStation(){

		/*
		 * @return no of station 
		 */
		return station;
	}
	/**
	 * @return the number_of_staff_per_station
	 */
	public int getNumber_of_staff_per_station() {
		
		return number_of_staff_per_station;
	
	}

	/**
	 * @param number_of_staff_per_station the number_of_staff_per_station to set
	 */
	public void setNumber_of_staff_per_station(int number_of_staff_per_station) {
		
		this.number_of_staff_per_station = number_of_staff_per_station;
	
	}

	/**
	 * @param vechical the vechical to set
	 */
	public void setVechical(double vechical) {
	
		this.vechical = vechical;
	
	}

	

	public void getData(){
		/*
		 * the method for filling data from user
		 */
		
		@SuppressWarnings("resource")
		java.util.Scanner scan=new java.util.Scanner(System.in);
		
		System.out.println("Enter Bus Name");
		RouteInfo.getInstance().setRouteName(scan.nextLine());
		System.out.println("Route length");
		RouteInfo.getInstance().setRouteLength(scan.nextDouble());
		System.out.println("Avg speed");
		RouteInfo.getInstance().setAvgSpeed(scan.nextDouble());
		System.out.println("Nbr stations");
		this.setStation(scan.nextInt());
		System.out.println("Headway");
		RouteInfo.getInstance().setHeadways(scan.nextDouble());
		System.out.println("Staff/station");
		this.setNumber_of_staff_per_station(scan.nextInt());
		System.out.println("Addl vehicles");
		this.setVechical(scan.nextDouble());
		//scan.close();
		
	}
	

	public void showData(){
		/*
		 * This method show the bus information
		 */

		System.out.print(RouteInfo.getInstance().getRouteName());
		System.out.print("\t Staff:"+this.getStaff());
		System.out.print("\t Vehicles:"+this.getVehicles());
		System.out.println("\t Station"+this.getStation());
		
	
	}

		

}
