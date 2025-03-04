package TaxSystem;

public class Employee implements Taxable {

	double empID, salary;
	String name;
	
	
	
	


	public Employee(double i, String string, double j) {
		this.empID=i;
		this.salary=j;
		this.name=string;
	}



	@Override
	public void calcTax() {
		double tax;
		tax = salary * incomeTax;
		System.out.println("Your Salary Tax is:" +tax);
	}
	
}
