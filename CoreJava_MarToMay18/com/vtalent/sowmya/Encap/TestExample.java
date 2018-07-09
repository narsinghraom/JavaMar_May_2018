package com.vtalent.sowmya.Encap;

import java.util.Scanner;

public class TestExample {
	static Example[]exaArray=new Example[5];

		public static void insertData()
		{
			
					
			for(int i=0;i<=exaArray.length-1;i++)
			{
				Example exa=new Example();
				exa.setEmpId(100+i);
				exa.setSalary(2500*(10+i));
				exa.setMobile(924696+(i*2));
				exaArray[i]=exa;
			}
			displayData();
		}
			public static void displayData()
			{
				for(int i=0;i<=exaArray.length-1;i++)
				{
				Example exa=(Example)exaArray[i];
				System.out.println("ID="+exa.getEmpId()+ "SALARY="+exa.getSalary()+"MOBILE="+exa.getMobile());
				
			}
			}
			public static void updateData()
			{
				Scanner s=new Scanner(System.in);
				 System.out.println("enter the employee id");
				 int empid=s.nextInt();
				 for(int i=0;i<=exaArray.length-1;i++)
				 {
					 Example exa=(Example)exaArray[i];
					 if(empid==exa.getEmpId())
					 {
						 System.out.println(exa.getEmpId()+" "+exa.getSalary()+" "+exa.getMobile());
						 System.out.println("enter the updated salary");
						 double sal=s.nextDouble();
						 exa.setSalary(sal);
						 exaArray[i]=exa;
						 System.out.println("the salary is updated");
						 displayData();
						 break;
					 }
				 }
			 }
				public static void deleteData()
				{
					Scanner s=new Scanner(System.in);
					System.out.println("enter employee id");
					int empid=s.nextInt();
					for(int i=0;i<=exaArray.length-1;i++)
					{
						Example exa=(Example)exaArray[i];
						if(empid==exa.getEmpId())
						{
							exaArray[i]=null;
							System.out.println("one employee is deleted");
						}
					}
				}
				public static void searchData()
				{
					Scanner s=new Scanner(System.in);
					System.out.println("enter employee id:");
					int empid1=s.nextInt();
					for(int i=0;i<=exaArray.length-1;i++)
					{
						if(null!=exaArray[i])
						{
						Example exa=(Example)exaArray[i];
						if(exa.getEmpId()==empid1)
						{
							System.out.println("ID="+exa.getEmpId()+ "SALARY="+exa.getSalary()+"MOBILE="+exa.getMobile());
						
						
						break;
						}
						}
					}
				}
				
				public static void show()
				{
					System.out.println("Exit the Condition");
				}

			
			public static void main(String args[])
			{
				System.out.println("SELECT OPTIONS:");
				System.out.println("1.Insert Data");
				System.out.println("2.Display Data");
				System.out.println("3.Update Data");
				System.out.println("4.Delete Data");
				System.out.println("5.Search Data");
				System.out.println("6.Exit Data");
				Scanner sc=new Scanner(System.in);
				{
					for(int z=0;z<=5;z++)
					{
						System.out.println("Select your Option:");
						int temp=sc.nextInt();
						switch(temp)
						{
						case 1:
						{
							insertData();
							System.out.println("Data is inserted");
							System.out.println("*******************");
							break;
						}
						case 2:
						{
							displayData();
							System.out.println("Data is dispalyed");
							System.out.println("*******************");
							break;
						}
						case 3:
						{
							updateData();
							System.out.println("Data is Upated");
							System.out.println("****************");
							break;
						}
						case 4:
						{
							deleteData();
							System.out.println("Data is deleted");
							System.out.println("*****************");
							break;
						}
						case 5:
						{
							searchData();
							System.out.println("Data is searched");
							System.out.println("******************");
							break;
							
						}
							
						case 6:
						{
							show();
							System.out.println("Data is Exited");
							System.out.println("****************");
							break;
						}
						}
					}
				}
			}
}
							
						

			
	


