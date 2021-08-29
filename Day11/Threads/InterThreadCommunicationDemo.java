package Day11.Threads;

public class InterThreadCommunicationDemo {
	boolean flag = false;

	synchronized void even() {
		if (!flag) {
			try {
				wait();
			} catch (Exception e) {

			}
		}
		for (int i = 2; i <= 10; i++) {
			if (!flag) {
				try {
					wait();
				} catch (Exception e) {

				}
			}
			if (i % 2 == 0) {
				System.out.println(i + "-even" + (i * i));
			}
			flag = false;
			notify();
		}
	}

	synchronized void odd() {
		if (!flag) {
			try {
				wait();
			} catch (Exception e) {

			}
		}
		for (int i = 1; i <= 10; i++) {
			if (!flag) {
				try {
					wait();
				} catch (Exception e) {

				}
			}
			if (i % 2 != 0) {
				System.out.println(i + "-even" + (i * i));
			}
			flag = false;
			notify();
		}
	}
}