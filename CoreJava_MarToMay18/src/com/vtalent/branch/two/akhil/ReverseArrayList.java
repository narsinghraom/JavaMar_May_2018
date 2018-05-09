package com.vtalent.branch.two.akhil;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {


		public static void main(String[] args) {
			ArrayList<String> ar = new ArrayList<String>();
			ar.add("akhil");
			ar.add("vtalent");
			ar.add("class");
			ar.add("abc");
			Collections.reverse(ar);
			
			System.out.println(ar);
	
}
}