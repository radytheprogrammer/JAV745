package seneca;

public class MonthlyEmployee extends Employee {
	
	//properties
	double fixedSalary = 0.0;
	
	MonthlyEmployee(String fn, String ln, 
					String dob, String gender,
					double fixed) {
		super(fn, ln, dob, gender);
		this.fixedSalary = fixed;
	}

	@Override
	public double calcGrossSalary() {
		return this.fixedSalary;
	}

	@Override
//	ALL employees are allowed a personal tax-free allowance of $1000. The balance is taxed at 15%. 
	public double calDeductions() {
		System.out.printf("%s's employee allowance is the balance taxed at 15%", this.firstName);
		return 1000 * (1 - 1 * 0.15);
	}

	@Override
	public double calNetSalary() {
		return 0.0;
	}

	@Override
	public String toString() {
//		return super.toString();
		String output = "";
		output  = super.toString() + " Fixed Salary: " + this.fixedSalary;
		return output;
	}

}
