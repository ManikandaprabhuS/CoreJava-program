package day6.Exercise;

public class FinalyDemo {

	public static void main(String[] args) {
		int[] a = new int[2];
		// System.out.println("end of prg");
		try {
			System.out.println("print the answer" + a[3] + 10 / 0);
		} catch (Exception e) {
			System.out.println("error is " + e.getMessage());
		} finally {
			System.out.println("Final is printed");
		}
	}

}
