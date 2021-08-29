package Day11.Threads;

public class ThreadWithJoindemo extends Thread {
	public void run() {
		System.out.println("r1");
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
		}
		System.out.println("r2");
	}

	public static void main(String[] args) {
		ThreadWithJoindemo t1 = new ThreadWithJoindemo();
		ThreadWithJoindemo t2 = new ThreadWithJoindemo();
		t1.start();
		try {
			t1.join();
		} catch (Exception e) {
		}
		t2.start();
	}

}
