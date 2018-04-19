package com.vtalent.branch.two.akhil;

import java.util.ArrayList;

public class DeleteElementsArrayList {

	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("akhil");
		ar.add("vtalent");
		ar.add("class");
		System.out.println(ar);
	
	ar.removeAll(ar);//
	ar.clear();
	System.out.println(ar);
	
	
}
}
