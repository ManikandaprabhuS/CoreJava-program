package Day11.Threads;

import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;

public class StDemo {

	public static void main(String[] args) throws IOException {
		FileReader freader = new FileReader("D:\\Myfile.txt.txt");
		StreamTokenizer st = new StreamTokenizer(freader);
		double sum = 0;
		int numWords = 0, numChars = 0;
		while (st.nextToken() != st.TT_EOF) {
			if (st.ttype == StreamTokenizer.TT_NUMBER) {
				sum += st.nval;
			} else if (st.ttype == StreamTokenizer.TT_WORD) {
				numWords++;
				numChars += st.sval.length();
			}
		}
		System.out.println("sum of the total number in the feild:" + sum);
		System.out.println("Total number of words (does not include nUmber) :" + numWords);
		System.out.println("NO of characters available in words :" + numChars);
	}

}
