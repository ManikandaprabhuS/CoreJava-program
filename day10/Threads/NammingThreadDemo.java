package day10.Threads;

class MyThread extends Thread {
	public void run() {
		System.out.println("Hi i am running....");
	}
}

public class NammingThreadDemo {
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();
		thread.setName("Anbu-Running this thread");
		System.out.println(thread.getName());
	}

}
