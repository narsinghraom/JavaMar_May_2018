package src.com.vtalent.swathi;





class Constructors{
		 int i,j;
		 Constructors()
		 {
			 i=5;j=7;
		 }
		 Constructors(int i)
		 {
			 this.i=i+i;
			 this.j=i*i;
		 }
		 Constructors(int i,int j)
		 {
			 this.i=i+j;
			 this.j=i*j;
		 }
		 public void function()
		 {
			 System.out.println(i);
			 System.out.println(j);
			 
		 }
		 public static void main(String args[])
		 {
			 Constructors c=new Constructors();
			 c.function();
			 Constructors c1=new Constructors(3);
			 c1.function();
			 Constructors c2=new Constructors(3,3);
			 c2.function();
		 }
		 }





