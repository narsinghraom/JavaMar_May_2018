package com.vtalent.saikrishna;

public class ConstructorProgram 
{

	int a,b,c;
	public ConstructorProgram() 
	{
		//this(111,222);
		System.out.println("default constructror");
	}
	
	ConstructorProgram(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("value="+a);
		System.out.println("value="+b);
	}
	void disp()
	{
		System.out.println("value="+a);
		System.out.println("value="+b);
	}
	
	ConstructorProgram(int a)
	{
		this.a=a;
		System.out.println("single pc="+a);
	}
	
	ConstructorProgram(ConstructorProgram x1,ConstructorProgram x2)
	{
		this.a=x1.a+x2.a;
		this.b=x1.b+x2.b;
		System.out.println("first value="+a+" second value="+b);
	}
	public static void main(String[] args) 
	{
		ConstructorProgram cp=new ConstructorProgram();
		
		ConstructorProgram cp2=new ConstructorProgram(111,222);
		ConstructorProgram cp1=new ConstructorProgram(100,200);
	//cp1.disp();
		ConstructorProgram cp3=new ConstructorProgram(cp1,cp2);
	}

}
