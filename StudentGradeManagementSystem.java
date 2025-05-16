package ControlFlowStatement;

import java.util.Scanner;

public class StudentGradeManagementSystem {
	
	public static void main(String[] args) {
		//Student Grade Management System
		
		Scanner sc = new Scanner(System.in);
		String[] studentNames = new String[100];
		int[] marks = new int[100];
		int count = 0;
		boolean running = true;
		
		while(running) {
			System.out.println("\n===== Student Grade Menu =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();
            
            switch(choice) {
            case 1:
            	System.out.println("Enter student name: ");
            	String name = sc.nextLine();
            	System.out.println("Enter student marks (0-100):");
            	int mark = sc.nextInt();
            	
            	if(mark < 0 || mark > 100) {
            		System.out.println("Invalid marks! Must be 0 to 100.");
            		continue;
            	}
            	studentNames[count] = name;
            	marks[count] = mark;
            	count++;
            	System.out.println("Student added successfully.");
            	break;
            	
            case 2:
            	if(count == 0) {
            		System.out.println("No student records found.");
            		break;
            	}
            	System.out.println("\n--- Student Records ---");
            	for(int i = 0; i < count; i++) {
            		System.out.print("Name: " + studentNames[i] 
            				+ ", Marks: " + marks[i] 
            			    + ", Grade: ");
            		
            		if(marks[i] > 90) {
            			System.out.println("A");
            		} else if(marks[i] > 75) {
            			System.out.println("B");
            		} else if(marks[i] > 50) {
            			System.out.println("C");
            		} else {
            			System.out.println("FAIL");
            		}
            	}
            	break;
            	
            case 3:
            	System.out.println("Exiting Program.");
            	running = false;
            	break;
            default:
            	System.out.println("Invalid choice. Please try again.");
            }
		}
		sc.close();
	}

}
