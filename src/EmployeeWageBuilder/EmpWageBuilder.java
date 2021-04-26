package EmployeeWageBuilder;

public class EmpWageBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Wage");
		//Constants
		int isPresent=1;
		int workingHours=0;
		int wagePerHour=20;
		//Computation		
		double empCheck = Math.floor(Math.random()*10)%2;
		if (empCheck == isPresent) {
			workingHours=8;
			System.out.println("Employee is Present");
		}
		else {
			workingHours=0;
			System.out.println("Employee is Absent");
		}
		int wage = wagePerHour*workingHours;
		System.out.println("Employee wage per day is "+ wage);
	}
}
