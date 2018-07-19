package com.vtalent.sowmya.Encap;

abstract class Calculator 
{
	public void add(int i,int j)
	{
	System.out.println(i+j);
}

	public void sub(int i,int j)
	{
	System.out.println(i-j);
}
	public abstract void div(int i,int j);
	public abstract void mul(int i,int j);
}
class CalculatorImpl extends Calculator
{
	
	public void div(int i,int j)
	{
	System.out.println(i/j);
}
	public void mul(int i,int j)
	{
	System.out.println(i*j);
}
}
class Abstract
{
	public static void main(String args[])
	{
		CalculatorImpl c=new CalculatorImpl();
		c.div(2,3);
		c.mul(2,8);
		c.add(4,3);
		c.sub(2,5);
		
	}
}
