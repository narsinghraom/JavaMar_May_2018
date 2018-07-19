package com.vtalent.sreenivas;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Abc a=new Implementation();		
		a.function(2);
		a.function(2.5f);
		//a.function(2,3);
*/		
		//Mnr m=new Implemetation();compile time error
		
		/*Xyz x=new Implementation();
		x.function(2);
		x.function(2.5f);
		x.function(2, 3);
*/		
		Mnr m=new Implementation1();
		//Abc a2=new Implementation();
		m.function(4, 5);//54
		m.function(3, 1.5f);//4
		
		Abc a1=new Implementation();
		a1.function(2.6f);//5.74
		a1.function(4);//7
		
		Abc a2=new Implementation();
		a2.function(2.1f);//5.24
		a2.function(1);//4
		
		Xyz z=new Implementation1();
		z.function(4.5f);//4.5+3.14=7.64
		z.function(3, 3);//6+6*3=6+18=24
		
		Mnr n1=new Implementation2();
		n1.function(6, 5);//6*5=30
		n1.function(4, 1.5f);//4+1.5=5.5
		

	}

}
