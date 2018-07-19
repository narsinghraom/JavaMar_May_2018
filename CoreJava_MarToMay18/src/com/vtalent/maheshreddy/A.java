package com.vtalent.maheshreddy;

import aadhya.Sampleprogram;

public class A 
{
	static int i;
	static float f1,f2;
	public void function()
	{
		f1=5.0f;
		f2=5.5f;
	}
	public static float functiontwo(int i)
	{
		A.i=i;
		return(float)A.i;
	}
		
	public static void main(String[] args) 
	{
		A array=new A ();
		array.function();
		
		//int p;
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(i);
		//System.out.println(l);
		//System.out.println(R);
		//System.out.println(M);
		
		

	}

}
