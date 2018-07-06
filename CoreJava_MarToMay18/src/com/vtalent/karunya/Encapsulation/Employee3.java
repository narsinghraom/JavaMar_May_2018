package src.com.vtalent.karunya.Encapsulation;

public class Employee3 {

	static Employee6[] emparray=new Employee6[4];
	public static void insertData()
	{

		for(int i=0;i<=emparray.length-1;i++)
			
		{
			Employee6 emp=new Employee6();
			emp.setEmpId(100+i);
			emp.setEmpSalary(2500+(i*2));
			
			emparray[i]=emp;
			
		}
	}
   public static void displayData()
   {	
	for (int i=0;i<=emparray.length-1;i++)
	{
			Employee6 emp=(Employee6)emparray[i];
			System.out.println("Id="+emp.getEmpId()+ "Salary="+emp.getEmpSalary());
	}
   }
   public static void main(String[] args)
		   {
	         insertData();
	         displayData();
	   
	   		   }
			
}
			
			
			