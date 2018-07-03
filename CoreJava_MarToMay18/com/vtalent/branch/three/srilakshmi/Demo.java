package com.vtalent.branch.three.srilakshmi;

public class Demo {
	int i,j;
	Demo()
	{
		this(2);
		i=i+j;
		j=i+j;
	}
	Demo(int i)
	{
		this(i,i);
		this.i=this.i+i;
		j=this.i+i;
	}
	Demo(int i,int j)
	{
		this.i=this.i+i;
		this.j=this.j+j;
	}
	public static void main(String[] args) {
		Demo d1=new Demo();
		System.out.println(d1.i);
		System.out.println(d1.j);
		
	}


}
