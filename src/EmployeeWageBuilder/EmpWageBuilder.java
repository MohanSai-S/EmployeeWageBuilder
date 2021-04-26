package EmployeeWageBuilder;

public class EmpWageBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Wage");
		//Constants
		int isFullTime=1;
		int isPartTime=2;
		int workingHours=0;
		int wagePerHour=20;
		//Computation		
		double empCheck = Math.floor(Math.random()*10)%3;
		if (empCheck == isFullTime) {
			workingHours=8;
			System.out.println("Employee is Full time");
		}
		else if (empCheck == isPartTime) {
			workingHours=4;
			System.out.println("Employee is Part time");
		}
		else {
			workingHours=0;
			System.out.println("Employee is Absent");
		}
		int wage = wagePerHour*workingHours;
		System.out.println("Employee wage per day is "+ wage);
	}
}
