package assignmentsPractice;

public class Employee implements Taxable{
	private int empId;
	private String name;
	private float salary;
	private int tax_debt = 250000;
	public Employee(int empId, String name, float salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
	

	public int getEmpId() {
		return empId;
	}



	public String getName() {
		return name;
	}



	public float getSalary() {
		return salary;
	}


	public float calcTax()
	{
		float taxable_amount;
		float income_tax ;
		taxable_amount= salary -50000;
		income_tax = taxable_amount * (incomeTax/100);
		return income_tax;
	}
	
}
