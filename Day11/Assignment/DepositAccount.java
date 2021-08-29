package Day11.Assignment;

/**
 * Synchronized Assignment - DepositeAccount
 * 
 * day:11
 * 
 * @author Mani
 *
 */
public class DepositAccount implements Runnable {
	Account act;

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			act.deposit(200);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public DepositAccount(Account act) {
		super();
		this.act = act;
	}

}
