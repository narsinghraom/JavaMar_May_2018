package com.vtalent.saikrishna;

public class SampleTest 
{
	public static void main(String[] args)
	{
		Sample3 s3=new Sample3();
		s3.function(25,1.3f);
		System.out.println(s3.l+" "+s3.f1); //25,1.3
		
		s3.function((int)s3.l);
		System.out.println(s3.i);//50
	
		s3.function(s3.f1);
		System.out.println(s3.f1);//1.3
		
		s3.function(s3.f1,s3.f1);
		System.out.println(s3.f2);//1.3
		System.out.println("========================");
		
		Sample2 s2=new Sample2();
		s2.function(1.2f,1.4f);//  this mehtod not existing in  sample2 class
		System.out.println(s2.f1+" "+s2.f2);//0.0,1.4
		
		s2.function(s2.f1);
		System.out.println(s2.f1);//1.2
		
		 
		
		
		
		
		
		
		
		
	/*	Sample1 s1=new Sample2();
		//Sample2 s2=new Sample2();
		s1.function(s1.f1);
		System.out.println(s1.f1);
		
		s1.function(s1.f1,s1.f1);
		System.out.println(s1.f1+" "+s1.f2);
		
		System.out.println(s1.f1);
		System.out.println(s1.f2);
		
		System.out.println("*********************");
		
		Sample1 s=new Sample3();
		s.function(1.1f);
		s.function(1.5f,1.6f);
		System.out.println(s.f1);
		System.out.println(s.f1+" "+s.f2);
		//s.function(22.3f, 33.3f);
		//System.out.println(s.f1+" "+s.f2);
		//s.function(4444,55.4f);
	//	System.out.println(s.l+" "+s.f1);
		/*Sample1 s1=new Sample2();
		Sample2 s2=new Sample2();
		s1.function(2.5f);
		System.out.println(s2.f1);*/
		
		
		
		 //s1.function(22.2f,1.3f);
		 //System.out.println(s1.f1+" "+s1.f2);
	//s1.function(2.5f);
	//	System.out.println("value="+s1.f1);
		//s1.function(2.5f,2.5f);
		
		//System.out.println(2.5f);
//		Sample3 s3=new Sample3();
//		s3.function(255,3.4f);
//		s3.function((int)s3.l);
//		
//		Sample1 s1=new Sample2();
//		Sample1 s11=new Sample3();
//		
//		
//		Sample2 s2=new Sample1();
//		Sample2 s22=new Sample3();
//		
//		Sample3 s33=new Sample2();
//		Sample3 s31=new Sample1();
//		
	}
}
