package com.vtalent.sahithi;

public class First {
	int i,j;
	public void function(int i)
	{
		this.i=this.i+i;
		j=i*i;
	}
}
class Second extends First
{
	int i;
	public void function(int i,int j)
	{
		this.i=i+j;
		this.j=i+j+this.j;
	}
	
}
