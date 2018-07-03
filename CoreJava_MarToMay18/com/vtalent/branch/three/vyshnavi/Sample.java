package com.vtalent.branch.three.vyshnavi;
 class Sample
{
	static int x,y;
	float f1,f2;
	Sample()
	{
		this((float)x);
	
	}
	Sample(float f1)
	{
		this.f1=f1*f1;
	}
	public void functionOne(int x)
	{
		Sample.x=x*x;
		y=Sample.x;
	}
	public long functionTwo(float f1,float f2)
	{
		this.f1=this.f1+f1;
		this.f2=this.f2+f2;
		return (long)(this.f1+this.f2);
		
	}
	public int functionThree(float f2)
	{
		this.f2=this.f2+x;
		return (int)f2;
	}
	public static Sample funtion()
	{
		Sample sam=new Sample(1.5f);
		sam.functionOne(2);
		long ftval=sam.functionTwo(1.2f,1.2f);
		int fthval=sam.functionThree((float)ftval);
		sam.f1=sam.f1+fthval;
		return sam;
		
	}

		
	
	public static void main(String args[])
	{
		Sample st=funtion();
		System.out.println(st.f1);
		System.out.println(st.f2);
		System.out.println(x);
		System.out.println(y);
	}
}
	


 


