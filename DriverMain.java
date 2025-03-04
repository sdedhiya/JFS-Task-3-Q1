package TaxSystem;

public class DriverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1= new Employee(101, "Sneha", 100000);
		e1.calcTax();
		Product p1=new Product(1001, 100000, 2);
		p1.calcTax();
	}

}
