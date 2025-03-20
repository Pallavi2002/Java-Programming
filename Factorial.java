package assignmentsPractice;

import java.util.Scanner;

public class Factorial extends Processor{
	public float process()
	{
		int fact=1;
		System.out.println("Enter for Factorial : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=1;i<=a;i++)
		{
			fact = fact*i;
		}
		return fact;
	}
}
