package Day12.LambadaExpersionAssignment;

public class ManinMethode {

	public static void main(String[] args) {
		MyLambadaAssignment myAssignment = (int x, int y, int z) -> System.out.println(x * y * z);
		myAssignment.multiply(11, 5, 10);
	}

}
