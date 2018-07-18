package com.vtalent.sowmya.Encap;
interface ABC
{
	float pi=3.14f;
	public static final int k=0;
	public void function(int i);
	public abstract void function(float f);
}
interface XYZ
{
	void function(int i, int j);
	void function(float f);
	
}
class Implementation implements ABC,XYZ
{
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
	public void function(int i,int j)
	{
		i=i+j;
		j=i*j;
		System.out.println(i+j);
	}
	
}
interface MNR
{
	public void function(int i,int j);
	public void function(long l,float f);
}
class Implementation1 extends Implementation implements MNR
{
	public void function(long l,float f)
	{
		System.out.println(l+(long)f);
	}
	
}
	class Implementation2 implements MNR
	{
		public void function(int i,int j)
		{
			System.out.println(i+j);
		}
		public void function(long l,float f)
		{
			System.out.println(l+f);
		
		}
		
	}
	class Interface
	{
		public static void main(String args[])
		{
			ABC abc=new Implementation();
			abc.function(2);
			abc.function(2.5f);
//			abc.function(2,3); we did not find 2'int type varables 
			
			XYZ xyz=new Implementation();
			xyz.function(2);
			xyz.function(3.3f);
			xyz.function(3,5);
			
			ABC abc1=new Implementation1();
			abc1.function(2);
			abc1.function(2.5f);
//			abc1.function(2,3);we did not find 2'int type variables
			
			XYZ xyz1=new Implementation1();
			xyz1.function(3);
			xyz1.function(3.3f);
			xyz1.function(3,5);
			
			MNR mnr=new Implementation1();
			mnr.function(0,3);
			
//			mnr.function(5);we did not find int type variable
//			mnr.function(4.5f);
			
			
//			ABC abc2=new Implementation2(); implementation2 does not implements ABC
//			XYZ xyz2=new Implementation2();implentation2 does not implements XYZ
			
			MNR mnr1=new Implementation2();
			mnr1.function(1,3);
			
			
			
			
			
			
		
			
			
			
			
		}



}
