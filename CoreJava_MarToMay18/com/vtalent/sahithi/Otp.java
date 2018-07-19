package com.vtalent.sahithi;

public class Otp {
	public static void main(Strng args[])
	{
		Ab ab=new Impl();
		ab.function(2);
		ab.function(2.5f);
		//ab.function(2,3);//function(int,int) is not declared in the interface Ab,so it does not excute
System.out.println("......................");
		Xyz xyz=new Impl();
		xyz.function(3);
		xyz.function(3.2f);
		xyz.function(3,2);
System.out.println("......................");
		//Mnr mnr=new Impl();
		Ab ab1=new Impl1();
		ab1.function(2);
		ab1.function(2.5f);
System.out.println("......................");
		//ab.function(2,3);
		Xyz xyz1=new Impl1();
		xyz1.function(3);
		xyz1.function(3.2f);
		xyz1.function(3,2);
System.out.println("......................");		
		Mnr mnr1=new Impl1();
		mnr1.function(4,2);
		mnr1.function(2222,1.2f);
		//mnr1.function(4.1f);
		
		//Ab ab2=new Impl2();
		//Xyz xyz2=new Impl2();
System.out.println("......................");
		Mnr mnr2=new Impl2();
		mnr2.function(4,3);
		mnr2.function(2233,1.6f);
		
	}

}
