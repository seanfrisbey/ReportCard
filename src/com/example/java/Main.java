package com.example.java;

import java.util.Scanner;

/**
 *
 */
public class Main{
	public static void main(String[]args){

		int numberOfClasses;
		String studentName = "No Name";
		Scanner scanner = new Scanner(System.in);

		System.out.println("Who is thie report card for? ");
		studentName = scanner.nextLine();

		while (true) {
			try {
				System.out.print("How many classes are on this report card? ");
				numberOfClasses = Integer.parseInt(scanner.nextLine());
				System.out.print("\n");
				break;
			} catch (NumberFormatException e) {
				System.out.println("The provided input was not a positive integer.");
			}
		}

		ReportCard reportCard = new ReportCard(studentName);
		Course tempCourse = new Course();

		for (int i = 0; i < numberOfClasses; i++) {
			System.out.print("What is the course name? ");
			tempCourse.setCourseName(scanner.nextLine());
			System.out.print("What is the teacher's name? ");
			tempCourse.setTeacherName(scanner.nextLine());
			try {
				System.out.print("What is the grade percentage? ");
				tempCourse.setGradePercentage(Float.parseFloat(scanner.nextLine()));
				System.out.print("\n");
				break;
			} catch (NumberFormatException e) {
				System.out.println("The provided input was not a positive number.");
			}
			System.out.print("What is the grade letter? ");
			tempCourse.setGradeLetter(scanner.nextLine());
			System.out.println();

			reportCard.addCourse(tempCourse);
		}
	}
}