package src.com.vtalent.swathi;
import java.util.Scanner;

public class Task {
	int id;
	double salary;
	long mobileno;
	static Task[] tArray=new Task[4];
	public static void insertEmployee()
	{
		
		 for(int i=0;i<=tArray.length-1;i++)
			 {
				 Task t=new Task();
				 t.id=100+i;
				 t.salary=2500*(10+i);
				 t.mobileno=789383+(i*2);
				 tArray[i]=t;
				 System.out.println(t.id+" "+t.salary+" "+t.mobileno);
				 System.out.println("inserted data");
			 }
		 }
		
	
	public static void updateEmployee()
	{
		Scanner sc0=new Scanner(System.in);
		 System.out.println("enter the id");
		 int temp=sc0.nextInt();

		for(int i=0;i<=tArray.length-1;i++)
		{
			 				 Task t=(Task)tArray[i];
			
			 if(temp==t.id)
		 {
			 System.out.println(t.id+" "+t.salary+" "+t.mobileno);
		
			System.out.println("enter the salary to update");
		 double sal=sc0.nextDouble();
		 
		 t.salary=t.salary+sal;
	 tArray[i]=t;	
	 System.out.println(t.id+" "+t.salary+" "+t.mobileno);
		 }	
	}
	}
	public static void deleteEmp()
	{
		 Scanner sc5=new Scanner(System.in);
		 System.out.println("enter the input");
		 int temp=sc5.nextInt();
		for(int i=0;i<=tArray.length-1;i++)
	
	 {

		 Task t=(Task)tArray[i];
	
	 if(temp==(t.id))
	 {
		 System.out.println(t.id+" "+t.salary+" "+t.mobileno);
		 System.out.println("enter the amount to update the salary");
		 Scanner sc6=new Scanner(System.in);
		 int s=sc6.nextInt();
	
		 tArray[i]=null;
		 
		 
		 
		  break;

	 }
	 }
	}
	public static void searchEmp()
	{
		 for(int i=0;i<=tArray.length-1;i++)
			 {

			 
				 Scanner st=new Scanner(System.in);
				 System.out.println("enter the input");
				 int t1=st.nextInt();
				 Task t=(Task)tArray[i];
			
			 if(t1==(t.id))
		 {
			 System.out.println(t.id+" "+t.salary+" "+t.mobileno);
	
	}
			 }
	}
	public static void displayAllEmployee()
	{
	
		 
			 for(int i=0;i<=tArray.length-1;i++)
			 {
				 if(null!=tArray[i])
				 {
				 Task t=(Task)tArray[i];
		 System.out.println("id="+t.id+"salary="+t.salary+"mobile="+t.mobileno);
				 }
			 
			 }
 }
	
	
	 public static void main(String args[])
		 {
		 
		
		 Scanner sc1=new Scanner(System.in);
		 System.out.println(" options:");
		 System.out.println("1:"+" "+"insert employee");
		 System.out.println("2:"+" "+"update employee:");
		 System.out.println("3:"+" "+"delete employee:");
		 System.out.println("4:"+" "+"search employee:");
		 System.out.println("5:"+" "+"display all employees:");
		 System.out.println("6:"+" "+"exit:");
		 for(int k=1;k<=6;k++)
		 {
		 System.out.println("select any option:");
		 int ch=sc1.nextInt();
		 
		 switch(ch)
		 {
		 case 1 :{
			 
			 insertEmployee();
			            break;
		 }
		 case 2 :{
			 
			 updateEmployee();
		               break;
		 }
		 case 3 :{
			 
		 
			 deleteEmp();
			 break;
		 }
		 case 4 :{
			 searchEmp();
			 break;
		 }
		 case 5 :{
			 displayAllEmployee();
			 break;
		 }
		 case 6 :{
			System.exit(0);
			System.out.println("exit condition");
		 }
		 }
		 }
		 }
}


