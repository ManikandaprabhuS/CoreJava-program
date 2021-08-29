package Day11.IOStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {

	public static void main(String[] args) throws IOException {

		InputStreamReader ids = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ids);
		System.out.println("Enter Name:");
		String input = br.readLine();
		System.out.println("My Name is:" + input);
		br.close();
	}

}
