package com.vtalent.branch.three.srilakshmi;

public class Demo1 {
		int i,j;
		Demo1()
		{
			this(2);
			i=i+j;
			j=i+j;
		}
		Demo1(int i)
		{
			this.i=this.i+i;
			j=this.i+i;
		}
		Demo1(int i,int j)
		{
			this();
			this.i=this.i+i;
			this.j=this.j+j;
		}
		public static void main(String[] args) {
			Demo1 d1=new Demo1(2,3);
			System.out.println(d1.i);
			System.out.println(d1.j);
			
		}


	}



