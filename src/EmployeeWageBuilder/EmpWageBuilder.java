package EmployeeWageBuilder;

public class EmpWageBuilder {
	
	//Constants
	public static final int isFullTime=1;
	public static final int isPartTime=2;
	public static final int wagePerHour=20;
	public static final int noOfWorkingDays=20;
	public static final int maxWorkingHours=100;
	
	public static void main(String[] args) {
		//Variables
		int day=0;
		int workingHours=0;
		int totalWorkingHours=0;
		int empWage=0;
		//Computation		
		
		for (day=1;day<=noOfWorkingDays;day++) {
			
			int empCheck =(int) Math.round(Math.floor(Math.random()*10)%3);
			
			if (day<=noOfWorkingDays && totalWorkingHours<=maxWorkingHours) {
		
				switch (empCheck) {
				
				case isFullTime:
					workingHours=8;
					break;
				case isPartTime:
					workingHours=4;
					break;
				default:
					workingHours=0;
				}
				totalWorkingHours += workingHours;
			}			
		}
		if (totalWorkingHours>100) {
			totalWorkingHours -= workingHours;
		}
		System.out.println(" Number of Working Hours " + totalWorkingHours);
		empWage = wagePerHour*totalWorkingHours;
		System.out.println("Employee wage per month is "+ empWage);
	}
}
