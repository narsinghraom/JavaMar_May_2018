package src.com.vtalent.karunya.strings;

public class StringExample1 {
	public static void main()
	{
		String s1=new String("ABC");
		String s2=" abc";
		String s3="abc";
		String s4=new String("abc");
		if(s1.equals(s3))
		{
			System.out.println("true");
	}
		if(s1==(s3))
			System.out .println("false");
		s1=new String("def");
		s4="abc";
		s2=new String("abc");
		s2=s1;
		s3=s1;
		s1=s3;
	}
}
