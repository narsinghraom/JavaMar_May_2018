package com.vtalent.sahithi;

public class Strng {
	public static void main(String args[])
	{
		String s1=new String("sah");
		System.out.println(s1);
		String s2="sah";
		System.out.println(s2);
		String s3="has";
		System.out.println(s3);
		String s4=new String("sah");
		System.out.println(s4);
		if(s1.equals(s3))//content should be compared
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("not equal");
		}
		/*if(s1==s3)//obj ref should be compared
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("not equal");
		}*/
		 s1=new String("def");//the object sah will be deleted and def is replaced (deleting the obj and assigning by new value as def)
		
		System.out.println(s1);
		if(s1.equals(s3))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("not equal");
		}
		s2=s1;
		System.out.println(s2);
		s1=s3;
		System.out.println(s1);
		s1=s1+s2;
		System.out.println(s1);
		s4=s4+"sra";
		System.out.println(s4);
	}
}
		 
		
		
		
		
		
		
		
		
		
	


