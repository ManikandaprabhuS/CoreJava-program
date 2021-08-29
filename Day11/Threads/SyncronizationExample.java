package Day11.Threads;

public class SyncronizationExample {

	public static void main(String[] args) {
		Account a1 = new Account();
		SubClassAccount cl = new SubClassAccount(a1);
		Thread t1 = new Thread(cl, "a");
		Thread t2 = new Thread(cl, "b");
		Thread t3 = new Thread(cl, "c");
		t1.start();
		t2.start();
		t3.start();
	}

}
