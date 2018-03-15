package com.vtalent.branch.one.amaresh;
public class Sample {
	Sample Sample=new Sample();
	int i;
	public Sample function(int i){
		Sample.i=i+i;
		return Sample;
		
		
	}
	public static void main(String[] args){
		Sample Sample=new Sample();
		Sample Sample1=Sample.function(5);
		System.out.println(Sample.i);
		System.out.println(Sample1.i);
		
		
	}
	
	
	

}
