package Day11.Threads;

public class ThreadwithoutJointDemo extends Thread {

	public void run() {
		System.out.println("r1");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		System.out.println("r2");
	}

	public static void main(String[] args) {
		ThreadwithoutJointDemo t1 = new ThreadwithoutJointDemo();
		ThreadwithoutJointDemo t2 = new ThreadwithoutJointDemo();
		t1.start();
		t2.start();
	}

}
