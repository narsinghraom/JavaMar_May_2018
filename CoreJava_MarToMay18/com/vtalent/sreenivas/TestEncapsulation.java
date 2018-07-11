package com.vtalent.sreenivas;

public class TestEncapsulation
{
	private int empid;
	private double empsalary;
	

	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public double getEmpsalary() {
		return empsalary;
	}


	public void setEmpsalary(double empsalary) {
		this.empsalary = empsalary;
	}


	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		TestEncapsulation test=new TestEncapsulation();
		test.setEmpid(101);
		test.setEmpsalary(35000.00);
		System.out.println(test.empid+" "+test.empsalary);

	}

}
