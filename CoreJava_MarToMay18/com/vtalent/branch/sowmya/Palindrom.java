package com.vtalent.branch.sowmya;

public class Palindrom {
	
		public static void palindrom (String value)
		{
	    String reverseVal=""; 
	    for(int i = value.length() - 1;i >= 0;i--)
	    {
	    reverseVal =reverseVal+value.charAt(i);
	    }
	    if(value.equals(reverseVal))
	    {
	    	System.out.println("palindrom");
	    }
	    else
	    {
	    	System.out.println("not a palindrom");
	    }
		}
		public static void main(String args[ ])
		{
			palindrom("malayalam");
		}
	}


