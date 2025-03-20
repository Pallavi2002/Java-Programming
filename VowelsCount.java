package assignmentsPractice;

import java.util.Scanner;

public class VowelsCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String s = sc.next();
		byte[] s1 = s.getBytes();
		int count=0;
		
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i]== 'A' || s1[i]=='E' || s1[i]=='I' || s1[i]=='O' || s1[i]=='U' || s1[i]=='a' || s1[i]=='e' || s1[i]=='i' || s1[i]=='o' || s1[i]=='u')
			{
				count++;
			}
		}
		System.out.println("Total count of vowels in given name = "+count);
	}
}
