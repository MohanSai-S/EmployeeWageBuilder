package com.employeewagebuilder;

public interface ComputeEmpWage {
	public void addCompanyEmpWage(String company,int empRatePerHour,int noOfWorkingDays,int maxWorkingHours);
	public void computeEmpWage();
	public int computeEmpWage(CompanyEmpWage companyEmpWage);
}
