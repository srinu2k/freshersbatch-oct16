import java.util.*; 
public class Java_A4_Q2

{

public static void main(String[] args) 
{
	try
	{ 
		String a[]={"2","3","4","5"};
		List<String> l=Arrays.asList(a);
		l.add("7");
		System.out.println(l);
		} 
	catch(ArithmeticException e)
{ 
	System.out.println(e);

}
}
}