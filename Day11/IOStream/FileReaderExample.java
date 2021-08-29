package Day11.IOStream;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("D:\\Eclipse\\Myfile.txt.txt");
		int i;
		while ((i = fr.read()) != -1) {
			System.out.print((char) i);
		}
		fr.close();
	}

}
