import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankAccountTest
{

	@Test
	void test() 
	{
		BankAccount a = new BankAccount();

		assertThrows(InsufficientFundsException.class, ()->a.withdrawMoney(1000000));
		
	}
}