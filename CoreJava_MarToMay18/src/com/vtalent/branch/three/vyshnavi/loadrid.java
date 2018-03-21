package com.vtalent.branch.three.vyshnavi;

class Employee
{
	int empid;
	double empsal;
	double annualsal;
	public void setempid(int empid)
	{
		this.empid=empid;
	}
	public double annualsal(double empsal)
	{
		empsal=empsal-25000.00;
		this.empsal=empsal;
		return this.empsal;
	}
	public double annualsal(double empsal,double annualtax)
	{
		this.empsal=empsal-(empsal*annualtax);
		return this.empsal;
	}
}
	class Hrpayroll extends Employee
	{
		public double annualsal(double empsal)
		{
			int hra=50000;
			float tax=0.3f;
			int meal=3000;
			this.empsal=(empsal)-(hra+meal+(empsal*tax));
			return this.empsal;
		}
	}

public class loadrid {

	public static void main(String args[])
	{
		Hrpayroll hr=new Hrpayroll();
		hr.setempid(100);
		double salpackage=hr.annualsal(400000.00);
		System.out.println(hr.empid +"      "+salpackage);
	}
}
