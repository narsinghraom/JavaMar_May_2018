package com.vtalent.ranjith;
import java.util.Scanner;
public class ArrayEmployee {
	int empId;
	//String empName;
	double eSal;
	long eMobile;
	static Scanner s=new Scanner(System.in);
	static ArrayEmployee[] empArray=new ArrayEmployee[4];

	public static void insertEmployee()
	{
		/*for(int i=0;i<=empArray.length-1;i++)
		{
			ArrayEmployee e=new ArrayEmployee();
			System.out.println("Enter employee Id");
			e.empId=s.nextInt();			
			System.out.println("Enter employee Salary");
			e.eSal=s.nextDouble();
			System.out.println("Enter mobile number");
			e.eMobile=s.nextLong();
			empArray[i]=e;
			System.out.println("====================");
		}*/

		for(int i=0;i<=empArray.length-1;i++)
		{
			ArrayEmployee e=new ArrayEmployee();
			e.empId=100+i;
			e.eSal=2500*(10+i);
			e.eMobile=8484848+(i*2);
			empArray[i]=e;		
		}
		System.out.println("==================================");

	}
	public static void update()
	{				
		System.out.println("enter id");
		int temp=s.nextInt();
		for(int i=0;i<=empArray.length-1;i++)
		{
			ArrayEmployee ae=(ArrayEmployee)empArray[i];
			if(ae.empId==temp)
			{
				System.out.println("empid="+ae.empId+"     esal="+ae.eSal+ "    number="+ae.eMobile);
				System.out.println("enter updated salary");
				double e1=s.nextDouble();
				ae.eSal=e1;
				empArray[i]=ae;		
				System.out.println("Employee "+ae.empId+" updated");
				break;
			}

		}
	}
	static void delete()
	{
		int count=0;
		System.out.println("enter id");
		int temp=s.nextInt();
		for(int i=0;i<=empArray.length-1;i++)
		{
			ArrayEmployee ae=(ArrayEmployee)empArray[i];
			if(ae.empId==temp)
			{
				empArray[i]=null;	
				count++;
				break;
				
			}
		}
		if(count==1) {
		System.out.println("Employee "+temp+" deleted");
		}
		else {System.out.println("employee not exist");}
		

	}
	public static void searchEmp()
	{
       
		System.out.println("enter employee id");
		int eid=s.nextInt();

		for(int i=0;i<=empArray.length-1;i++)
		{
			
			ArrayEmployee ae=(ArrayEmployee)empArray[i];

			if(ae.empId==eid)
			{
				System.out.println("ID="+ae.empId+ "     Syalar="+ae.eSal+"    Mobile="+ae.eMobile);
			}
			
			
		}

		
		System.out.println("===================================");
	}

	public static void dispAllEmployee()
	{
		System.out.println("===================================");
		for(int i=0;i<=empArray.length-1;i++)
		{	
			if(null!=empArray[i]) {
				ArrayEmployee ae=(ArrayEmployee)empArray[i];


				System.out.println("ID="+ae.empId+"    Salary="+ae.eSal+"    Mobile="+ae.eMobile);

			}

		}
		System.out.println("============================");
	}




	public static void main(String[] args) 
	{

		for(int z=1;z!=6?true:false;) {
			System.out.println(" Options are:");
			System.out.println("1.Insert Employee");
			System.out.println("2.Update Employee");
			System.out.println("3. Delete Employee");
			System.out.println("4.Search Employee");
			System.out.println("5.Display all Employee");
			System.out.println("6.Exit");
			System.out.println(" Select any Option:");
			int k=s.nextInt();
			switch(k) {
			case 1: { insertEmployee(); break;}
			case 2: { update(); break;}
			case 3: { delete(); break;}
			case 4: { searchEmp(); break;}
			case 5: { dispAllEmployee(); break;}

			default: {  z=6 ;}
			}

		}



	}
}
