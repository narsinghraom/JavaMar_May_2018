package com.vtalent.ranjith.inheritance;

import com.sun.org.apache.xml.internal.security.signature.Manifest;



public class C extends A,B//multiple inheritence not possible in java
  {
public static void main(String args[]) {
	C c1=new C();
	c1.function(5);
	System.out.println(c1.i);
}

}
