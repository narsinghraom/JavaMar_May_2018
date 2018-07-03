package com.vtalent.sahithi;
import java.util.Scanner;
public class Empdetails {
	int eId;
	double eSalary;
	long eMobile;
	static Empdetails[] empArray=new Empdetails[4];
	public static void insertData(){
		for(int i=0;i<=empArray.length-1;i++)
		{
			Empdetails emp=new Empdetails();
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
			Empdetails emp=(Empdetails)empArray[i];
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
			Empdetails emp=(Empdetails)empArray[i];
			if(tempeId==emp.eId)
			{
				System.out.println("Id="+emp.eId +" "+"Salary="+emp.eSalary +" "+"Mobile="+emp.eMobile);
				break;
			}
		
	}

	}}
