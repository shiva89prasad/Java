package myjavaproject;

import java.util.Scanner;

public class Operators {
	
public static void main(String[] args) {
		
		/*
		 Project Title: "Student Grade Calculator"
         Description: This project takes student marks for 3 subjects, calculates total, 
         average, grade, and shows whether the student has passed or failed using 
         different Java operators.
		 */
		
		Scanner sc = new Scanner(System.in);
		int studCount = 0;
		
		System.out.println("Enter the name of Student: ");
		String name = sc.nextLine();
		
		System.out.println("Enter Math Marks: ");
		int math = sc.nextInt();
		
		System.out.println("Enter Science Marks: ");
		int science = sc.nextInt();
		
		System.out.println("Enter Social Marks: ");
		int social = sc.nextInt();
		
		studCount++;
		
		int total = math + science + social; //total marks
		double average = total / 3.0; //average marks
		
		boolean isPassed = (math >= 35) && (science >= 35) && (social >= 35);
		
		char grade;
		if (average >= 90) {
			grade = 'A';
		} else if (average >= 75) {
			grade = 'B';
		} else if (average >= 50) {
			grade = 'C';
		} else {
			grade = 'D';
		}
		
		System.out.println("\n--- Student Report ---");
		System.out.println("Name: " + name);
		System.out.println("Total: " + total);
		System.out.println("Average: " + average);
		System.out.println("Grade: " + grade);
		System.out.println("Result: " + (isPassed ? "PASS" : "FAIL"));
		System.out.println("Students Processed: " + studCount);
		System.out.println("--- Thank You ---");
		
		/*
		 Output:
		 Enter the name of Student: Shiva Prasad N
         Enter Math Marks: 90
         Enter Science Marks: 87
         Enter Social Marks: 94

         --- Student Report ---
         Name: Shiva Prasad N
         Total: 271
         Average: 90.33333333333333
         Grade: A
         Result: PASS
         Students Processed: 1
         --- Thank You ---
		 */
	} 

}
