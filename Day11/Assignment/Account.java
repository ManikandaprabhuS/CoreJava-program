package Day11.Assignment;

/**
 * Synchronized Assignment- Account
 * 
 * Day :11
 * 
 * @author $Dark
 *
 */
public class Account {

	private float balance = 1000;
	private String accountName;

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public synchronized void withdraw(int amt) throws Exception {
		if (amt > balance) {
			throw new Exception("Amount is insufficient");
		}
		balance = balance - amt;
		System.out.println("Your Account balance is :" + balance);
	}

	public synchronized void deposit(int amt) {
		balance = amt + balance;
		System.out.println("Your Account balance is :" + balance);
	}

	public Account(float balance) {
		super();
		this.balance = balance;
	}

	public Account() {
		super();
	}

}
