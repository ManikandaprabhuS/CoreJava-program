package Day11.IOStream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {

	public static void main(String[] args) throws IOException {
		FileWriter writer = new FileWriter("D:\\Eclipse\\MyWriter.txt");
		writer.write("This\n is\n an\n example\n");
		writer.flush();
		writer.close();
	}
}
