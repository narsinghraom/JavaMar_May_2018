package com.vtalent.ranjith;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
			
System.out.println("enter the range");
Scanner s=new Scanner(System.in);
int z=s.nextInt();
		for(int n=2;n<=z;n++){
			int count=1;
			for(int i=2;i<=n/2;i++){  // 2<=1
				if(n%i==0){	count++;}

			}
			if(count==1){
				System.out.println(n);
			}
		}
	}
}
