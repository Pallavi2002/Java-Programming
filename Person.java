package OOP;

public class Person {
	private String name;
	private int age;
	
	public Person()
	{
		name = null;
		age = 0;
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void Display()
	{
		System.out.print("Name = "+name+"Age = "+age);
	}
}
