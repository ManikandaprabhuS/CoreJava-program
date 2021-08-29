package day8.hashExamples;

import java.util.HashMap;
import java.util.Map;

public class HashMapexample {

	public static void main(String[] args) {
		Map namesmap = new HashMap();

		namesmap.put("Mani", "22");
		namesmap.put("Ram", "20");
		namesmap.put("Mahi", "28");
		namesmap.put("Mahi", "29");
		System.out.println("Map Elemets");
		System.out.println(namesmap);
	}

}
