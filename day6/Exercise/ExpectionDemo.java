package day6.Exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExpectionDemo {

	public static void main(String[] args) {
		File file = new File("E:\\read.txt	");
		try {
		FileReader reader = new FileReader(file);
		} catch (FileNotFoundException e) {
		System.out.println("File not found");
		}

	try {
		int i = Integer.parseInt("ABC");
		} catch (NumberFormatException e) {
		System.out.println("Input is not a number");
		}
	int[] a = { 1, 2, 3, 4, 5 };

	 try {
	System.out.println(a[6]);
	} 
	 catch (ArrayIndexOutOfBoundsException e) {
	System.out.println("Index is out of range");
	}
}
}
