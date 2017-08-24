/**
 * 
 */
package com.mbts.urban;

import com.mbts.route.bean.RouteInfo;

/**
 * @author Ranjit Chavan
 * @Date Jul 18, 2017
 * @File Name MixedUrbanRail.java
 */
public class MixedUrbanRail {
	
	/**
	 * 
	 */
	private SharedUrbanRail sur=null;     //reference SharedUrbanRail class
	private DedicatedUrbanRail dur=null;  // reference DedicatedUrbanRail class
	
	public MixedUrbanRail() {
		/*
		 *	constructor creation the object of shared bus class 
		 *  and dedicated urban
		 * 
		 */
		sur=new SharedUrbanRail();
		dur=new DedicatedUrbanRail();
	}
	
	
	protected double getVehicles() {
		/*
		 * calculate the number of Vehicles
		 * @return no of Vehicles
		 */
		double vech=2*60*RouteInfo.getInstance().getRouteLength()*sur.getLength()*sur.vechical/(RouteInfo.getInstance().getAvgSpeed()*RouteInfo.getInstance().getHeadways());
		
		return vech;
	}
	
	private  double getStaff(){
		/*
		 * calculate the number of staff
		 * @return no of staff 
		 */

		double f=this.getVehicles()/sur.getLength();
		double g=(dur.staff*this.getVehicles())/sur.length;
		double j=dur.getStation()*dur.getNumber_of_staff_per_station();
		return (f+g+j);
	
		
	}
	
	public void getData(){
		/*
		 * the method for filling data from user
		 */

		@SuppressWarnings("resource")
		java.util.Scanner scan=new java.util.Scanner(System.in);
		System.out.println("Enter Name");
		RouteInfo.getInstance().setRouteName(scan.nextLine());
		
		System.out.println("Route length");
		RouteInfo.getInstance().setRouteLength(scan.nextDouble());
		System.out.println("Avg speed");
		RouteInfo.getInstance().setAvgSpeed(scan.nextDouble());
		System.out.println("Nbr stops");
		sur.setStops(scan.nextInt());
		System.out.println("Nbr stations");
		dur.setStation(scan.nextInt());
		System.out.println("Headway");
		RouteInfo.getInstance().setHeadways(scan.nextDouble());
		System.out.println("Train length");
		sur.setLength(scan.nextDouble());
		System.out.println("Additional staff/train");
		dur.setStaff(scan.nextDouble());
		System.out.println("Staff/station");
		dur.setNumber_of_staff_per_station(scan.nextInt());
		System.out.println("Addl vehicles");
		sur.vechical+=scan.nextDouble();
		//scan.close();
	}
	
	public void showData(){
		/*
		 * This method show the urban information
		 */

		System.out.print(RouteInfo.getInstance().getRouteName());
		System.out.print("\t Staff:"+this.getStaff());
		System.out.print("\t Vehicles:"+this.getVehicles());
		System.out.print("\t Stops"+sur.getStops());
		System.out.println("\t Station"+dur.getStation());
		
	
	}
	

}
