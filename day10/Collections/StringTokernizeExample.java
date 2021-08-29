package day10.Collections;

import java.util.StringTokenizer;

public class StringTokernizeExample {

	public static void main(String[] args) {

		StringTokenizer st = new StringTokenizer("My name is Khan", " ");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
