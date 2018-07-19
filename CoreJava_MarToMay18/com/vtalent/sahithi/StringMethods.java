package com.vtalent.sahithi;

public class StringMethods {
	public static void main(String[] args) {
		String s1="sahithi";
		String s2="sahithi";
		String s3="ramya";
		String s4="hello vtalent";
         char ch=s1.charAt(6);
         System.out.println(ch);
         System.out.println(s1.length());
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1==s2);
		System.out.println(s1.trim());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.concat(" anu"));
		System.out.println(s1.codePointAt(4));
		System.out.println(s1.isEmpty());
		System.out.println(s3.replace('r','s'));
//    	System.out.println(s3.format("s3 is %s3",s3));
		System.out.println(s4.contains("sahithi"));
		System.out.println(s4.startsWith("hello"));
		System.out.println(s4.endsWith("et"));
//		System.out.println(s4.split(""));
		System.out.println(s4.substring(1));//prints from 2nd position to the end of string
		System.out.println(s4.substring(1,11));//prints from 2nd position  to 11th position of the string(skips 1st,12,13 positons)
		System.out.println(s1.indexOf('s'));
		System.out.println(s1.valueOf(s1+10));
		System.out.println(s4.lastIndexOf('t'));//shows 12th position of 't'y not 7th?
		System.out.println(s4.lastIndexOf("vtalent"));
//		System.out.println(s1.intern());
//		System.out.println(s4.join("k","hello","to","vtalent"));	
	}
}
