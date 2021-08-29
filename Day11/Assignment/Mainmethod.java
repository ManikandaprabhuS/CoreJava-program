package Day11.Assignment;

/**
 * Synchronized Assignment - Mainmethod
 * 
 * day:11
 * 
 * @author $Dark
 *
 */
public class Mainmethod {

	public static void main(String[] args) {
		try {
			float balance = 0;
			Account act = new Account();
			WithdrawAccount wa = new WithdrawAccount(act);
			DepositAccount da = new DepositAccount(act);
			Thread t1 = new Thread(wa);
			Thread t2 = new Thread(wa);
			Thread t3 = new Thread(wa);
			Thread t4 = new Thread(da);
			Thread t5 = new Thread(wa);
			t1.start();
			Thread.sleep(1000);
			t2.start();
			Thread.sleep(1000);
			t3.start();
			Thread.sleep(1000);
			t4.start();
			Thread.sleep(1000);
			t5.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
