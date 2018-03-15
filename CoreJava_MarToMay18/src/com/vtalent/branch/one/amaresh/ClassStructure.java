package com.vtalent.branch.one.amaresh;
public class ClassStructure{
	int x,y;
	public ClassStructure(){
		x=10;y=20;
	}
	
	public int methodOne(){
		return x+y;
	}
	public void methodDisplay(){
		System.out.println("the sum of number is "+methodOne());
	}
	
	
}
