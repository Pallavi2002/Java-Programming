package assignmentsPractice;

import java.util.Scanner;

public class AreaOfCircle extends Processor{
	final double pi = 3.14;
	Scanner sc = new Scanner(System.in);
	public float process()
	{
		System.out.println("Enter the radius :");
		float r = sc.nextFloat();
		double area = pi * r * r;
		return (float) area;
	}
}
