package question3;

public interface bankaccrepo{
	public double getBalance(long accountId);
	public double updateBalance(long accountId, double newBalance);
}
