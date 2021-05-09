package com.employeewagebuilder;
/**
 * @description Defing CompanyEmployeeWage class for initializing  the details of each company
 * @author The_Vuppukari
 *
 */

public class CompanyEmpWage {
	
	//Variables
	public String company;
	public int empWagePerHour;
	public int noOfWorkingDays;
	public int maxWorkingHours;
	public int totalEmpWage;
	
	/**
	 * @description company Employee Wage constructor for assigning the function arguments
	 * @param company
	 * @param empRatePerHour
	 * @param noOfWorkingDays
	 * @param maxHoursPerMonth
	 */
	public CompanyEmpWage(String company, int empRatePerHour,int noOfWorkingDays, int maxHoursPerMonth) {
		this.company = company;
		this.empWagePerHour = empRatePerHour;
		this.noOfWorkingDays = noOfWorkingDays;
		this.maxWorkingHours = maxHoursPerMonth;
		
	}
	

	/**
	 * @description Public  method for caluclating the total employee wage
	 * @param none
	 * @return
	 */
	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage=totalEmpWage;
	}
	
	
	/**
	 * @description Public Method for overriding the code to display the output
	 * @param none
	 */
	public String toString() {
		return "Total wage for company " +company+ " is " + totalEmpWage;
	}
}

