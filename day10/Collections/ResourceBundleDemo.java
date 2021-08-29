package day10.Collections;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * To demonstrate to show message as per lang code and country code....
 * 
 * Topic: Core Java
 * 
 * Day#: 10
 * 
 * @author Mani
 *
 */
public class ResourceBundleDemo {
	/**
	 * Create two files under src folder message_en_US.properties
	 * message_zh_CN.properties
	 * 
	 * add greeting=<text> as per your wish and execute the program
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your country choice:");
		System.out.println("1 for US English");
		System.out.println("2 for Chinese");
		int country = sc.nextInt();

		switch (country) {
		case 1:
			ResourceBundle rb = ResourceBundle.getBundle("message", new Locale("en", "US"));
			System.out.println("In US English:" + rb.getString("greeting"));
			break;
		case 2:
			ResourceBundle rb2 = ResourceBundle.getBundle("message", new Locale("zh", "CN"));
			System.out.println("In Chinese:" + rb2.getString("greeting:"));
			break;
		default:
			break;
		}
		sc.close();
	}
}
