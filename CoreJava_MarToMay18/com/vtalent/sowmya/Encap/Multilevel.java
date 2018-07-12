package com.vtalent.sowmya.Encap;

public class Multilevel {
	float f1,f2;
	public void function(float f1)
	{
	this.f1=this.f1+f1;
	this.f2=this.f2+f2;
	}
}


class Two extends Multilevel
	{
		int i;
		public void function(float f1,int i)
		{
			this.f1=f1+f2;
		}
		public void function(float f1,float f2)
		{
			this.f2=this.f1+f2;
		}
	}
		class Third extends Two
		{
			float f1,f2;
			public void function(float f1,float f2)
			{
				this.f1=f1+f2;
				
			}
			
		}
		class MultilevelTest
		{
	
			public static void main(String args[])
			{
				Two t=new Third();
				t.function(t.f1);
				t.function(5);
				t.function(t.f1,t.f2);
				System.out.println(t.i);
				System.out.println(t.f1);
				System.out.println(t.f2);
			}
			
		}


		




		
			
		
	

