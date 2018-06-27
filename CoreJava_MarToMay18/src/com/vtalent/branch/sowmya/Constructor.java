package com.vtalent.branch.sowmya;


public class Constructor {

	int i,j;
	Constructor()
	{
		i=5;
		j=7;
	}
	Constructor (int i)
	{
		this.i=i+i;
		this.j=i*i;
	}
	
	Constructor(int i,int j)
	{
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
		Constructor c=new Constructor();
		c.function();
		Constructor c1=new Constructor(2);
		c1.function();
		Constructor c2=new Constructor(2,2);
		c2.function();
		

	}

}
