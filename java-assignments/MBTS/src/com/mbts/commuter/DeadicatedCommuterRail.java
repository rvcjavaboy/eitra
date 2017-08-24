/**
 * 
 */
package com.mbts.commuter;

import com.mbts.route.bean.RouteInfo;

/**
 * @author Ranjit Chavan
 * @Date Jul 18, 2017
 * @File Name DeadicatedCommuterRail.java
 */
public class DeadicatedCommuterRail extends CommuterRail{
	
	private int  trainlength;//c
	private int number_of_staff_per_station;//m
	
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
	 * @return the trainlength
	 */
	public int getTrainlength() {
		return trainlength;
	}

	/**
	 * @param trainlength the trainlength to set
	 */
	public void setTrainlength(int trainlength) {
		this.trainlength = trainlength;
	}

	/* (non-Javadoc)
	 * @see com.mbts.commuter.CommuterRail#getStaff()
	 */
	@Override
	protected double getStaff() {
		/*
		 * calculate the number of staff
		 * @return no of staff 
		 */
		
		double g=staff*this.getEngines();
		double j=this.getStation()*this.getNumber_of_staff_per_station();
		return (this.getEngines()+g+j);
		
		
	}
	protected double getEngines(){

		/*
		 * calculate the number of engines
		 * @return no of engines in double 
		 */
		double e1=2*60*RouteInfo.getInstance().getRouteLength()/(RouteInfo.getInstance().getAvgSpeed()*RouteInfo.getInstance().getHeadways());
		
		return e1;
	}

	/* (non-Javadoc)
	 * @see com.mbts.commuter.CommuterRail#setStaff(double)
	 */
	@Override
	protected void setStaff(double staff) {
		// TODO Auto-generated method stub
		this.staff=staff;
	}

	/* (non-Javadoc)
	 * @see com.mbts.commuter.CommuterRail#setStation(int)
	 */
	@Override
	protected void setStation(int station) {
		// TODO Auto-generated method stub
		this.station=station;
	}

	/* (non-Javadoc)
	 * @see com.mbts.commuter.CommuterRail#getStation()
	 */
	@Override
	protected double getStation() {
		// TODO Auto-generated method stub
		return station;
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

		double vech=2*60*RouteInfo.getInstance().getRouteLength()*this.getTrainlength()/(RouteInfo.getInstance().getAvgSpeed()*RouteInfo.getInstance().getHeadways());
		
		return vech;
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
		System.out.println("Nbr stations");
		this.setStation(scan.nextInt());
		System.out.println("Headway");
		RouteInfo.getInstance().setHeadways(scan.nextDouble());
		System.out.println("Train length");
		this.setTrainlength(scan.nextInt());
		System.out.println("Additional staff/train");
		this.setStaff(scan.nextDouble());
		System.out.println("Staff/station");
		this.setNumber_of_staff_per_station(scan.nextInt());
		//scan.close();
		
		
	}
	
	public void showData(){
		/*
		 * This method show the bus information
		 */

		System.out.print(RouteInfo.getInstance().getRouteName());
		System.out.print("\t Staff:"+this.getStaff());
		System.out.print("\t Vehicles:"+this.getVehicles());
		System.out.print("\t Engines"+this.getEngines());
		System.out.print("\t Stations"+this.getStation());
		
	
	
	}

}
