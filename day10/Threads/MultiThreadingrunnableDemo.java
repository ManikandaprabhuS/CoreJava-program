package day10.Threads;

public class MultiThreadingrunnableDemo implements Runnable {
	public void run() {
		Thread th = new Thread((new MultiThreadingrunnableDemo()));
		th.start();
		System.out.println("My Thread is Runing State");
	}

	public static void main(String[] args) {
		Thread th = new Thread((new MultiThreadingrunnableDemo()));
		th.start();
		System.out.println("End of Thread");
	}

}
