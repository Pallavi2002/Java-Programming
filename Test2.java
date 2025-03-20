package assignmentsPractice;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Product[] p = new Product[2];
		
		
		System.out.println("Enter the Product Information");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<p.length;i++)
		{
			System.out.println("Enter Product Id : ");
			int id = sc.nextInt();
			System.out.println("Enter Product price :");
			float price = sc.nextFloat();
			System.out.println("Enter Product quantity");
			int quant = sc.nextInt();
			
			p[i]=new Product(id,price,quant);
		}
		
		for(Product i:p)
		{
			System.out.println("Id = "+i.getPid()+" Name = "+i.getPrice()+" Salary = "+i.getQuantity()+" Income Tax = "+i.calcTax());
		}
	}
}
