package Day11.Assignment;

/**
 * Synchronized Assignment - WithdrawAccount
 * 
 * day:11
 * 
 * @author $Dark
 *
 */

public class WithdrawAccount implements Runnable {
	Account act;

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			act.withdraw(400);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public WithdrawAccount(Account act) {
		super();
		this.act = act;
	}

}
