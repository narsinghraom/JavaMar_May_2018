package com.vtalent.branch.three.srilakshmi;

public class Examplecon1 {
		static int i,j;
		double d1;
		Examplecon1()
		{
		this(1.0);
		i=10;
		j=i+10;
		}
	 Examplecon1(double d1)
	 {
		this.d1= d1+d1; 
	 }
	 Examplecon1(int i,int j)
	 {
		this(); 
		Examplecon1.i=Examplecon1.i+i;
		Examplecon1.j=Examplecon1.j+j;
		
	 }
		public static void main(String[] args)
		{
			Examplecon1 e1=new Examplecon1(2,3);
			System.out.println(e1.d1);
			System.out.println(i);
			System.out.println(j);
			
			
			// TODO Auto-generated method stub

		}

	}


