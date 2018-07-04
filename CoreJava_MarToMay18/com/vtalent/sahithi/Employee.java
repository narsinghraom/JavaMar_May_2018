package com.vtalent.sahithi;

public class Employee {
	int eId;
	double eSalary;
	long eMobile;
	static Employee[] empArray=new Employee[4];
	public static void insertData(){
		for(int i=0;i<=empArray.length-1;i++)
		{
			Employee emp=new Employee();
			emp.eId=100+i;
			emp.eSalary=2500*(10+i);
			emp.eMobile=70754435+(i*2);
			empArray[i]=emp;
		}
		
	}
	public static void main(String args[])
	{
		insertData();
		displayEmp();
		
	}
	public static void displayEmp()
	{
		for(int i=0;i<=empArray.length-1;i++)
		{
			Employee emp=(Employee)empArray[i];
			System.out.println("Id="+emp.eId +" "+"Salary="+emp.eSalary +" "+"Mobile="+emp.eMobile);
		}
			
	}
	

}
