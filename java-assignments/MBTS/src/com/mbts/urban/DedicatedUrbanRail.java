/**
 * 
 */
package com.mbts.urban;

import com.mbts.route.bean.RouteInfo;

/**
 * @author Ranjit Chavan
 * @Date Jul 18, 2017
 * @File Name DedicatedUrbanRail.java
 */
public class DedicatedUrbanRail extends UrbanRail{

	
	private int number_of_staff_per_station,station,length; //m

	/* (non-Javadoc)
	 * @see com.mbts.urban.UrbanRail#setStaff(double)
	 */
	
	@Override
	protected void setStaff(double staff) {
		// TODO Auto-generated method stub
		this.staff=staff;
		
	}
	
	/* (non-Javadoc)
	 * @see com.mbts.urban.UrbanRail#getStaff()
	 */

	@Override
	protected double getStaff() {
		/*
		 * calculate the number of staff
		 * @return no of staff 
		 */

		double f=this.getVehicles()/this.getLength();
		double g=(staff*this.getVehicles())/this.length;
		double j=this.getStation()*this.getNumber_of_staff_per_station();
				return (f+g+j);
		
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


	/* (non-Javadoc)
	 * @see com.mbts.route.RouteType#getVehicles()
	 */
	@Override
	protected double getVehicles() {
		/*
		 * calculate the number of Vehicles
		 * @return no of Vehicles
		 */

			double vech=2*60*RouteInfo.getInstance().getRouteLength()*this.getLength()/(RouteInfo.getInstance().getAvgSpeed()*RouteInfo.getInstance().getHeadways());
			return vech;
		
		}	
	
	public double getStation(){
	
		return station;
	
	}
	
	public void setStation(int station) {
	
		this.station = station;
	
	}

	/* (non-Javadoc)
	 * @see com.mbts.urban.UrbanRail#setLength(double)
	 */
	@Override
	protected void setLength(double length) {
		// TODO Auto-generated method stub
		this.length=(int) length;
		
	}


	/* (non-Javadoc)
	 * @see com.mbts.urban.UrbanRail#getLength()
	 */
	@Override
	protected double getLength() {
		// TODO Auto-generated method stub
		return length;
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
		this.setLength(scan.nextDouble());
		System.out.println("Additional staff/train");
		this.setStaff(scan.nextDouble());
		System.out.println("Staff/station");
		this.setNumber_of_staff_per_station(scan.nextInt());
		
		//scan.close();

		
		
	}
	
	public void showData(){
		/*
		 * This method show the urban information
		 */

		System.out.print(RouteInfo.getInstance().getRouteName());
		System.out.print("\t Staff:"+this.getStaff());
		System.out.print("\t Vehicles:"+this.getVehicles());
		System.out.println("\t Station"+this.getStation());
		
	
	}




	
	
}
