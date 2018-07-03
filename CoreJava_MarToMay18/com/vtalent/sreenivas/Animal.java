package com.vtalent.sreenivas;

import java.util.Scanner;

public class Animal
{
	int empid;
	double esalary;
	long emobile;
	static Animal[] animalarray=new Animal[4];
	public static void insertData()
	{
		for(int i=0;i<=animalarray.length-1;i++)
		{
			Animal an=new Animal();
			an.empid=50+i;
			an.esalary=2500+(i*2);
			an.emobile=888633823+i;
			animalarray[i]=an;
		}
	}
public static void displayData()
{
	for(int i=0;i<=animalarray.length-1;i++)
	{
		Animal an=(Animal)animalarray[i];
		System.out.println(an.empid+" "+an.esalary+" "+an.emobile);
	}
}
public static void search()
{
	//System.out.println("enter the option");
	Scanner s=new Scanner(System.in);
	System.out.println("enter the empid");
	int empid2=s.nextInt();
	for(int i=0;i<=animalarray.length-1;i++)
	{
		Animal an=(Animal)animalarray[i];
		if(an.empid==empid2)
		{
		System.out.println(an.empid+" "+an.esalary+" "+an.emobile);
		}
	}
	
}
/*public static void particularData()
{
	int temp=50;
	for(int i=0;i<=animalarray.length-1;i++)
	{
		Animal an=(Animal)animalarray[i];
		if(temp==an.empid)
		{
			System.out.println("empid is:"+an.empid);
			System.out.println("esalary is:"+an.esalary);
			System.out.println("emobile is:"+an.emobile);
		}
	}
}*/
public static void updateData()
{
	//int temp=50;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the employee id");
	int empid=s.nextInt();
	for(int i=0;i<=animalarray.length-1;i++)
	{
		Animal an=(Animal)animalarray[i];
		if(empid==an.empid)
		{
			System.out.println("empid is:"+an.empid);
			System.out.println("esalary is:"+an.esalary);
			System.out.println("emobile is:"+an.emobile);
			System.out.println("enter the updated salary");
			double esalary=s.nextInt();
			an.esalary=esalary;
			/*an.esalary=25000;
			an.emobile=8899;*/
			animalarray[i]=an;
			/*System.out.println("updated employee salary is:"+an.esalary);
			System.out.println("updated employee mobile number is:"+an.emobile);*/
			 //displayData();
			break;
		}
	}
}
public static void deleteData()
{
	//int temp=50;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the employee id");
	int empid1=s.nextInt();
	for(int i=0;i<=animalarray.length-1;i++)
	{
		Animal an=(Animal)animalarray[i];
		if(empid1==an.empid)
		{
			System.out.println("empid is:"+an.empid);
			System.out.println("esalary is:"+an.esalary);
			System.out.println("emobile is:"+an.emobile);
			animalarray[i]=null;
			System.out.println(an.empid);
			break;
			//System.out.println("enter the updated salary");
			//double esalary=s.nextInt();
			//an.esalary=esalary;
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the option");
		
		System.out.println("1.insert employee");
		System.out.println("2.update employee");
		System.out.println("3.delete employee");
		System.out.println("4.search employee");
		System.out.println("5. display employee");
		System.out.println("6.exit employee");
		for(int i=0;i<=5;i++)
		{
			System.out.println("select option");
		//Scanner s=new Scanner(System.in);
		int option=s.nextInt();
		switch(option)
		{
		case 1:{
			insertData();
        /*System.out.println("data is inserted");
        System.out.println("====================");*/
        break;}
		case 2:{
			updateData();
		/*System.out.println("data is displayed");
		System.out.println("=======================");*/
		break;}
		case 3:{
			deleteData();
		/*System.out.println("one employee data is retrived");
		System.out.println("============================");*/
		break;}
		case 4:{
			search();
		//System.out.println("=======================");
		//System.out.println("data is updated");
		break;}
		//System.out.println("==========================");
		case 5:{
			displayData();
			//System.out.println("no data found");
			break;}
		case 6:{;}
		}
 /*insertData();
 displayData();
 System.out.println("==========================");
 particularData();
 System.out.println("=============================");
 updateData();
 System.out.println("===========================");*/
	}
	}
}
