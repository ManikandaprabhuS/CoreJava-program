package Day11.Threads;

public class SubClassAccount implements Runnable {
	Account obj;

	public SubClassAccount(Account a) {
		obj = a;
	}

	public void run() {
		obj.withdraw(500);
	}
}
