package com.vtalent.sahithi;
import java.util.Scanner;
public class CaseEmp 
{
	int eId;
	double eSalary;
	long eMobile;
	static CaseEmp[] empArray=new CaseEmp[4];
	public static void insertData(){
		for(int i=0;i<=empArray.length-1;i++)
		{
			CaseEmp emp=new CaseEmp();
			emp.eId=100+i;
			emp.eSalary=2500*(10+i);
			emp.eMobile=70754435+(i*2);
			empArray[i]=emp;
			System.out.println("Id="+emp.eId +" "+"Salary="+emp.eSalary +" "+"Mobile="+emp.eMobile);
		}
		
	}
	
	public static void Update(){
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter eId");
		int tempeId=sc1.nextInt();
		for(int i=0;i<=empArray.length-1;i++)
		{
			CaseEmp emp=(CaseEmp)empArray[i];
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
				
	}
		}}
	public static void Delete()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter eId");
		int tempeId=sc.nextInt();
		for(int i=0;i<=empArray.length-1;i++)
		{
			CaseEmp emp=(CaseEmp)empArray[i];
			if(tempeId==emp.eId)
			{
				System.out.println("Id="+emp.eId +" "+"Salary="+emp.eSalary +" "+"Mobile="+emp.eMobile);
				empArray[i]=null;
	}
		}
	}
	public static void Search()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter eId");
		int tempeId=sc.nextInt();
		for(int i=0;i<=empArray.length-1;i++)
		{
			CaseEmp emp=(CaseEmp)empArray[i];
			if(tempeId==emp.eId)
			{
				System.out.println("Id="+emp.eId +" "+"Salary="+emp.eSalary +" "+"Mobile="+emp.eMobile);
				
	}
			
		}
	}
	public static void main(String args[])
	{
		
		CaseEmp c=new CaseEmp();
		System.out.println("select one choice");
		System.out.println("1:insert Emp");
		System.out.println("2:Update Emp");
		System.out.println("3:Delete Emp");
		System.out.println("4:Search Emp");
		System.out.println("5:Display all Emp");
		System.out.println("6:Exit");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice");
		int k=sc.nextInt();
	switch(k)
	{
	case 1:
		insertData();
		break;
	case 2:
		Update();
		break;
	case 3:
		Delete();
		break;
	case 4:
		Search();
		break;
	
	}
		}
	
	
	}
	
	