package Day11.IOStream;

import java.io.File;
import java.io.PrintWriter;

public class PrintWriterExample {

	public static void main(String[] args) throws Exception {
		PrintWriter writer = new PrintWriter(System.out);
		writer.write("JavaTpoint Provides Tutorial Of all Teach");
		writer.flush();
		writer.close();
		PrintWriter writer1 = null;
		writer1 = new PrintWriter(new File("D:\\Eclipse\\Myfile.txt.txt"));
		writer.write("Hi I  like Cyber Security");
		writer.flush();
		writer.close();

	}

}
