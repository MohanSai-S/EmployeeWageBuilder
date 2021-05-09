/**
 * @description Package defining the Employee wage builder
 * @param none
 * 
 */
package com.employeewagebuilder;

/**
 * @description A class defining the Employee Wage builder
 * @author The_Vuppukari
 *
 */
public class EmpWageBuilder {
	
	//Constants
	private static final int IS_FULL_TIME=1;
	private static final int IS_PART_TIME=2;
	public String company;
	private int empWagePerHour;
	private int noOfWorkingDays;
	private int maxWorkingHours;
	
	/**
	 * @description Employee Wage builder constructor
	 * @param company
	 * @param empRatePerHour
	 * @param noOfWorkingDays
	 * @param maxHoursPerMonth
	 */
	private EmpWageBuilder(String company, int empRatePerHour,int noOfWorkingDays, int maxHoursPerMonth) {
		this.company = company;
		this.empWagePerHour = empRatePerHour;
		this.noOfWorkingDays = noOfWorkingDays;
		this.maxWorkingHours = maxHoursPerMonth;
		
	}
	
	/**
	 * @description Private method that returns a random value to check the Employee attendance.
	 * @param none
	 * @return
	 */
	private int attendanceCheck() {
		return (int) Math.floor(Math.random()*10)%3;
	}
	
	/**
	 * @description Private Method For Caluclating the Working hours according to the employee present
	 * @param none
	 * @return
	 */
	private int workingHoursCaluclator() {

		int workingHours;
		switch (attendanceCheck()) {
	
			case IS_FULL_TIME:
				workingHours=8;
				break;
			case IS_PART_TIME:
				workingHours=4;
				break;
			default:
				workingHours=0;
		}
		return workingHours;
	}
	
	/**
	 * @description Private method for caluclating the total working hours
	 * @param none
	 * @return
	 */
	private int totalWorkingHours() {
		
		int noOfWorkingHours=0;
		for (int day=1;day<=noOfWorkingDays;day++) {
			if (day<=noOfWorkingDays && noOfWorkingHours<=maxWorkingHours) {
				noOfWorkingHours += workingHoursCaluclator();
			}			
		}
		return noOfWorkingHours;
		
	}
	
	/**
	 * @description Private method for caluclating the total employee wage
	 * @param none
	 * @return
	 */
	private int totalEmployeeWage() {
		return totalWorkingHours()*empWagePerHour;
	}
	
	/**
	 * @description Public Method for overriding the code to display the output
	 * @param none
	 */
	public String toString() {
		return "Total wage for company " +company+ " is " + totalEmployeeWage();
	}
	
	/**
	 * @description Public main method for creating objects and calling the methods
	 * @param args
	 */
	public static void main(String[] args) {
		
		EmpWageBuilder Dmart = new EmpWageBuilder("Dmart",20,4,20);
		System.out.println(Dmart);
	}
}
