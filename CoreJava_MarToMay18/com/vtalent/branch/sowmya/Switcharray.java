package com.vtalent.branch.sowmya;

import java.util.Scanner;

public class Switcharray {
	int id;
   double sal;
   long mobile;
   public static void  setsArray(Switcharray[] sArray) 
   {
	   Switcharray.sArray=sArray;
   }
	static Switcharray[] sArray=new Switcharray[2];
	public static void insertEmployee()
	{
		Switcharray s=new Switcharray();
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<=sArray.length-1;i++)
		{
		System.out.println("ENTER AN EMPLOYEE DETAILS:");
		System.out.println("Enter an Id:");
		int id=sc.nextInt();
		s.id=id;
		
		System.out.println("ENTER AN SALARY:");
		Scanner ab=new Scanner(System.in);
		double sal=ab.nextDouble();
		s.sal=sal;
		
		System.out.println("ENTER AN MOBILE NO:");
		Scanner cd=new Scanner(System.in);
		long mobile=cd.nextLong();
		s.mobile=mobile;
		sArray[i]=s;
		System.out.println(id+" "+sal+" "+mobile);
		System.out.println(" VALUES ARE INSERTED ");
		}
	}
	
		public static  void displayEmp()
		{
			for(int i=0;i<=sArray.length-1;i++)
			{
				Switcharray s=(Switcharray)sArray[i];
				System.out.println("id="+s.id+"sal="+s.sal+"mobile="+s.mobile);
			
		}
		}
		
	
		public static void updateEmployee()
		{
			/*for(int i=0;i<=sArray.length-1;i++)
			{
				Scanner sc1=new Scanner(System.in);
				double sal=sc1.nextDouble();
				Switcharray s=(Switcharray)sArray[i];
				s.sal=s.sal+sal;
				sArray[i]=s;
				System.out.println(s.id+" "+s.sal+" "+s.mobile);
				
				
		}*/
			Scanner sc1=new Scanner(System.in);
			
			System.out.println("ENTER ID:");
			int temp=sc1.nextInt();
			for(int i=0;i<=sArray.length-1;i++)
			{
				Switcharray se=(Switcharray)sArray[i];
				if(se.id==temp)
				{
					System.out.println(se.id+" "+se.sal+" "+se.mobile);
					System.out.println("ENTER UPDATED SALARY");
					int e1=sc1.nextInt();
//					Switcharray s=(Switcharray)sArray[i];
				se.sal=e1;
					sArray[i]=se;
					break;
				}
			
					
				}
			}
		public static void deleteEmployee()
		{
			Scanner sc=new Scanner(System.in);
			int tempid=sc.nextInt();
			for(int i=0;i<=sArray.length-1;i++)
			{
				Switcharray emp=(Switcharray)sArray[i];
				if(tempid==emp.id)
				{
					System.out.println("id:"+emp.id);
					System.out.println("sal:"+emp.sal);
					System.out.println("mobile:"+emp.mobile);
					sArray[i]=null;
					System.out.println(emp.id);
					break;
				}
			}
		}
		public static void searchEmployee()
		{
			Scanner sc2=new Scanner(System.in);
			System.out.println("Enter an Id:");
			
		}


			
		
			
	
	 
	public static void main(String[] args)
	{
		insertEmployee();
		displayEmp();
		Switcharray ss=new Switcharray();
		System.out.println("SELECT AN OPTIONS");
		System.out.println("1.INSERT EMPLOYEE:");
		System.out.println("2.UPDATE EMPLOYEE:");
		System.out.println("3.DELETE EMPLOYEE:");
		System.out.println("4.SEARCH EMPLOYEE:");
		System.out.println("5.DISPLAY EMPLOYEE:");
		System.out.println("6.EXIT EMPLOYEE:");
		for(int j=1;j<=2;j++)
		{
Scanner sc=new Scanner(System.in);
		System.out.println(" SELECT ONE OPTION:");
		int ch=sc.nextInt();
	
		switch(ch)
		{
		
		case 1:
		{
			insertEmployee();
//			displayEmp();
		break;
		}
		case 2:
		{
			ss.updateEmployee();
		
		break;
	}
		case 3:
		{
			ss.deleteEmployee();
		
		break;
		}
		
		case 4:
		{
			ss.searchEmployee();
		break;
		}
		case 5:
		{
			ss.displayEmp();
		
			break;
		}
		/*case 6:
		{
			ss.exit();
		
			break;
		}*/
		
	}
		}
	}
	}
	
	


		
		

	


