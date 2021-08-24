import java.util.*;
class InsufficientBalanceException extends Exception{}
class IllegalTransactionException extends Exception{}
class SavingAccount
{
	long id;
	double balance;
	double withdraw;
	double deposit;
	public void SavingAccount()
	{
		
	}
	public double withdrawMoney()
	{
		return withdraw;
	}
	
}
public class Java_A4_Q3 {

	public static void main(String[] args) 
	{
		Scanner p= new Scanner(System.in);
		SavingAccount s1= new SavingAccount();
		s1.balance= p.nextDouble();
		s1.withdrawMoney();
		s1.withdraw=p.nextDouble();
		try {
			if(s1.balance<s1.withdraw)
			{
				throw new InsufficientBalanceException();
			}
			else if (s1.withdraw<0)
			{
				throw new IllegalTransactionException();
			}
			else 
			{
				System.out.println("Amount is withdrawn");
			}
		}
		catch (InsufficientBalanceException e)
		{
			System.out.println("Balance is insufficient");
		}
		catch (IllegalTransactionException e)
		{
			System.out.println("Negative money can not be withdrawn");
		}

}
}

