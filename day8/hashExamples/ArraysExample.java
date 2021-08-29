package day8.hashExamples;

import java.util.Arrays;

public class ArraysExample {

	public static void main(String[] args) throws Exception {

		int DevArray[] = { 1, 3, 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
		Arrays.sort(DevArray);
		printArray("Sorted Array:", DevArray);
		int index = Arrays.binarySearch(DevArray, 2);
		System.out.println("2 is found at index " + index);
	}

	private static void printArray(String message, int DevArray[]) {
		System.out.println(message + ":[length: " + DevArray.length + "]");
		for (int i = 0; i < DevArray.length; i++) {
			if (1 != 0) {
				System.out.print(" ,");
			}
			System.out.print(DevArray[i]);
		}
		System.out.println();
	}
}
