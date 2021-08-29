package day10.Threads;

public class MultiThreadingDemo extends Thread {
	public void run() {
		System.out.println("My Thread is Runing State");
	}

	public static void main(String[] args) {
		// MultiThreadingDemo obj = new MultiThreadingDemo();
		(new MultiThreadingDemo()).start();
		(new MultiThreadingDemo()).start();
		System.out.println("End of Thread");
	}

}
