package Class;

public class Student {
	
	public int rollno=11;
	protected int admissionno=3543;
	int age=21;
	private int courseid=102;
	
	public void dopublic()
	{
		System.out.println("public method");
	}
	protected void doprotected()
	{
		System.out.println("proteted method");
		
	}
	void dodefault()
	{
		System.out.println("Default method");
		
	}
	private void doprivate()
	{
		System.out.println("private method");
		
	}
} 