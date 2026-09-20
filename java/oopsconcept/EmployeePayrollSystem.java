package oopsconcept;

//Employee Payroll System
//Concepts: Polymorphism, Abstraction
//Objective: Calculate salary for different types of employees (Full-Time, Part-Time).

abstract class Employee {
	String name;
	int id;
	
	Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	abstract double currentSalary();
}

class FullTimeEmployee extends Employee{
	double monthlySalary;
	
	FullTimeEmployee(String name, int id, double monthlySalary) {
		super(name, id);
		this.monthlySalary = monthlySalary;
	}
	
	double currentSalary() {
		return monthlySalary;
	}
}

class PartTimeEmployee extends Employee{
	int hoursWorked;
    double ratePerHour;
    
    PartTimeEmployee(String name, int id, int hoursWorked, double ratePerHour) {
    	super(name, id);
    	this.hoursWorked = hoursWorked;
    	this.ratePerHour = ratePerHour;
    }
    
    double currentSalary() {
    	return hoursWorked * ratePerHour;
    }
}

public class EmployeePayrollSystem {
	public static void main(String[] args) {
		Employee e1 = new FullTimeEmployee("Shiva", 103, 25000);
		Employee e2 = new PartTimeEmployee("Prasad", 102, 45, 80);
		
		System.out.println("Shiva's Salary: " + e1.currentSalary());
		System.out.println("Prasad's Salary: " + e2.currentSalary());
	}
}
