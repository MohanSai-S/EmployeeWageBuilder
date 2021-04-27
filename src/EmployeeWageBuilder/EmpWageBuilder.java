package EmployeeWageBuilder;

public class EmpWageBuilder {
	
	//Constants
	public static final int isFullTime=1;
	public static final int isPartTime=2;
	public static final int wagePerHour=20;
	public static final int noOfWorkingDays=20;
	
	public static void main(String[] args) {
		//Variables
		int i=0;
		int workingHours=0;
		int totalWorkingHours=0;
		int empWage=0;
		//Computation		
		
		for (i=0;i<noOfWorkingDays;i++) {
			
			int empCheck =(int) Math.round(Math.floor(Math.random()*10)%3);
		
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
			totalWorkingHours=totalWorkingHours+workingHours;
		}
		empWage = wagePerHour*totalWorkingHours;
		System.out.println("Employee wage per month is "+ empWage);
	}
}
