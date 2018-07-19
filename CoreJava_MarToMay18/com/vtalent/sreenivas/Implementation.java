package com.vtalent.sreenivas;

public class Implementation implements Abc,Xyz
{
	public void function(int i)
	{
	i=(int)pi+i;
	System.out.println(i);
	}
	public void function(int i,int j)
	{
		i=i+j;
		j=i*j;
		System.out.println(i+j);
	}
	public void function(float f)
	{
		f=pi+f;
		System.out.println(f);
	}
}
