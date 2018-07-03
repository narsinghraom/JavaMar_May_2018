package com.vtalent.branch.two.sathvik;

public class Example {
	
	int i,j;
	Example()
	{
		i=i+j;
		j=i+j;
	}
	Example (int i)
	{
		this.i=this.i+i;
		this.j=this.j+i;
		
	}
	Example (int i, int j)
	{
	this.i = this.i+i;
	this.j=this.j+j;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example e1 = new Example();
		Example e2= new Example (3);
		Example e3= new Example(4, 5);
System.out.println(e1.i);
System.out.println(e2.i);
System.out.println(e1.j);
System.out.println(e2.j);
System.out.println(e3.i);
System.out.println(e3.j);

	}

}
