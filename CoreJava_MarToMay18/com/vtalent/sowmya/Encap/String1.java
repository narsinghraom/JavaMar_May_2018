package com.vtalent.sowmya.Encap;

public class String1 {
	public static void main(String args[])
	{
		String s1=new String("Abc");
		System.out.println(s1);
		System.out.println("*********************************************");
		
		
		
		String s2="cbc";
		System.out.println(s2);
		System.out.println("*********************************************");
		
		
		
		String s3="zbc";
		
		System.out.println(s3);
		System.out.println("*********************************************");
		
	/*	if(s1.equals(s3)) compares the content of s1 and s3
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}*/
		
		
		
		if(s1==s3)
		{
			System.out.println("false");//compare the refference of s1 and s2
		}
		else
		{
			System.out.println("true");
		}
	
	s1=new String("Def");//here previous refference abc deleted replaced with def
	System.out.println(s1);
	}
}


	
