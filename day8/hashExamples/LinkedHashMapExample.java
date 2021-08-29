package day8.hashExamples;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		LinkedHashMap map = new LinkedHashMap();
		map.put("Mani", 22);
		map.put("Ram", 20);
		map.put("Mahi", "28");
		map.put("Mahi", "29");
		System.out.println("Map Elemets");
		System.out.println(map);
	}

}
