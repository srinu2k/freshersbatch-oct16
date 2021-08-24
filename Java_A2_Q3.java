import java.util.*;
public class Bank 
{
	String cust_name;
	double cash;
	Bank()
	{
		
	}
	Bank(String cust_name, double cash)
	{
		this.cust_name=cust_name;
		this.cash=cash;
		
	}
	public double getTotalCash()
	{
		return cash;
	}
}
class Saving extends Bank
{
	int fd;
	Saving()
	{
		
	}
	Saving(String name, int fd)
	{
		super(name,fd);
		this.fd= fd;
	}
	public double getTotalCash()
	{
		return(cash+=fd);
	}
	
}
class Current extends Bank
{
	int cc;
	Current()
	{
		
	}
	Current(String name, int cc)
	{
		super(name,cc);
		this.cc= cc;
	}
	public double getTotalCash()
	{
		return(cash+=cc);
	}
}
class Run
{
	public static void main(String[]args)
	{
		Scanner in= new Scanner(System.in);
		Bank b1= new Bank();
		Saving s1= new Saving();
		System.out.println("Enter the Acc holder name and Savings:");
		s1.cust_name=in.nextLine();
		s1.fd= in.nextInt();
		b1.cash= s1.getTotalCash();
		Current c1= new Current();
		System.out.println("Enter the Acc holder name and Current:");
		c1.cust_name=in.next();
		c1.cc= in.nextInt();
		b1.cash = b1.cash + c1.getTotalCash();
		System.out.println("Total cash in the bank ="+b1.cash);
		
		
	}
}