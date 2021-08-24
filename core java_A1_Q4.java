package helloworld;
import java.util.*;
public class java_A1_Q4 {

	public static void main(String[] args) 
	{
		 double sub1,sub2,sub3,all1,all2;
	    Scanner sc=new Scanner (System.in);
	    System.out.print("Enter the marks for sub1:");
	    sub1=sc.nextDouble();
	    System.out.print("Enter the marks for sub2:");
	    sub2=sc.nextDouble();
	    System.out.print("Enter the marks for sub3:");
	    sub3=sc.nextDouble();
	    
	    if(sub1>60&&sub2>60&&sub3>60) 
	    {
	    	System.out.println("passed");
	    }
	    else if(sub1>60&&sub2>60)
	    {
	    	System.out.println("promoted");
	    }
	    else if(sub2>60&&sub3>60)
	    {
	    	System.out.println("promoted");
	    }
	    else if(sub1>60&&sub3>60)
	    {
	    	System.out.println("promoted");
	    }
	    else if(sub1>60&&sub2<60&&sub3<60)
	    {
	    	System.out.println("failed");
	    }
	    else if(sub1<60&&sub2>60&&sub3<60)
	    {
	    	System.out.println("failed");
	    }
	    else if(sub1<60&&sub2<60&&sub3>60)
	    {
	    	System.out.println("failed");
	    }
	    else
	    {
	    	System.out.println("failed");
	    }
}

}
