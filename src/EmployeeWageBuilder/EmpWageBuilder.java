package EmployeeWageBuilder;

public class EmpWageBuilder {
	
	//Constants
	public static final int isFullTime=1;
	public static final int isPartTime=2;
	public static final int wagePerHour=20;
	public static final int noOfWorkingDays=20;
	public static final int maxWorkingHours=100;
	int workingHours=0;
	
	void attendance() {
		//Computation
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
		
	}
		
	void wageComputation(String employeeName) {
		
		//Variables
		int day=0;
		int totalWorkingHours=0;
		int empWage=0;
		//Computation		
		
		for (day=1;day<=noOfWorkingDays;day++) {
			
			
			
			if (day<=noOfWorkingDays && totalWorkingHours<=maxWorkingHours) {
		
				attendance();
				totalWorkingHours += workingHours;
			}			
		}
		if (totalWorkingHours>maxWorkingHours) {
			totalWorkingHours -= workingHours;
		}
		System.out.println("Salary Details of "+ employeeName);
		System.out.println(" Number of Working Hours : " + totalWorkingHours);
		empWage = wagePerHour*totalWorkingHours;
		System.out.println("Employee wage per month : "+ empWage);
	
		}
	public static void main(String[] args) {
		EmpWageBuilder Employee1= new EmpWageBuilder();
		EmpWageBuilder Employee2= new EmpWageBuilder();
		Employee1.wageComputation("Employee1");
		Employee2.wageComputation("Employee2");
	}
}
