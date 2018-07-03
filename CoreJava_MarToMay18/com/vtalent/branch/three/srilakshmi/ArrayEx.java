package com.vtalent.branch.three.srilakshmi;

public class ArrayEx {
	static ArrayEx[] eArray=new ArrayEx[2];
	int empId;
	double empSalary;
	public static void function()
	{
		ArrayEx e=null;
		for(int i=0;i<=eArray.length-1;i++)
		{
		e=new ArrayEx();
		e.empId=100+i;
		e.empSalary=25000.00;
		eArray[i]=e;
		}
	}
	public static void main(String[] args) {
		function();
		for(int i=0;i<=eArray.length-1;i++)
		{
			if(eArray[i]!=null)
			{
				ArrayEx e1=eArray[i];
				System.out.println("Employee id:"+e1.empId);
				System.out.println("Employee salary:"+e1.empSalary);
			}
		}
	}

}
