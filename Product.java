package TaxSystem;



public class Product implements Taxable {

	double price;
	int pid, quantity;
	
	public Product(int i, double j, int k) {
		this.pid=i;
		this.price=j;
		this.quantity=k;
	}

	@Override
	public void calcTax() {

		double sTax;
		
		sTax = price * quantity * salesTax;
		
		System.out.println("Your Sales Tax is " +sTax);
		
		
	}

}
