package Day11.Threads;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationTest {

	public static void main(String[] args) {
		Studentinfo si = null;
		try {
			FileInputStream file = new FileInputStream("Student.txt");
			ObjectInputStream in = new ObjectInputStream(file);
			si = (Studentinfo) in.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(si.name);
		System.out.println(si.rid);
		System.out.println(si.contact);
	}

}
