package com.vtalent.branch.sowmya;

public class ArrayEmployee
{
	int eId;
	double eSalary;
	long eMobile;

	
	static ArrayEmployee[] empArray=new ArrayEmployee[4];
	
	public static void insertData()
	{
		for(int i=0;i<=empArray.length-1;i++)
		{
			ArrayEmployee emp=new ArrayEmployee();
			emp.eId=100+i;
			emp.eSalary=2500*(10+i);
			emp.eMobile=924696+(i*2);
			empArray[i]=emp;
		}
	}
	
	public  static void displayData()
	{
		Scanner sc=new Scanner(System.in);
	     int temp=sc.nextInt();
		for(int i=0;i<=empArray.length-1;i++)
			ArrayEmployee emp=(ArrayEmployee)empArray[i];
			
		
		if(emp.eId==temp)
		{
			System.out.println(empArray[i]);
		}
		else
		{
			System.out.println("given entry is wrong");
		}
		}
	


	public static void main(String[] args) {
		insertData();
		displayData();
		displayEmp();
		
		
	}
	public static void displayEmp()
	{
		for(int i=0;i<=empArray.length-1;i++)
		{
			
	ArrayEmployee emp=(ArrayEmployee)empArray[i];
	System.out.println("Id="+emp.eId+"Salary="+emp.eSalary+"Mobile="+emp.eMobile);
		}
		
	}
}



