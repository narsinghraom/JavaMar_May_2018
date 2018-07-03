package com.vtalent.branch.sowmya;


public class Constructor5 {
	int i,j;
	Constructor5()
	{
		this(2,2);
		i=5;
		j=7;
	}
	Constructor5 (int i)
	{
		this.i=i+i;
		this.j=i*i;
	}
	
	Constructor5(int i,int j)
	{
		this(i);
		this.i=i+j;
		this.j=i*j;
	}
	public void function()
	{
		System.out.println(i);
		System.out.println(j);
	}
	public static void main(String args[])
	{
		Constructor5 c=new Constructor5();
		c.function();
		
		
	}
}

