package com.vtalent.sahithi;

import java.util.Scanner;

public class Empdel {
	int eId;
	double eSalary;
	long eMobile;
	static Empdel[] empArray=new Empdel[4];
	public static void insertData(){
		for(int i=0;i<=empArray.length-1;i++)
		{
			Empdel emp=new Empdel();
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
		display();
		
	}
	public static void displayEmp()
	{
		for(int i=0;i<=empArray.length-1;i++)
		{
			Empdel emp=(Empdel)empArray[i];
			System.out.println("Id="+emp.eId +" "+"Salary="+emp.eSalary +" "+"Mobile="+emp.eMobile);
		}
			
	}
	public static void display()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter eId");
		int tempeId=sc.nextInt();
		for(int i=0;i<=empArray.length-1;i++)
		{
			Empdel emp=(Empdel)empArray[i];
			if(tempeId==emp.eId)
			{
				System.out.println("Id="+emp.eId +" "+"Salary="+emp.eSalary +" "+"Mobile="+emp.eMobile);
				empArray[i]=null;
				break;
			}
		
	}

	}}



