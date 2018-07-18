package com.vtalent.sowmya.Encap;
import java.lang.*;
class StringMethods{ 
	//charAt method
	public static void main(String[] args) {
		String name="sowmya about to know" ;
		/*char ch=name.charAt(3);
		System.out.println(ch);*/
	
	   String s1="mounikaa";  
	   String s2="Sowmya";  
	   String s3=new String("Sachin");  
	   String s4="Saurav"; 
	   String s5="";
	   System.out.println(s1.equals(s2));   //using equals method
	   System.out.println(s1.equals(s3));   //using equals method
	   System.out.println(s1.equals(s4));   //using equals method
	   
	   System.out.println(s1.compareTo(s2)); //using compareTo method
	   System.out.println(s1.compareTo(s3)); //using compareTo method 
	   
	   System.out.println(s3==s1);//compare refference 0/p-false
	   
	   System.out.println(s1+" "+s4); //concatination
	   
	   System.out.println(name.contains("about")); //contains method 
	   System.out.println(name.contains("hello")); //contains method
	   
	   System.out.println(s1.endsWith("n")); //endsWith method 
	   System.out.println(s1.endsWith("p")); //endsWith method
	   
	   System.out.println(s1.equalsIgnoreCase(s2));//true because content and case both are same  
	   System.out.println(s1.equalsIgnoreCase(s3));//true because case is ignored  
	   System.out.println(s1.equalsIgnoreCase(s4));//false because content is not same  
	   
	   System.out.println(s1.isEmpty()); //if string is empty returns true otherwise false 
	   System.out.println(s5.isEmpty()); //true
	  
	  /* String soloString1=String.join("-","welcome","to","javatpoint");  
	   System.out.println(soloString1); */
	   
	   String s6="this is index";//there are 2 's' characters in this sentence  
	   int index=s6.lastIndexOf('s');//returns last index of 's' char value  
	   System.out.println(index);//6 
	   
	   System.out.println("string length is: "+s1.length());//7 is the length of string  
	   
	   String replace=s1.replace('a','e');//replaces all occurrences of a to e  
	   System.out.println(replace);
	   
	   /*String replace1=s6.replaceAll('s','e');//replaces all occurrences of s to e  
	   System.out.println(replace1);  */
	   
	   System.out.println(s1.startsWith("mo"));
	   
	   System.out.println(s1.substring(2));//returns unikaa
	   
	   String s7="HELLO";  
	   char[] ch=s7.toCharArray();  
	   for(int i=0;i<ch.length;i++){  
	   System.out.print(ch[i]); 
	   }
	   
	   String lower=s7.toLowerCase();  
	   System.out.println(lower);
	   
	   
	   String upper=s1.toUpperCase();  
	   System.out.println(upper);  
	   
	   System.out.println(s1.trim()+"sowmya");//with trim() 
	   
	   int value=30;  
	   String s8=String.valueOf(value);  
	   System.out.println(s8+10);//concatenating string with 10  
	   
	   
	    int index1= s7.codePointAt(3);
	    System.out.println(index1);
	    
	    int index2= s7.codePointBefore(2);
	    System.out.println(index2);  
	    
	   System.out.println(s5.matches(s1));
	  
	   
	}
}
	 
	  