package com.vtalent.sahithi;

public interface Mnr {
	void function(int i,int j);
	void function(long l,float f);

}
class Impl1 extends Impl implements Mnr{
	public void function(long l,float f){
		System.out.println(l+(long)f);
	}
	
}
class Impl2 implements Mnr{
	public void function(int i,int j){
		System.out.println(i+j);
	}
	public void function(long l,float f){
		System.out.println(l+f);
	}
	
}
