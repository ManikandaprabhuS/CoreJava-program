package day6.exam;

import java.util.Scanner;

public class ExamDemo {

	public static void main(String[] args) {
			 Scanner sc = new Scanner(System.in);
			 ExamDemo demo = new ExamDemo();
			for (int i = 1; i <=3; i++) {
			System.out.println("Enter the Student " + i + " Details");
			try {
			demo.getExamDetails(sc);
			//System.out.println("Student details are added successfully.");
			} catch (MarkException e) {
			System.out.println("Problem with Student - Exam details");
			System.out.println(e);
			}
			}
			sc.close();
			 }

	private void getExamDetails(Scanner sc) throws MarkException {
		System.out.println("Enter the Your Name:");
		String studentName = sc.next();

		 System.out.println("Enter the Your Exam Name:");
		String examName = sc.next();

		 System.out.println("Enter the Marks obtained on " + examName + ":");
		int mark = sc.nextInt();
		if (mark < 0 || mark > 100) {
		throw new MarkException(101, "Mark is not between 0 and 100 ");
		}
		else {
			System.out.println("Student details are added successfully.");

		}
		}
		}
