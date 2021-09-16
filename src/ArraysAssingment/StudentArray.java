package ArraysAssingment;

public class StudentArray {
	
	public int rollNo;
	public String name;
	public double percentage;
	
	public StudentArray()
	{
		
	}
	public StudentArray(int rollNo, String name,double percentage)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.percentage=percentage;
		
	}
	public void displayStud()
	{
		System.out.println("Roll Number :"+this.rollNo);
		System.out.println("Name :"+this.name);
		System.out.println("Percentage :"+this.percentage);
	
	}

}
