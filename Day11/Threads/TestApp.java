package Day11.Threads;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestApp {

	public static void main(String[] args) {
		try {
			Studentinfo si = new Studentinfo("Mani", 75, "9852369");
			FileOutputStream fos = new FileOutputStream("student.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(si);
			oos.close();
			fos.close();
			System.out.println("success");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
