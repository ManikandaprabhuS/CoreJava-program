package Day11.Threads;

public class InterThreadCommnExample {

	public static void main(String p[]) {
		InterThreadCommunicationDemo e1 = new InterThreadCommunicationDemo();
		itc_even e2 = new itc_even(e1);
		itc_odd e3 = new itc_odd(e1);
		e2.start();
		e3.start();

	}

}
