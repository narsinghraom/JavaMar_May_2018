package com.vtalent.branch.three.srilakshmi;

public class Examplecon {
	static int i,j;
	double d1;
	Examplecon()
	{
	this(2,3);
	i=10;
	j=i+10;
	}
 Examplecon(double d1)
 {
	this.d1= d1+d1; 
 }
 Examplecon(int i,int j)
 { 
	 this(1.0);
	Examplecon.i=Examplecon.i+i;
	Examplecon.j=Examplecon.j+j;
	
 }
	public static void main(String[] args)
	{
		Examplecon e1=new Examplecon();
		System.out.println(e1.d1);
		System.out.println(i);
		System.out.println(j);
		
		
		// TODO Auto-generated method stub

	}

}
