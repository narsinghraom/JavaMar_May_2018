package com.vtalent.sahithi;

public class Test1 {
	static EncapsArray[] empArray=new EncapsArray[3];
	
	    public static void insert()
	    {
	    	
	    	for(int i=0;i<=empArray.length-1;i++)
	    	{
	    		EncapsArray emp=new EncapsArray();
	    		emp.setEid(100+i);
	    		emp.setEsal(2500*(100+i));
	    		empArray[i]=emp;
	    	}
	    }
	    public static void disp()
	    {
	    	for(int i=0;i<=empArray.length-1;i++)
	    	{
	    	EncapsArray emp=(EncapsArray) empArray[i];
	    	System.out.println("id="+emp.getEid()+" sal="+emp.getEsal());
	    
	    	
	    }
	    }
		
	
		
		
public static void main(String args[])
{
	
     insert();
     disp();
}
}
