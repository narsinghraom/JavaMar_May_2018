package com.vtalent.branch.one.karthik;

public class Demo1
{
	int i,j;
	Demo1()
	{
		i=i+j;
		j=i+j;
	}
		Demo1(int i)
		{
			this();
	     	this.i=this.i+i;
			j=this.i+i;
		}
		Demo1(int i,int j)
		{
			this(j);
			this.i=this.i+i;
			this.j=this.j+j;
			
		}

	

	public static void main(String args[])
	{
		Demo d1=new Demo();
		System.out.println(d1.i);
		System.out.println(d1.j);
		/*Demo d2=new Demo(2);
		System.out.println(d2.i);
		System.out.println(d2.j);*/
        Demo d3=new Demo(5,3);
		System.out.println(d3.i);
		System.out.println(d3.j);
		

	}

}


	


