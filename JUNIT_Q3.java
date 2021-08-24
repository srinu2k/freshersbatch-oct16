import java.util.*;
class InsufficientFundsException extends Exception{}
class BankAccount
{
	double balance=3000;
	double withdraw;
	public void withdrawMoney(double withdraw) throws InsufficientFundsException
	{
			if(balance< withdraw)
				throw new InsufficientFundsException();
			else 
				System.out.println("Amount is withdrawn");

	}


}