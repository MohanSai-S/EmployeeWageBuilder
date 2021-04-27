package EmployeeWageBuilder;

public class EmpWageBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Wage");
		//Constants
		final int isFullTime=1;
		final int isPartTime=2;
		final int wagePerHour=20;
		//Variables
		int workingHours=0;
		//Computation		
		double random = Math.floor(Math.random()*10)%3;
		int empCheck =(int) Math.round(random);
		switch (empCheck) {
		
		case isFullTime:
			workingHours=8;
			System.out.println("Employee is Full time");
			break;
		case isPartTime:
			workingHours=4;
			System.out.println("Employee is Part time");
			break;
		default:
			workingHours=0;
			System.out.println("Employee is Absent");
		}
		int wage = wagePerHour*workingHours;
		System.out.println("Employee wage per day is "+ wage);
	}
}
