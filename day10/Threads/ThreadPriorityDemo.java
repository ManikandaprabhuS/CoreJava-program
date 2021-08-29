package day10.Threads;

public class ThreadPriorityDemo extends Thread {
	public void run() {
		System.out.println("Inside runs Methode");
	}

	public static void main(String[] args) {
		ThreadPriorityDemo t1 = new ThreadPriorityDemo();
		ThreadPriorityDemo t2 = new ThreadPriorityDemo();
		System.out.println("t1 thread Priority:" + t1.getPriority());
		System.out.println("t2 thread Priority:" + t2.getPriority());
		t1.setPriority(2);
		t2.setPriority(5);
		System.out.println("t1 Thread Priority :" + t1.getPriority());
		System.out.println("t1 Thread Priority :" + t2.getPriority());
		System.out.println(Thread.currentThread().getName());
		System.out.println("Main Methode priority:" + Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(10);
		System.out.println("Main Methode priority:" + Thread.currentThread().getPriority());
	}

}
