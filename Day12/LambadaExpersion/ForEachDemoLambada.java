package Day12.LambadaExpersion;

import java.util.ArrayList;

public class ForEachDemoLambada {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("one");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.forEach((var) -> System.out.println(var));
	}

}
