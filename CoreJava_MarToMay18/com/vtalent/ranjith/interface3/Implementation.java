package com.vtalent.ranjith.interface3;

public class Implementation implements Abc,Xyz {

	public void function(int i, int j) {
		// TODO Auto-generated method stub
		i=i+j;
		j=i*j;
		System.out.println(i+j);
	}

	public void function(int i) {
		// TODO Auto-generated method stub
		i=(int)pi+i;
		System.out.println(i);
		
	}

	public void function(float f) {
		// TODO Auto-generated method stub
		f=pi+f;
		System.out.println(f);
	}

}
