package Day11.IOStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRReadLineDemo {

	public static void main(String[] args) throws IOException {
		String str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the  chr or q to quit it");
		do {
			str = br.readLine();
			System.out.println(str);
		} while (!str.equals("stop"));
	}

}
