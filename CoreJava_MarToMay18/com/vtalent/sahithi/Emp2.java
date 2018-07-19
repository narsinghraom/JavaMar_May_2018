package com.vtalent.sahithi;
import java.util.Scanner;
public class Emp2 {
	int eId;
	double eSalary;
	long eMobile;
	static Emp2[] empArray=new Emp2[4];
	public static void insertData(){
		for(int i=0;i<=empArray.length-1;i++)
		{
			Emp2 emp=new Emp2();
			emp.eId=100+i;
			emp.eSalary=2500*(10+i);
			emp.eMobile=70754435+(i*2);
			empArray[i]=emp;
		}
	}
	public static void displayData(){
		for(int i=0;i<=empArray.length-1;i++)
		{
		Emp2 emp=(Emp2)empArray[i];
		System.out.println("Id="+emp.eId +" "+"Salary="+emp.eSalary +" "+"Mobile="+emp.eMobile);
	}
	}
	public static void displayOne()
	{
		for(int i=0;i<=empArray.length-1;i++)
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("update the salary for Emp2"+" "+i);
			int temp=sc.nextInt();
			Emp2 emp=(Emp2)empArray[i];
			emp.eSalary=temp;
			System.out.println("Id="+emp.eId +" "+"Salary="+emp.eSalary +" "+"Mobile="+emp.eMobile);
			
		}
	}
	public static void main(Strng args[])
	{
		insertData();
		displayData();
		displayOne();
	}
		
	}


