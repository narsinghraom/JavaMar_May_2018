package com.vtalent.ranjith.interface3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc abc=new Implementation();
		abc.function(2);
		abc.function(2.5f);		
		//abc.function(2,3); function(int ,int) not present in Abc interface
		
		//Mnr mnr=new Implementation(); Implementation is not a implementaion class of Mnr
		
		Xyz xyz=new Implementation();
		xyz.function(2);
		xyz.function(2.5f);
		xyz.function(2,3);
		
		//Abc abc1=new Implemention2();
		Mnr mnr=new Implemention2();
		//mnr.function(2);
		mnr.function(12345,2.2f);
		mnr.function(2,3);
	
		//Xyz xyz1=new Implemention2();
	}

}
