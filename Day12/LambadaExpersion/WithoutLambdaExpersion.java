package Day12.LambadaExpersion;

public class WithoutLambdaExpersion {

	public static void main(String[] args) {
		MyinterfaceName my = new MyinterfaceName() {
			// anonymous inner class for interface
			@Override
			public void sayMessage() {
				System.out.println("Hi Mani ");
			}
		};
		my.sayMessage();
	}

}
