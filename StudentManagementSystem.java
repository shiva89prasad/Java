package oopsconcept;

//Student Management System
//Concepts: Class, Encapsulation, Inheritance
//Objective: Manage student information like name, roll number, marks, and calculate grade.

class Person {
	protected String name;
	protected int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

class Student extends Person {
	private long rollno;
	private int marks;
	
	public Student(String name, int age, long rollno, int marks) {
		super(name, age);
		this.rollno = rollno;
		this.marks = marks;
	}
	
	public String getGrade() {
		if(marks >= 90) return "A";
		else if(marks >= 75) return "B";
		else return "C";
	}
	
	public void getResult() {
		System.out.println("Name: " + name);
      System.out.println("Roll No: " + rollno);
      System.out.println("Grade: " + getGrade());
	}
}
public class StudentManagementSystem {
	public static void main(String[] args) {
		Student s1 = new Student("Shiva", 24, 7103, 95);
		s1.getResult();
	}
}
