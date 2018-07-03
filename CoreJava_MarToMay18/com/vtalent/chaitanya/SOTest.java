package src.com.vtalent.chaitanya;

import java.util.Scanner;

public class SOTest {
	int k;
	int l;
    public static void main(String[] args) {
        // create scanner object
        Scanner scanner = new Scanner(System.in);
        // create an array of 10 integers
        int a[] = new int[5];
        int k = 0;
    	int l;
    	int m;
        for(int i=0;i<5;i++){
        	
        	int j = scanner.nextInt();
            // store it in array as incremented by 1.
        	l=j+k;
        	a[i]=l;
        	m=k;
        	k=l;
            //a[i]=j+k;
            //int m =scanner.nextInt();
            
        }
        //a[i]=j+m;
        // Now array of integers have the user input value+1.
        for(int i=0;i<5;i++) {
        	//a[i]=j;
            System.out.println(" "+ a[i]);
        }
    }
}
