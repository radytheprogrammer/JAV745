package seneca;
import java.util.Date;

public abstract class Employee {
	
	String firstName = null;
	String lastName = null;
	String dob = null;  // Date DOB
	String gender = null;
	
	public abstract double calcGrossSalary();
	public abstract double calDeductions();
	public abstract double calNetSalary();
	
	public Employee() {
		super();
	}
	
	public Employee(String firstName, String lastName, String dob, String g) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.gender = g;
	}
	
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + ", gender=" + gender
				+ "]";
	}
	
	
}

/*
	ABC Manufacturing Ltd is a newly established manufacturing company that has a medium size
	work workforce. ABC Manufacturing staff is divided into three (3) major groups, that is, hourly
	paid workers, commission type workers and monthly fixed paid workers. 
	
	The financial controller of the company was bombarded with complaints by staff with respect to
	payment delivery. Employees claimed that salaries were not being issued on time and this was 
	mainly due to the manual system used to calculate their salary. To alleviate the problem, the 
	financial controller demanded that a payroll program be implemented to generate salaries 
	for ALL employees within the company. 
	
	You have been contracted as a programmer by ABC Manufacturing Ltd to write a payroll program 
	that will generate all employees’ salary. The program must calculate 5 employees’ gross pay, 
	deductions and net pay. The financial controller specified the following features and business
	rules are implemented in the program to ensure that each employee salary is calculated 
	correctly:-
*/