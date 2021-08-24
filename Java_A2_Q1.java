import java.util.*;
class Singleton 
{
	static Singleton obj = new Singleton();
	private Singleton() 
	{
		
	}
	public static Singleton getobj()
	{
		return obj;
		
	}
	
}
class Java_A2_Q1 extends Singleton
{
	public static void main(String[] args)
	{
	Java_A2_Q1 act= new act();
	act.getobj();
	}
	
}
