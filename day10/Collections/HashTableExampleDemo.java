package day10.Collections;

import java.util.Hashtable;

public class HashTableExampleDemo {

	public static void main(String[] args) {

		Hashtable<Integer, String> techlist = new Hashtable<Integer, String>();
		techlist.put(102, "Mani");
		techlist.put(103, "Sridhar");
		techlist.put(104, "Saravana");
		System.out.println("values befor removes:" + techlist);
		techlist.remove(104);
		System.out.println("values After removes:" + techlist);
	}

}
