package Day11.Threads;

public class itc_even extends Thread {
	InterThreadCommunicationDemo no;

	itc_even(InterThreadCommunicationDemo no) {
		this.no = no;
	}

	public void run() {
		no.even();
	}
}
