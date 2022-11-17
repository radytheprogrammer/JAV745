package seneca;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Payroll {
	
	public static Employee emp = null;
	public static Scanner sc = null;
	public static ArrayList<Employee> emps = new ArrayList<Employee>(); 
	public static String globalType = "";
	
	public static void main(String[] args) {
		// Create Scanner outside the loop
		sc = new Scanner(System.in);
		
		do {
				System.out.println("Enter Employee Details: ");
				System.out.println("First Name: ");
				String fname = sc.next();
				System.out.println("Last Name: ");
				String lname = sc.next();
				System.out.println("Date of birth (DOB, YYYY-MM-DD): ");
				String dob = sc.next();
				System.out.println("Gender: ");
				String gender = sc.next();
				System.out.println("Employee Pay Type (Monthly(M), Hourly(H) or Commissioned(C): M/H/C/X (X to quit)");
				String employeeCode = sc.next();
				System.out.printf("Your choice is: %s\n", employeeCode);
				
				// Monthly Employee
				if ( employeeCode.equals("m") || employeeCode.equals("M") ) {
					
					System.out.println("What is the Monthly Employee Fixed Salary :");
					double fixed = sc.nextDouble();
					emp = new MonthlyEmployee(fname, lname, dob, gender, fixed);
				
				// Hourly Employee
				} else if (employeeCode == "h" || employeeCode == "H") {            // Discuss with Prof string comparison
					
					System.out.println("What is the Hourly Employee rate of pay :");
					double fixed = sc.nextDouble();
					System.out.println("How many hours did they work? :");
					double hours = sc.nextDouble();
					emp = new HourlyEmployee(fname, lname, dob, gender, fixed, hours);	
				
				// Commission Employee	
				} else if (employeeCode == "c" || employeeCode == "C") {
					
					System.out.println("What is the Monthly Employee Fixed Salary :");
					double fixed = sc.nextDouble();
					System.out.println("How much did they earn in total sales? :");
					double totalSales = sc.nextDouble();
					emp = new CommissionEmployee(fname, lname, dob, gender, fixed, totalSales);
					
				} else if (employeeCode.equals("X")) {
					
					System.out.println("Exiting the program...");
					globalType = "x";
					break;
					
				} else {
					System.out.println("Unknown Employee. He/She is not part of our company ABC Manufacturing");
				}
				// Add the employee to the Employees ArrayList
				emps.add(emp); 
				
				System.out.println("Do you want to add another employee(y/n)?");
				String keepGoing = sc.next();
				if(keepGoing.equals("n")) {
					globalType = "x";
				}
				if(keepGoing.equals("y")) {
					globalType = ""; // reset to continue
				}
				
		} while( !globalType.equals("x")  );
		
		// Print all Employee information using enhanced for loop
		// DOES NOT PRINT
//		for (Employee e : emps) {
//			e.toString();
//		}
		System.out.println("why it won't execute?");
		
		Employee temp;
		for(int i = 0; i < emps.size(); i++) {
			
			temp = emps.remove(i);
			temp.toString();
			
		}
		
		int j = 0;
		if(emps.size() > 0) {
			temp = emps.remove(j);
			System.out.println(temp);
			System.out.println("toString: " + temp.toString());
			j++;
		}
		
		//Display the total number of processed employees.
		System.out.println("Total number of processed employees:    " + emps.size() );
		
	}
}

//After all the information is captured from the user and the relevant calculations are performed the program should generate the following reports:- :-

//A payroll displaying the output of ALL employees’: employee number, name, employee type, gross salary, deductions and net pay. 

//Display the total number of processed employees.
//Display the number of commission workers, hourly paid workers and monthly fixed paid workers that were processed.
//A cumulative figure tallying the total gross pay, deductions and net pay of all employees.
//The name and the value of the employee who earn the highest and lowest net salary.
