package seneca;

public class CommissionEmployee extends Employee {
	
	//fixedSalary = 0.0;
	//totalSales = 0.0;
	double fixedSalary = 0.0;
	double totalSales = 0.0;
	
	public CommissionEmployee(String fn, String ln, String dob, String gender,
							double fixed, double sales) {
		super(fn, ln, dob, gender);
		this.fixedSalary = fixed;
		this.totalSales = sales;
	}

	@Override
	public double calcGrossSalary() {
		return 0.0;
	}

	@Override
	public double calDeductions() {
		// $1000 allowance, remaining at 15% tax rate
		return 0.0;
	}

	@Override
	public double calNetSalary() {
		// base or fixed salary + %5 
		return 0.0;
	}

}
