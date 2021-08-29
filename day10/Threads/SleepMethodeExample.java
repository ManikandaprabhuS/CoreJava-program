package day10.Threads;

public class SleepMethodeExample {

	public static void main(String[] args) {
		System.out.println("Before Sleep");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("After Sleep");
	}

}
