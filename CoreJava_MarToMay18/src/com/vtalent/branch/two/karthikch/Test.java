package com.vtalent.branch.two.karthikch; 
import java.util.*;

public class Test { 
	String name;
	int number;
	
	public static void main(String[] args) {
	
		Map<Test,String> mapref = new HashMap<Test,String>();
		Test ac = new Test();
		
	ac.name = "abc";
	ac.number = 100;
	
	Test av = new Test();
	
	av.name= "abc";
	av.number = 100;
	
	mapref.put(ac,"frstobj");
	mapref.put(av, "secondobj");
	
	
	}

}
