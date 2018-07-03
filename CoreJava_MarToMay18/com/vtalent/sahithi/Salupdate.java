package com.vtalent.sahithi;
import java.util.Scanner;
public class Salupdate {
	int eId;
	double eSalary;
	long eMobile;
	static Salupdate[] empArray=new Salupdate[4];
	public static void insertData(){
		for(int i=0;i<=empArray.length-1;i++)
		{
			Salupdate emp=new Salupdate();
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
		update();
		
	}
	public static void displayEmp()
	{
		for(int i=0;i<=empArray.length-1;i++)
		{
			Salupdate emp=(Salupdate)empArray[i];
			System.out.println("Id="+emp.eId +" "+"Salary="+emp.eSalary +" "+"Mobile="+emp.eMobile);
		}
			
	}
	public static void update()
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter eId");
		int tempeId=sc1.nextInt();
		for(int i=0;i<=empArray.length-1;i++)
		{
			Salupdate emp=(Salupdate)empArray[i];
			if(tempeId==emp.eId)
			{
				Scanner sc2=new Scanner(System.in);
				System.out.println("enter esalary");
				emp.eSalary=sc2.nextDouble();
				Scanner sc3=new Scanner(System.in);
				System.out.println("enter eMobile");
				emp.eMobile=sc3.nextLong();
				
				empArray[i]=emp;
				System.out.println("Id="+emp.eId +" "+"Salary="+emp.eSalary +" "+"Mobile="+emp.eMobile);
				break;
			}
		
	}

	}}



