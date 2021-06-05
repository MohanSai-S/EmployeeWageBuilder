/**
 * @description Package defining the Employee wage builder
 * @param none
 * 
 */
package com.employeewagebuilder;

import java.util.ArrayList;

/**
 * @description Class for defining the Employee Wage builder
 * @author The_Vuppukari
 *
 */
public class EmpWageBuilder implements ComputeEmpWage{
	
	//Constants
	private static final int IS_FULL_TIME=1;
	private static final int IS_PART_TIME=2;
	
	/**
	 * @description Private method to create a ArrayList for saving Employee Wage.
	 * @param none
	 */
	private ArrayList<CompanyEmpWage> companyEmpWageList;
	private EmpWageBuilder(){
		companyEmpWageList = new ArrayList<>();		
	}
	
	/**
	 * @description Private method for adding the employee wage of a company to array
	 * @param company
	 * @param empRatePerHour
	 * @param noOfWorkingDays
	 * @param maxWorkingHours
	 */
	public void addCompanyEmpWage(String company,int empRatePerHour,int noOfWorkingDays,int maxWorkingHours) {
		CompanyEmpWage companyEmpWage = new CompanyEmpWage(company,empRatePerHour,noOfWorkingDays,maxWorkingHours);
		companyEmpWageList.add(companyEmpWage);
	}
	
	/**
	 * @description public method to display the company EmployeeWage Array
	 * @ param none
	 */
	public void computeEmpWage() {
        for (int i = 0;  i < companyEmpWageList.size(); i++) {
        	 CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
             companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
             System.out.println(companyEmpWage);
        }
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
	 * @description Private method for caluclating the total employee Wage by taking variables from the
	 * company Employee Wage File.
	 * @param none
	 * @return 
	 * @return Total Employee Wage
	 */
	public int computeEmpWage(CompanyEmpWage companyEmpWage) {
		
		int totalWorkingHours=0;
		for (int day=1;day<=companyEmpWage.noOfWorkingDays;day++) {
			if (day<=companyEmpWage.noOfWorkingDays && totalWorkingHours<=companyEmpWage.maxWorkingHours) {
				totalWorkingHours += workingHoursCaluclator();
			}			
		}
		return totalWorkingHours*companyEmpWage.empWagePerHour;
		
	}
	
	/**
	 * @description Public main method for creating objects and calling the methods
	 * @param args
	 */
	public static void main(String[] args) {
		
		EmpWageBuilder employeeWageBuilder = new EmpWageBuilder();
		employeeWageBuilder.addCompanyEmpWage("Reliance",15,30,100);
		employeeWageBuilder.addCompanyEmpWage("Wall Mart",25,20,150);
		employeeWageBuilder.computeEmpWage();
		
	}
}
