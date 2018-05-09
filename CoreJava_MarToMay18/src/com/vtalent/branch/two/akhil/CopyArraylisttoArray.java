package com.vtalent.branch.two.akhil;

import java.util.ArrayList;

public class CopyArraylisttoArray {
	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("akhil");
		ar.add("vtalent");
		ar.add("class");
	
	String[] s = new String[ar.size()];
	
	ar.toArray(s);
	for(int i =0;i<s.length;i++){

		System.out.println(s[i]);
		
	}
	
}
}