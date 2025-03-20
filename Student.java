package OOP;

public class Student extends Person{
	private int rollNo;
	
	public Student()
	{
		super();
		rollNo=0;
	}

	public Student(String name,int age,int rollNo) {
		super(name,age);
		this.rollNo = rollNo;
	}

	
	public void display()
	{
		super.Display();
		System.out.println("RollNo = "+rollNo);
	}
}
