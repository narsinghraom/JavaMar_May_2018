package src.com.vtalent.swathi;

 import java.util.Scanner;

	  class ArraySal1
	  {
	               int eid;
	 			 double esalary;
	 			 long emobile;
	 			 static ArraySal1[] empArray=new ArraySal1[4];
	 			 public static void insertData()
	 			 {
	 				 for(int i=0;i<=empArray.length-1;i++)
	 				 {
	 					 ArraySal1 emp=new ArraySal1();
	 					 emp.eid=100+i;
	 					 emp.esalary=2500*(10+i);
	 					 emp.emobile=789383+(i*2);
	 					 empArray[i]=emp;
	 				 }
	 			 }
	 			 
	 				 
	 					  
	 				 
	 				 public static void displayEmp()
	 				 {
	 					 for(int i=0;i<=empArray.length-1;i++)
	 					 {
	 						 if(null!=empArray[i])
	 						 {
	 						 ArraySal1 emp=(ArraySal1)empArray[i];
	 				 System.out.println("id="+emp.eid+"salary="+emp.esalary+"mobile="+emp.emobile);
	 				 
	 						 }
	 					 }
	 		 }
	 				 public static void displayOne()
	 				 {

 						 Scanner sc=new Scanner(System.in);
	 					 System.out.println("enter the input");
	 					 int temp=sc.nextInt();
	 				
	 					 for(int i=0;i<=empArray.length-1;i++)
	 					 {

	 					 	 ArraySal1 emp=(ArraySal1)empArray[i];
	 					
	 					 if(temp==(emp.eid))
						 {
							 System.out.println(emp.eid+" "+emp.esalary+" "+emp.emobile);
							 System.out.println("enter the amount to update the salary");
							 
							 int s=sc.nextInt();
							 emp.esalary=emp.esalary+s;
						//empArray[i]=emp;
							 empArray[i]=null;
							 
							  System.out.println(emp.eid+" "+emp.esalary+" "+emp.emobile);
							  break;
						 }
	 					 else
	 					 
	 						 System.out.println("please enter the input again");
	 					 
	 					 
	 					 }
	 					 
	 					 
	 				 }

	 		
	 				 public static void main(String[] args)
	 				 {
	 					 insertData();
	 					 displayEmp();
	 					 displayOne(); 
	 				 }
	 				
	  }


	  




