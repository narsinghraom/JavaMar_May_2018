package com.vtalent.branch.two.suhail;

class Employee {
int employeeId;
double employeeSalary;
double amountTax;
public void subEmployeeId(int employeeId)
{
	this.employeeId = employeeId;
}
public double annualSalary(double employeeSalary)
{
	employeeSalary = employeeSalary - 2000.0;
	this.employeeSalary = employeeSalary;
	
	return this.employeeSalary;
}
public double annualSalary(double employeeSalary, double annualTax)
{
	this.employeeSalary = employeeSalary - (employeeSalary * annualTax);
	return this.employeeSalary;
}
}

class HRPayRoll extends Employee
{
	public double annualSalary(double employeeSalary)
	{
		int hra = 50000;
		float tax = 0.3f;
		int net = 3000;
		this.employeeSalary =(employeeSalary) - (hra+net+(employeeSalary*tax));
		return this.employeeSalary;
	}
}

class EmployeeTest
{
	public static void main(String[] args) {
		HRPayRoll hr = new HRPayRoll();
		hr.subEmployeeId(100);
		double salaryPackage = hr.annualSalary(400000.00);
		System.out.println(hr.employeeId + " " + salaryPackage);
	}
}


//Polymorphism:
//	overloading--> compile time polymorphism --> same method name, diff signature --> within a class
//	overriding --> run time polymorphism --> same method name, same signature --> through inheritance