package day10.Collections;

import java.io.FileReader;
import java.util.Properties;

public class PropertiseDemo {

	public static void main(String[] args) throws Exception {
		FileReader propFile = new FileReader("db.properties");
		Properties p = new Properties();
		p.load(propFile);

		System.out.println(p.getProperty("user"));
		System.out.println(p.getProperty("password"));
	}

}
