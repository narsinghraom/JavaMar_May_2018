package com.vtalent.branch.two.sathvik;

public class Demo {
int i,j;
Demo()
{
i=i+i;
j=j+j;
}
Demo (int i)
{
	this();
	this.i=this.i+i;
	this.j=this.i+i;
	
}
Demo(int i, int j)
{
	this(j);
	this.i=this.i+i;
	this.j=this.i+this.i;
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Demo d3=new Demo(5,3);
System.out.println(d3.i);
System.out.println(d3.j);
	}

}
