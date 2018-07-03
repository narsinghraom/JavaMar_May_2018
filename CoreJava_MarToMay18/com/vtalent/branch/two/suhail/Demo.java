package com.vtalent.branch.two.suhail;

public class Demo {
	int i, j;
	public Demo() {
		this(2);
		i = i + j;
		j = i + j;
	}
	Demo(int i)
	{
		this(i,4);
		this.i = i + j; //4
		this.j = i + j; //8
	}
	Demo(int i, int j)
	{
		this.i = i + j;
		this.j = i + j;
	}
	public static void main(String[] args) {
		Demo d1 = new Demo();
		System.out.println(d1.i);
		System.out.println(d1.j);
		
		Demo d2 = new Demo(2);
		System.out.println(d2.i);
		System.out.println(d2.j);
		
		Demo d3 = new Demo(5,3);
		System.out.println(d3.i);
		System.out.println(d3.j);
		
	}

}
