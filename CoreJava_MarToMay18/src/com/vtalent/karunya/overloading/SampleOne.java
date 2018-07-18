package src.com.vtalent.karunya.overloading;

public class SampleOne {
	float f1,f2;
	public void function(float f1)
	{
		this.f1=f1+f2;
	}
	public void function(float f1,float f2)
	{
		this.f1=this.f1+f2;
		this.f2=this.f1+f2;
	}

}
