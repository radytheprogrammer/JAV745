package seneca;

public class HourlyEmployee extends Employee {

	private String fname = null;
	private String lname = null;
	private String dob = null;
	private String gender = null;
	private double rateOfPay = 0.0;
	private double hours = 0.0;

	HourlyEmployee(){
		super("", "", "", "");
	}
	
	HourlyEmployee (String fname,String lname,String dob,String gender,Double fixed,Double hours){
		super(fname, lname, dob, gender);
		this.rateOfPay = fixed;
		this.hours = hours;
	}
	
	//	Gross pay is the total amount of money an employee earns for time worked
	@Override
	public double calcGrossSalary() {
		double amount = 0.0;
		amount  = this.hours * this.rateOfPay;
		System.out.printf("%s %s's Gross Pay is: %.2f.",fname, lname, amount);
		return amount;
	}

	// ALL employees are allowed a personal tax-free allowance of $1000. The balance is taxed at 15%. 
	@Override
	public double calDeductions() {
		// TODO Auto-generated method stub
		double allowance = 0.0;
		allowance  = 1000 * 0.15;
		return allowance;
	}

	@Override
	public double calNetSalary() {
		// TODO Auto-generated method stub
		return 0.0;
	}
	
	@Override
	public String toString() {
//		return super.toString();
		String desc = "";
		desc  = super.toString() + " Fixed Salary: " + "RateOfPay:" +this.rateOfPay + "HoursWorked:" + this.hours;
		return desc;
	}


}
