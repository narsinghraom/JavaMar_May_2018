package com.vtalent.branch.two.akhil;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistcopy {

	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("akhil");
		ar.add("vtalent");
		ar.add("class");
		
		ArrayList<String> arr =  (ArrayList<String>)ar.clone();
		
	/*	Iterator<String> itr = ar.iterator();
		while(itr.hasNext()){
			String st = (String)itr.next();
			
			System.out.println(st);
		}
		
		Iterator<String> itrr = arr.iterator();
		while(itr.hasNext()){
			String st1 = (String)itr.next();
			
			System.out.println(st1);
		}
		*/
		
		System.out.println(ar);
		System.out.println(arr);
		
	}
	
	
	
	
	
}
