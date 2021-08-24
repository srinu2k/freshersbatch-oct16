import java.util.Scanner;
public class IncomeTax 
{
	public static void main(String[] args) 
	{
		int income, flag;
		float tax=0;
		System.out.println("Enter the user's income: ");	
		Scanner myObj = new Scanner(System.in);
		income = myObj.nextInt();
		if(income <=180000)
		{
			tax=0;
		}
		else if(income >180000 && income<=300000)
		{
			tax= income/10;
		}
		else if(income >300000 && income<=500000)
			{
				tax= income/5;
			}
		else if(income >500000 && income<=1000000)
		{
			tax= income*3/10;
		}
		
		System.out.println("the income tax for the user is "+tax);		
	}
}
