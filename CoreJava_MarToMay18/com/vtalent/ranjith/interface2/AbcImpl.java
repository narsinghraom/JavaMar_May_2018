package com.vtalent.ranjith.interface2;

public class AbcImpl implements Abc {
	public void function(int i) {
		
	// k=i+i; // error b'coz k is a final variable in Abc class so k does not modify
	i=k+i;
	System.out.println(i);
	}
public void function(float f) {
	f=pi+f;
	System.out.println(f);
	
}

}
