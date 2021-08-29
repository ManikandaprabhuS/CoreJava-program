package Day12.LambadaExpersion;

public interface MultiInterface {

	public String sayHello(String name);

	// abstract
	public String sayHello1(String name);

	// static
	public static int add(int n1, int n2) {
		return n1 + n2;
	}

	// equals() method in object class
	boolean equals(Object obj);

	// default
	default public int defaultMethod(int var) {
		return var + 100;
	}
}
