import java.util.*;
public class java_A1_Q3
{
	public static void main (String args[ ])
	{
	    double amount,interest,year,sim,com;
	    Scanner sc=new Scanner (System.in);
	    System.out.println("Enter the amount:");
	    amount=sc.nextDouble();
	    System.out.println("Enter the No.of years:");
	    year=sc.nextDouble();
	    System.out.println("Enter the interest of  interest");
	    interest=sc.nextDouble();
	    sim=(amount*year*interest)/100;
	    com=amount*Math.pow(1.0+interest/100.0,year)-amount;
	    System.out.println("Simple Interest="+sim);
	    System.out.println("Compound Interest="+com);
	   }
	}