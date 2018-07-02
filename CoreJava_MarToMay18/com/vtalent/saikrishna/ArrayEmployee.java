package com.vtalent.saikrishna;

import java.util.Scanner;

public class ArrayEmployee 
{
	int empid;
	double esal;
	long emobile;
	 static Scanner s=new Scanner(System.in);
	static ArrayEmployee[] empArray=new ArrayEmployee[4];
	public static void insertData()
	{
		for(int i=0;i<=empArray.length-1;i++)
		{
			ArrayEmployee e=new ArrayEmployee();
			e.empid=100+i;
			e.esal=2500*(10+i);
			e.emobile=8484848+(i*2);
			empArray[i]=e;		
		}
	}
	public static void dispEmp()
	{
		for(int i=0;i<=empArray.length-1;i++)
		{
			
			ArrayEmployee emp=(ArrayEmployee)empArray[i];
			
		
			
			System.out.println("employeeid="+emp.empid+"empsal="+emp.esal+"empmobile="+emp.emobile);
		}
	}
	public void searchEmp()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter employee id");
		 int eid=s.nextInt();
		 
		 for(int i=0;i<=empArray.length-1;i++)
		 {
			 ArrayEmployee ae=(ArrayEmployee)empArray[i];
			 
			 if(ae.empid==eid)
			 {
				 System.out.println("id="+ae.empid+" sal="+ae.esal+" mobile="+ae.emobile);
			 }
		 }
		
	}
	
	public void updateEmp()
	{
		//ArrayEmployee a=new ArrayEmployee();
		
		System.out.println("enter id");
		int temp=s.nextInt();
		for(int i=0;i<=empArray.length-1;i++)
		{
			ArrayEmployee ae=(ArrayEmployee)empArray[i];
			if(ae.empid==temp)
			{
				System.out.println("empid="+ae.empid+" esal="+ae.esal+ "number="+ae.emobile);
				System.out.println("enter updated salary");
				int e1=s.nextInt();
				ae.esal=e1;
				empArray[i]=ae;
			//	System.out.println(ae.esal);
				//disp();
				break;
			}
		}
	}
	
	void deleteEmp()
	{
	Scanner sc = new Scanner(System.in);

	//System.out.println("enter id: ");
	int tempEid = sc.nextInt();
	for (int i = 0; i <= empArray.length - 1; i++) 
	{
		ArrayEmployee emp = (ArrayEmployee) empArray[i];
		if (tempEid == emp.empid) 
		{	
			System.out.println("eid: "+emp.empid);
			System.out.println("esalary: "+emp.esal);
			System.out.println("emobile: "+emp.emobile);
			empArray[i] = null;
			System.out.println(emp.empid);
			break;
	}
	}
	}
//		System.out.println("enter id");
//		int temp=s.nextInt();
//		for(int i=0;i<=empArray.length-1;i++)
//		{
//			ArrayEmployee ae=(ArrayEmployee)empArray[i];
//			if(ae.empid==temp)
//			{
//				ae.empid=0;
//				ae.esal=0.0;
//				ae.emobile=0;
//				
//				empArray[i]=ae;
//				//empArray[i]=null;
//			
			//	System.out.println("empid="+ae.empid+" esal="+ae.esal+ "number="+ae.emobile);
				//System.out.println("enter updated salary");
				//int e1=s.nextInt();
				//ae.esal=e1;
				//empArray[i]=ae;
			//	System.out.println(ae.esal)
		//dispEmp();
	public static void main(String[] args) 
	{
		ArrayEmployee ae=new ArrayEmployee();
		System.out.println("options");
		
		System.out.println("1.insert employee");
		System.out.println("2.update employee");
		System.out.println("3.delete employee");
		System.out.println("4.search employee");
		System.out.println("5. display employee");
		System.out.println("6.exit employee");
		
		for(int k=1;k<=5;k++)
		{
			System.out.println("select any options");
			int z=s.nextInt();
			switch(z)
			{
			case 1:
			{
				insertData();
				break;
			}
			
			case 2:
			{
				ae.updateEmp();
				break;
			}
			case 3:
			{
				ae.deleteEmp();
				break;
			}
			case 4:
			{
				ae.searchEmp();
				break;
			}
			case 5:
			{
				dispEmp();
				break;
			}
			case 6:
			{
				
			}
			}
		}
		//insertData();
		//dispEmp();
		//ArrayEmployee ae=new ArrayEmployee();
		//ae.updateEmp();
		//ae.dispEmp();
		//ae.deleteEmp();
	//	Scanner s=new Scanner(System.in);
		//ae.searchEmp();
	}
}
