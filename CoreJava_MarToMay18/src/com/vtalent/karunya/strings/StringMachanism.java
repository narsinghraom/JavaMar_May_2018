package src.com.vtalent.karunya.strings;

public class StringMachanism {
	public static void main(String[] args){
		String s=" abc";
		System.out.println(s);
		String s1=new String("abc");
		String s2=" abc";
		System.out.println(s==s1);
		System.out.println(s==s2);
		System.out.println(s.equals(s1));
		String ss="def";
		System.out.println("abc"+ss);
		s1=new String("abc");
		System.out.println(s1);
		String s3=s1+s2;
		System.out.println(s3);
		System.out.println(s3==ss);
		System.out.println(s1=s3);
		String s4="karunya"+6;
		System.out.println(s4);
		String c="abc".substring(2,3);
		System.out.println(c);
		String cde="cde";
		String d=cde.substring(1,2);
		System.out.println(d);
		char c1=cde.charAt(1);
		System.out.println(c1);
		int c2=cde.codePointAt(1);
		System.out.println(c2);
		int c3=cde.codePointBefore(1);
		System.out.println(c3);
		String s5="karunya";
		int c4=s5.codePointCount(2,5);
		System.out.println(c4);
		String s6="durga";
		String s7="durga";
		String s8="karunya";
		String s9="meera";
		System.out.println(s6.compareTo(s7));
		int i=s6.compareTo(s7);
		System.out.println(i);
		System.out.println(s7.compareTo(s8));
		System.out.println(s9.compareTo(s7));
		String s10="karunya";
		String s11="jyo";
		String s12="karunya";
		System.out.println(s10.compareToIgnoreCase(s12));
		System.out.println(s10.compareToIgnoreCase(s11));
		System.out.println(s11.compareToIgnoreCase(s12));
        String s13="vara";
        System.out.println(s13.concat("lakshmi"));
        String sss=s13.concat("sree");
        System.out.println(sss);
        s13.concat("rekha");
        System.out.println(s13);//vara it is immutable
        boolean b=s13.contains("va");
        System.out.println(b);
        boolean b1=s13.contains("all");
        System.out.println(b1);
        boolean b2=s8.contentEquals(s12);
        System.out.println(b2);
        boolean b3=s8.contentEquals(s13);
        System.out.println(b3);
        System.out.println(s8.contentEquals("karunya"));
        char[] ch={'k','a','r','u','n','y','a'};
        String str="";
        str=str.copyValueOf(ch);
        System.out.println(str);
        char[] data={'a','b','c','d','e','f','g','h','i','j','k','l'};
        String str1="text";
        String str2="String";
        str1=str1.copyValueOf(data);
        System.out.println("str1 after copy:"+str1);
        str2=str2.copyValueOf(data,5,3);
        System.out.println("str2 aftercopy:"+str2);
        String s14="usha";
        System.out.println(s14.endsWith("ha"));
        System.out.println(s14.endsWith("ll"));
        String gfg="ASHA GFG";
        System.out.print("the string before conversion is:");
        System.out.println(gfg);
        //converting string to byte
        byte[] bb=gfg.getBytes();
        System.out.println("the string after conversion is:" );
        for (int j=0;j<bb.length;j++)
        {
        	System.out.println(bb[j]);
        	
        }
        String s15="karrunya";
        System.out.println("the hash code of s15 is:"+s15.hashCode());
        System.out.println(s15.indexOf("r"));
        System.out.println(s15.indexOf("l"));
        String s16=new String("welcome to tutorials points.com");
        String sub=new String("tutorial");
        System.out.println("found index:"+s16.indexOf(sub));
        System.out.println(s15.lastIndexOf("u"));
        System.out.println(s15.lastIndexOf("y"));
        System.out.println(s15.replace("karrunya","divya"));
        String s17="java points";
        String s18=s17.replace('a','e');
        System.out.println(s18);
        String s19="java is independent.java is software language";
        String s20=s19.replaceAll("is","was");
        System.out.println(s20);
        String s21="vtalant@karunya@gmail.com";
        String[] s22=s21.split("@",2);		
	}
}
