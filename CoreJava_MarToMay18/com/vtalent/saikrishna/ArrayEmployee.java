package com.vtalent.saikrishna;

import java.util.Scanner;

public class ArrayEmployee 
{
	int empid;
	double esal;
	long emobile;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	public long getEmobile() {
		return emobile;
	}
	public void setEmobile(long emobile) {
		this.emobile = emobile;
	}

	
	/*static ArrayEmployee[] empArray=new ArrayEmployee[4];
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
	public static void disp()
	{
		for(int i=0;i<=empArray.length-1;i++)
		{
			ArrayEmployee emp=(ArrayEmployee)empArray[i];
			
			System.out.println("employeeid="+emp.empid+"empsal="+emp.esal+"empmobile="+emp.emobile);
		}
	}
	public void show()
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
	public static void main(String[] args) 
	{
		insertData();
		disp();
		ArrayEmployee ae=new ArrayEmployee();
		ae.show();
	//	ae.show();
	}*/
}
