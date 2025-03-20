package assignmentsPractice;

public class Product implements Taxable{
	private int pid;
	private float price;
	private int quantity;
	public Product(int pid, float price, int quantity) {
		super();
		this.pid = pid;
		this.price = price;
		this.quantity = quantity;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float calcTax()
	{
		float sales_tax;
		sales_tax = price * (salesTax/100);
		return salesTax;
	}

}
