/**
 * @description Package defining the Employee wage builder
 * @param none
 * 
 */
package com.employeewagebuilder;

/**
 * @description Class for defining the Employee Wage builder
 * @author The_Vuppukari
 *
 */
public class EmpWageBuilder {
	
	//Constants
	private static final int IS_FULL_TIME=1;
	private static final int IS_PART_TIME=2;
		
	private int noOfCompany=0;
	private CompanyEmpWage[] companyEmpWageArray;
	
	/**
	 * @description Private method to create a Employee Wage Builder constructor
	 * @param none
	 */
	private EmpWageBuilder(){
		companyEmpWageArray = new CompanyEmpWage[5];		
	}
	
	/**
	 * @description Private method for adding the employee wage of a company to array
	 * @param company
	 * @param empRatePerHour
	 * @param noOfWorkingDays
	 * @param maxWorkingHours
	 */
	private void addCompanyEmpWage(String company,int empRatePerHour,int noOfWorkingDays,int maxWorkingHours) {
		companyEmpWageArray[noOfCompany] = new CompanyEmpWage(company,empRatePerHour,noOfWorkingDays,maxWorkingHours);
		noOfCompany++;
	}
	
	/**
	 * @description public method to display the company EmployeeWage Array
	 * @ param none
	 */
	public void computeEmpWage() {
        for (int i = 0; i < noOfCompany; i++) {
        	companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
            System.out.println(companyEmpWageArray[i]);
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
	 * @return Total Employee Wage
	 */
	private int computeEmpWage(CompanyEmpWage companyEmpWage) {
		
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
