package question3;



public class bankrepoimpl implements bankaccrepo {
	
	bankacc account1;
	bankacc account2;
	bankacc account3;
	
	

	public bankacc getAccount1() {
		return account1;
	}

	public void setAccount1(bankacc account1) {
		this.account1 = account1;
	}

	public bankacc getAccount2() {
		return account2;
	}

	public void setAccount2(bankacc account2) {
		this.account2 = account2;
	}

	public bankacc getAccount3() {
		return account3;
	}

	public void setAccount3(bankacc account3) {
		this.account3 = account3;
	}

	public double getBalance(long accountId) {
		
		if(accountId==account1.getAccountId())
			return account1.getAccountBalance();
		else if(accountId==account2.getAccountId())
			return account2.getAccountBalance();
		else if(accountId==account3.getAccountId())
			return account3.getAccountBalance();
		return -1;
	}

	public double updateBalance(long accountId, double newBalance) {
		if(accountId==account1.getAccountId()) {
			account1.setAccountBalance(newBalance);
			return newBalance;
		}
		
		else if(accountId==account2.getAccountId()) {
			account2.setAccountBalance(newBalance);
			return newBalance;
		}
		
		else if(accountId==account3.getAccountId()) {
			account3.setAccountBalance(newBalance);
			return newBalance;
		}
		
		return -1;
	}

	@Override
	public String toString() {
		return "BankAccountRepositoryImpl [account1=" + account1 + ", account2=" + account2 + ", account3=" + account3
				+ "]";
	}

	
	
	
}
