package com.vtalent.branch.three.srilakshmi;

public class sample {
	int i;
	static float f;
	public void function()
	{
		i=5;
		f=i;
	}
	public static int function(float f)
	{
		sample.f=sample.f+f;
		return(int)sample.f;
	}

	public static void main(String[] args)
	{
		sample sample=new sample();
		sample.function();
		int k=function(1.5f);
		System.out.println(k);
		System.out.println(sample.i);
		System.out.println(f);
		System.out.println(sample);
		
		// TODO Auto-generated method stub

	}

}
