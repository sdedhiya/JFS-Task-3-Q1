package TaxSystem;

public interface Taxable {

	static double salesTax = 0.07;
	static double incomeTax = 0.105;
	
	void calcTax();
	
}
