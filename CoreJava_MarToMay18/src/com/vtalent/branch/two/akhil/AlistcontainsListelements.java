package com.vtalent.branch.two.akhil;

import java.util.ArrayList;

public class AlistcontainsListelements {

	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("akhil");
		ar.add("vtalent");
		ar.add("class");
		
		ArrayList<String> ar2 = new ArrayList<String>();
		
		ar2.add("vtalent");
		ar2.add("akhil");
		System.out.println(ar.containsAll(ar2));
		ar2.add("ak");
		System.out.println(ar.containsAll(ar2));
	}
	
}
