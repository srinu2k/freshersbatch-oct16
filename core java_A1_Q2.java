package helloworld;

public class java_A1_Q2 
{
	public static void main(String[] args)
	{
	    int low=100,high=999,n;
	    for(n=low;n<high;n++) 
	    {
		  int result=0,num;
	      num=n;
	      while (num!=0) 
	      {
	        int remainder=num%10;
	        result=result+(remainder*remainder*remainder);
	        num=num/10;
	      }
	      if (result==n)
	        System.out.println(+n+ " ");
	      }
	    System.out.println("above are the armstrong numbers between 100 to 999");
	  }
}