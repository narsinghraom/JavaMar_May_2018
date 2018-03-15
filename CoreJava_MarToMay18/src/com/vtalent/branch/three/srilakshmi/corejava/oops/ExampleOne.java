package com.vtalent.branch.three.srilakshmi.corejava.oops;

 class Example
 {
	int i,j;
	static float f1;
	public int function(int i,float f1)
	{
		ExampleOne.f1=f1+ExampleOne.f1;
		this.i=this.i+i;
		return(int)f1+i;
	}
	public static Example function(int j)
	{
		Example e=new Example();
		e.j=j+j;
		e.i=e.function(j,(float)j);
		return e;
		}
	public float function(float f1)
	{
		ExampleOne.f1=ExampleOne.f1+f1;
		return f1;
	}
 }
	public class ExampleOne extends Example
	{
		int i;
		public int function(int i,float f1)
		{
			super.i=super.i+i;
			this.i=super.i+this.i;
			ExampleOne.f1=f1+ExampleOne.f1;
			return i;
		}
			
		}
	


