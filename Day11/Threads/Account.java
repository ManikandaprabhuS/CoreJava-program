package Day11.Threads;

public class Account {
	int balance;

	public Account() {
		balance = 5000;
	}

	public synchronized void withdraw(int ball) {
		try {
			Thread.sleep(1000);
		} catch (Exception ex) {
			System.out.println("Exception Occured.." + ex);
		}
		balance = balance - ball;
		System.out.println("Balance rem:: " + balance + " " + Thread.currentThread().getName());
	}
}
