package com.vtalent.saikrishna;


public class Test 
{
	 static ArrayEmployee[] empArray=new ArrayEmployee[4]; 

	public static void insertData()
	{
		for(int i=0;i<=empArray.length-1;i++)
		{
			ArrayEmployee e1=new ArrayEmployee();
			e1.setEmpid(1000+i);
			e1.setEmobile(93939+(i*i));
			e1.setEsal(5000+(i*2));
			empArray[i]=e1;
			//System.out.println("data inserted");
		}
	}
	
	public static void dispAllEmps()
	{
		for(int i=0;i<=empArray.length-1;i++)
		{
			ArrayEmployee e=(ArrayEmployee)empArray[i];
			System.out.println("id="+e.getEmpid()+"sal="+e.getEsal()+" number="+e.getEmobile());
		}
	}

  public static void main(String[] args) 
	{
		insertData();
		dispAllEmps();
	}
}
