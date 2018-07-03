package com.vtalent.branch.two.suhail;

abstract class ExampleOne 
{
	int i;
	public void function(int i)
	{
		this.i = i + i;
	}
	public abstract void function();
}

class ExampleTwo extends ExampleOne
{
	public void function()
	{
		function(5);
	}
}
public class Test5 {

	public static void main(String[] args) {
//		ExampleOne e1 = new Example();
		ExampleTwo e2 = new ExampleTwo();
		e2.function();
		e2.function(2);
	}

}
