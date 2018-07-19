package com.vtalent.sahithi;

public interface Xyz {
	
	void function(int i,int j);
	void function(float f);
}
	class Impl implements Ab,Xyz{
		 public void function(int i)
		 {
			 i=(int)pi+i;
			 System.out.println(i);
		 }
		 public void function(float f)
		 {
			 f=pi+f;
			 System.out.println(f);
		 }
		 public void function(int i,int j)//3,2
		 {
			 i=i+j;//3+2=5
			 j=i*j;//5*2=10
			 System.out.println(i+j);//10+5=15
		 }
}
