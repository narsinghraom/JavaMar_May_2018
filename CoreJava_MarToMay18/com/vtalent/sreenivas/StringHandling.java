package com.vtalent.sreenivas;

public class StringHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc";
		System.out.println(s);
		String s1=new String("abc");
		String s2="abc";
		System.out.println(s.equals(s1));//true
		System.out.println(s==s1);//false
		System.out.println(s==s2);//true
		String ss="def";
		System.out.println("abc"+ss);//abcdef
		s1=new String("abc");
		System.out.println(s1);//abc
		String s3=s1+s2;
		System.out.println(s3);//abcabc
		System.out.println(s3=ss);//def
		System.out.println(s1=s3);//def
		String s4="sreenu"+5;
        System.out.println(s4);	//sreenu5	
		String c="jyothsna".substring(0,8);
		System.out.println("*****"+c);//c
		
		String cde="cde";
		String d=cde.substring(1, 2);
		System.out.println(d);//d
		
		char c1=cde.charAt(1);
		System.out.println(c1);//
		
		int c2=cde.codePointAt(1);
		System.out.println(c2);//100
		
		int c3=cde.codePointBefore(1);
		System.out.println(c3);//99
		
		String s5="sreenu";
		int c4=s5.codePointCount(1,4);
		System.out.println(c4);//3
		
		String s6="durga";
		String s7="durga";
		String s8="sreenu";
		String s9="reddy";
		System.out.println(s6.compareTo(s7));//0
		int i=s6.compareTo(s7);
		System.out.println(i);//0
		System.out.println(s7.compareTo(s8));//-15
		System.out.println(s9.compareTo(s7));//
		
		String s10="SREenu";
		String s11="anu";
		String s12="sreenu";
		System.out.println(s10.compareToIgnoreCase(s12));//0
		System.out.println(s10.compareToIgnoreCase(s11));//18
		System.out.println(s11.compareToIgnoreCase(s12));//-18
		
		String s13="gopal";
		System.out.println(s13.concat("reddy"));//gopalreddy
		String sss=s13.concat("charan");
		System.out.println(sss);//gopalcharan
		s13.concat("anu");
		System.out.println(s13);//gopal it is immutable
		
		boolean b=s13.contains("go");
		System.out.println(b);//true
		boolean b1=s13.contains("all");
		System.out.println(b1);//false
		
		boolean b2=s8.contentEquals(s12);
		System.out.println(b2);//true
		boolean b3=s8.contentEquals(s13);
		System.out.println(b3);//false
		System.out.println(s8.contentEquals("sreenu"));//true
		
		char[] ch={'s','r','e','e','n','u',' ','w','o','r','l','d'};
		String str="";
		str=str.copyValueOf(ch);
		System.out.println(str);//sreenu world
		
		char[] data={'a','b','c','d','e','f','g','h','i','j','k','l'};
		String str1="text";
		String str2="string";
		str1=str1.copyValueOf(data);
		System.out.println("str1 after copy:"+str1);//abcdefghijkl
		str2=str2.copyValueOf(data,5,3);
		System.out.println("str2 after copy:"+str2);//fgh
		
		String s14="charan";
		System.out.println(s14.endsWith("ran"));//true
		System.out.println(s14.endsWith("ohhh"));//false
		
		String gfg="ASTHA GFG";
		System.out.println("the string before conversion is:");
		System.out.println(gfg);
		//converting string to bytes
		byte[] bb=gfg.getBytes();
		System.out.println("the string after conversion is:");
		for(int j=0;j<bb.length;j++)
		{
			System.out.print(bb[j]);
		}
		
		String s15="sreenu";
		System.out.println("the hash code of s15 is:"+s15.hashCode());
		
		System.out.println(s15.indexOf("e"));//2
		System.out.println(s15.indexOf("y"));//-1
		
		String s16=new String("welcome to Tutorials points.com");
		String sub=new String("Tutorials");
		System.out.println("found index:"+s16.indexOf(sub));//11
	    
		System.out.println(s15.lastIndexOf("u"));//5
		System.out.println(s15.lastIndexOf("y"));//-1
		
		System.out.println(s15.replace("sreenu", "reddy"));
		String s17="java points";
		String s18=s17.replace('a', 'e');
		System.out.println(s18);//jeve points
		
		String s19="my name is sreenu. my name is gopal. my name is charan";
		String s20=s19.replaceAll("is", "was");
		System.out.println(s20);
		
		String s21="geekss@for@geekss";
		String[]  s22=s21.split("@", 2);
		
	    String s23="sreenivasa";
	    System.out.println(s23);
	  char[] c5=  s23.toCharArray();
		for(int k=0;k<c5.length; k++)
		{
			System.out.println(c5[k]);
		}
		
		String s24=new String("welcome to sreenu our classes");
		System.out.println("the return value is:"+s24.subSequence(0,10));//welcome to
		System.out.println("the return value is:"+s24.subSequence(10,15));//sree
		
		String s25=s23.toUpperCase();
		System.out.println("return the uppercase:"+s25);//SREENIVASA
		String s26=s25.toLowerCase();
		System.out.println("return the lower case is:"+s26);//sreenivasa
		System.out.println("to find the length of the string:"+s26.length());//9
		
		Double d1=new Double("5.4d");
		System.out.println("the return value is:"+d1.valueOf(3.4));

	}

}
