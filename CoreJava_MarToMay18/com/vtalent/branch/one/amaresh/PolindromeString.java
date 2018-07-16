package com.vtalent.branch.one.amaresh;

import java.util.Scanner;

public class PolindromeString {

	public static void main(String[] args)
	{
		String original="sreenu",reverse="";
		/*Scanner s=new Scanner(System.in);
		System.out.println("enter the name");
		original=s.nextLine();*/
		int length=original.length();
		for(int i=length-1;i>=0;i--)
		{
			reverse=reverse+original.charAt(i);
		}
		if(original.equals(reverse))
			System.out.println("the string is polindrome string");
		else
			System.out.println("the string is not polindrome string");
		// TODO Auto-generated method stub

	}

}
