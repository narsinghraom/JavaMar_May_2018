package src.com.vtalent.karunya.Encapsulation;

public class Test1 {
	public static void main(String[] args){
		Employee emp=new Employee();
		emp.setEmpId(100);
		emp.setEmpSalary(25000);
		System.out.println("Id="+emp.getEmpId());
        System.out.println("Salary="+emp.getSalary());	    	
}
	}



