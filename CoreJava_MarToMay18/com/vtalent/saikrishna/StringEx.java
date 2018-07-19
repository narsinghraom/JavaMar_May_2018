package com.vtalent.saikrishna;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class StringEx 
{
	public static void main(String[] args) 
	{
		String s1="JAVA";
		String s2="java";
		String s3=new String("java");
		String s4=new String("java");
		String se="JAVA".intern();
		System.out.println("charAt()");
		char ch=s1.charAt(2);
		System.out.println(ch);
		
		System.out.println("unicode point");
		int i=s1.codePointAt(1);
		System.out.println(i);
		
		System.out.println("codepoint before");
		int c=s1.codePointBefore(2);
		System.out.println(c);
		
		System.out.println("codepoint count");
		System.out.println(s1.codePointCount(1,3));
		
		System.out.println("compare to method");
		System.out.println(s1.compareTo(s2));
		
		System.out.println("equals method");
		boolean b=s1.equals(s2);
		System.out.println(b);
		
		System.out.println("equals operator");
		boolean b1=s1==s2;
		System.out.println(b1);
		
		System.out.println("to lowercase");
		String lc=s1.toLowerCase();
		System.out.println(lc);
		
		System.out.println("to uppercase");
		String uc=s2.toUpperCase();
		System.out.println(uc);
		
		System.out.println("equalsignorecase");
		boolean b2=s1.equalsIgnoreCase(s2);
		System.out.println(b2);
		
		System.out.println("containsmethod");
		boolean b3=s1.contains("JAVA");
		System.out.println(b3);
		
		System.out.println("length method");
		int l1=s1.length();
		System.out.println(l1);
		
		System.out.println("concatanation");
		String s5=s1.concat(s2);
		System.out.println(s5);
		
		System.out.println("content equals method");
		boolean b4=s1.contentEquals(s2);
		System.out.println(b4);
		
		System.out.println("getbytes method");
		byte[] b6=s1.getBytes();
		for(int i1=0;i1<b6.length;i1++)
		{
			System.out.println(b6[i1]);
		}
		
		System.out.println("ends with suffix");
		boolean b5=s1.endsWith("s");
		System.out.println(b5);
		
		System.out.println("starts with prefix");
		boolean b7=s1.startsWith("fa");
		System.out.println(b7);
		
		System.out.println("tochar array metod");
		char ch1[]=s1.toCharArray();
		for(int i2=0;i2<ch1.length;i2++)
		{
			System.out.println(ch1[i2]);
		}
		
		System.out.println("substring method");
		String ss=s1.substring(1,3);
		System.out.println(ss);
		
		System.out.println("sub stringmethod");
		String ss1=s1.substring(1);
		System.out.println(ss1);
		
		System.out.println("trim()");
		//System.out.println(s1);
		int l2=s1.length();
		System.out.println(l2);
		String ts=s1.trim();
	//	System.out.println(ts);
		int noc=ts.length();
		System.out.println(noc);
		
		System.out.println("isempty method");
		boolean b8=se.isEmpty();
		System.out.println(b8);
		
		System.out.println("intern method");
		if(s1==s2)
		{
			System.out.println("s1 and s2 same");
		}
		if(s1==s3)
		{
			System.out.println("s1 and s3 same");
		}
		
		
		System.out.println("valueof method");
		String st="core";
		String sv=String.valueOf(10.5f);
		System.out.println(sv+10);
		
		System.out.println("replace method");
		String re=st.replace('c','s');
		System.out.println(re);
		
		System.out.println("joins method");
		//String joinString1=String.join("-","welcome","to","javatpoint");  
		//System.out.println(joinString1);  
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
		/*char[] c1=s1.toCharArray();
		//System.out.println(c1[3]);
		for(int i=c1.length-1;i>=0;i--)
		{
			System.out.println(c1[i]);
		}
		
		System.out.println();
		//System.out.println(s1.compareTo(s2));
		System.out.println();
		char ch[]=s1.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
		
		
		
		//StringBuffer sb=new StringBuffer("sai");
		//System.out.println(sb.length());
		String s1="java";
		String s2=new String("java");
		String s3="java";
		String s4=new String("java");
		//s1=s2;
		
		char c[]={'a','b','c'};
		String s=new String(c);
		System.out.println(s);
	//	s2=s4;
		//System.out.println(s1);
		System.out.println(s2==s4);
		//System.out.println(s1.equals(s2));
		//System.out.println(s1.getBytes());
	}*/
}

