package src.com.vtalent.karunya.inheritance;

public class SampleOnee {
		float f1,f2;
		public void function(float f1)
		{
			this.f1=f1+f2;
		}
		public void function(float f1,float f2)
		{
			this.f1=this.f1+f1;
			this.f2=this.f2+f2;
		}
	}
	class sampleTwo extends SampleOnee
	{
		int i;
		float f1;
		public void function(int i)
		{
			this.i=i+i;
		}
		public void function(float f1)
		{
			this.f1=f1+super.f1;
		}
	}
class sampleThree extends SampleTwo
{
	long l;
	float f1;
	public void function(long l,float f1)
	{
		this.l=l;
		this.f1=f1;
	}

	public static void main(String[] args){
		SampleTwo st1=new SampleThree();
		st1.function(25,1.5f);
		st1.function(5);
		st1.function(st1.f1,st1.f1);
		System.out.println(st1.l);
		System.out.println(st1.f1);
		System.out.println(st1.f2);
		System.out.println(st1.i);
	}
}

		
	
