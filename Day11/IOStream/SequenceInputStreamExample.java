package Day11.IOStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputStreamExample {

	public static void main(String[] args) throws IOException {
		FileInputStream input1 = new FileInputStream("D:\\Myfile.txt");
		FileInputStream input2 = new FileInputStream("D:\\MyWriter.txt");
		SequenceInputStream inst = new SequenceInputStream(input1, input2);
		int j;
		while ((j = inst.read()) != -1) {
			System.out.println((char) j);
		}
		inst.close();
		input1.close();
		input2.close();
	}

}
