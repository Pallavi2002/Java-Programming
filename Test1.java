package assignmentsPractice;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Employee[] e = new Employee[2];
		
		
		System.out.println("Enter the employee Information");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<e.length;i++)
		{
			System.out.println("Enter Employee Id : ");
			int id = sc.nextInt();
			System.out.println("Enter Employee Name :");
			String name = sc.next();
			System.out.println("Enter Employee Salary");
			float sal = sc.nextFloat();
			
			e[i]=new Employee(id,name,sal);
		}
		
		for(Employee i:e)
		{
			System.out.println("Id = "+i.getEmpId()+" Name = "+i.getName()+" Salary = "+i.getSalary()+" Income Tax = "+i.calcTax());
		}
		
		
	}
}
