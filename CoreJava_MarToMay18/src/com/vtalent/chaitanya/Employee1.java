
/*encapsulation example*/
package src.com.vtalent.chaitanya;

public class Employee1 
{
private int empid;
private double empsalary;
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public double getEmpsalary() {
	return empsalary;
}
public void setEmpsalary(double empsalary) {
	this.empsalary = empsalary;
}
public static void main(String[] args)
{
	Employee1 emp=new Employee1();
	emp.setEmpsalary(25000.00);
	emp.setEmpid(101);
	System.out.println(emp.empid+" \t "+emp.empsalary);
}
}
