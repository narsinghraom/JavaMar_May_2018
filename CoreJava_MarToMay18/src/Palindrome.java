
 class Palindrome {
	 public static void main(String args[])
	 {
	 String original="mom",reverse=" ";
	  
	 for(int i=(original.length()-1);i>=0;i--)
	 {
		 reverse=reverse+original.charAt(i);
	 }
	 if(original.equals(reverse))
	 {
	 
		 System.out.println("string is palindrome");
	 }
	 
	 else
	 
		 System.out.println("string is not a palindrome"); 
	 
	 
 }
	 }
	 


