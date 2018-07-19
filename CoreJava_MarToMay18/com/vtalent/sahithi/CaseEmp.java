package com.vtalent.sahithi;
import java.util.Scanner;
public class CaseEmp 
{
	int eId;
	double eSalary;
	long eMobile;
	static Scanner sa=new Scanner(System.in);
	static CaseEmp[] empArray=new CaseEmp[4];
	public static void insertData(){
		for(int i=0;i<=empArray.length-1;i++)
		{
			CaseEmp emp=new CaseEmp();
			emp.eId=100+i;
			emp.eSalary=2500*(10+i);
			emp.eMobile=70754435+(i*2);
			empArray[i]=emp;
			//System.out.println("Id="+emp.eId +" "+"Salary="+emp.eSalary +" "+"Mobile="+emp.eMobile);
			System.out.println("data inserted");
		}
		
	}
	
	public static void Update(){
		
		System.out.println("enter eId");
		int tempeId=sa.nextInt();
		for(int i=0;i<=empArray.length-1;i++)
		{
			CaseEmp emp=(CaseEmp)empArray[i];
			if(tempeId==emp.eId)
			{
				
				System.out.println("Id="+emp.eId +" "+"Salary="+emp.eSalary +" "+"Mobile="+emp.eMobile);
				
				System.out.println("enter esalary to update");
				double salary=sa.nextDouble();
				emp.eSalary=salary;
				
				empArray[i]=emp;
				System.out.println("Id="+emp.eId +" "+"Salary="+emp.eSalary +" "+"Mobile="+emp.eMobile);
				
	}
		}}
	public static void Delete()
	{
		
		System.out.println("enter eId");
		int temp=sa.nextInt();
		for(int i=0;i<=empArray.length-1;i++)
		{
			CaseEmp emp=(CaseEmp)empArray[i];
			if(emp.eId==temp)
			{
				
				
				empArray[i]=null;
				
				break;
	}
	}
	}
	public static void Search()
	{
		for(int i=0;i<=empArray.length-1;i++)
		
	{
		
		System.out.println("enter eId");
		int temp1=sa.nextInt();
		
			CaseEmp emp=(CaseEmp)empArray[i];
			if(emp.eId==temp1)
			{
				System.out.println("Id="+emp.eId +" "+"Salary="+emp.eSalary +" "+"Mobile="+emp.eMobile);	
			
	}
			
	}
	}
	public static void displayAllEmp()
	{
		for(int i=0;i<=empArray.length-1;i++)
		{
			if(null!=empArray[i])
			{
				
				CaseEmp emp=(CaseEmp)empArray[i];

			System.out.println("Id="+emp.eId +" "+"Salary="+emp.eSalary +" "+"Mobile="+emp.eMobile);
			}
	}
	}
		
	
	public static void main(Strng args[])
	{
		
		
		System.out.println("choices");
		System.out.println("1:insert Emp");
		System.out.println("2:Update Emp");
		System.out.println("3:Delete Emp");
		System.out.println("4:Search Emp");
		System.out.println("5:Display all Emp");
		System.out.println("6:Exit");
		for(int j=1;j!=6?true:false;)
		{
		
		System.out.println("enter your choice");
		int k=sa.nextInt();
		
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
	case 5:
		displayAllEmp();
		break;
	default :
		j=6;
		
	
	}
	}	
	
	}
	}
	
