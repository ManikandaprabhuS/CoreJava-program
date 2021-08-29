package Day11.IOStream;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		File f = null;
		String[] paths;
		try {
			f = new File("D:/Eclipse");
			paths = f.list();
			for (String path : paths) {
				System.out.println(path);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
