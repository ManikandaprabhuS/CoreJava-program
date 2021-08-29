package Day11.Threads;

public class itc_odd extends Thread {

	InterThreadCommunicationDemo no;

	itc_odd(InterThreadCommunicationDemo no) {
		this.no = no;
	}

	public void run() {
		no.odd();
	}
}
