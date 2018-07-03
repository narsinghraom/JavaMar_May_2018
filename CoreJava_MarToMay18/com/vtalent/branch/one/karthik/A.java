package com.vtalent.branch.one.karthik;

public class A
{
int i,j;
A()
{
	i=i+j;
	j=i+j;
}
	A(int i)
	{
		this();
     	this.i=this.i+i;
		j=this.i+i;
	}
	A(int i,int j)
	{
		this(j);
		this.i=this.i+i;
		this.j=this.j+j;
		
	}

	public static void main(String v[]) 
	{
		A d1=new A();
		System.out.println(d1.i);
		System.out.println(d1.j);
		/*Demo d2=new Demo(2);
		System.out.println(d2.i);
		System.out.println(d2.j);*/
        A d3=new A(5,3);
		System.out.println(d3.i);
	    System.out.println(d3.j);
	}	


	}


