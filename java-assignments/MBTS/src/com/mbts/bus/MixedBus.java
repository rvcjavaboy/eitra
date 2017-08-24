/**
 * 
 */
package com.mbts.bus;

import com.mbts.route.bean.RouteInfo;

/**
 * @author Ranjit Chavan
 * @Date Jul 18, 2017
 * @File Name MixedBus.java
 */
public class MixedBus {

	/**
	 * 
	 */
	private double vechical;
	private SharedBus sb;
	private DedicatedBus db;
	
	
	public MixedBus() { 
		/*
		 *	constructor creation the object of shared bus class 
		 *  and dedicated bus
		 * 
		 */
		sb=new SharedBus();
		 db=new DedicatedBus();
	}
	
	public double getVechical() {
		
		/*
		 * calculate the number of Vehicles
		 * @return no of Vehicles
		 */
		
		double vech=2*60*RouteInfo.getInstance().getRouteLength()*vechical/(RouteInfo.getInstance().getAvgSpeed()*RouteInfo.getInstance().getHeadways());
		return vech;	
	
	}
	
	public double getStaff(){
		/*
		 * calculate the number of staff
		 * @return no of staff 
		 * 
		 */
		return (this.getVechical()+(db.getStation()*db.getNumber_of_staff_per_station()));

		
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
		System.out.println("Nbr stops");
		sb.setNbrOfStop(scan.nextInt());
		System.out.println("Nbr stations");
		db.setStation(scan.nextInt());
		System.out.println("Headway");
		RouteInfo.getInstance().setHeadways(scan.nextDouble());
		System.out.println("Staff/station");
		db.setNumber_of_staff_per_station(scan.nextInt());
		System.out.println("Addl vehicles");
		vechical+=scan.nextDouble();
		//scan.close();	
		
		
	}
	
	public void showData(){
		/*
		 * This method show the bus information
		 */
		System.out.print(RouteInfo.getInstance().getRouteName());
		System.out.print("\t Staff:"+this.getStaff());
		System.out.print("\t Vehicles:"+this.getVechical());
		System.out.println("\t Stops"+sb.getNbrOfStop());
		System.out.println("\t Station"+db.getStation());
	
	
	}


}
