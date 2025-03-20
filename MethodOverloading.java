package OOP;

public class MethodOverloading {
	public static void add(int a, int b)
	{
		int res =0;
		res = a+b;
		System.out.println("Addition = "+res);
	}
	public static void add(int a, int b,int c)
	{
		int res =0;
		res = a+b+c;
		System.out.println("Addition = "+res);
	}
	public static void add(float a, float b)
	{
		float res =0;
		res = a+b;
		System.out.println("Addition = "+res);
	}
	public static void main(String[] args) {
		add(5,10);
		add(1,5,10);
		add(1.5f,2.5f);
	}
}
