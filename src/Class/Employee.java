package Class;

public class Employee {
	
	private int id;
	private String name;
	private int salary;
	
	public void setName(String name)
	{
		this.name=name;;
	}
	public String getName()
	{
		return name;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public int  getId()
	{
		return id;
	}
	public void setSalary(int salary)
	{
		this.salary=salary;
	}
	public int getSalary()
	{
		return salary;
	}
	public String toString()
	{
		return "Employee[name= "+name+",id="+id+",salary="+salary+"]";
	}
	public static void main(String args[])
	{
		Employee obj=new Employee();
		obj.setName("Aniket");
		obj.setId(101);
		obj.setSalary(42000);
		
		System.out.println(obj.toString());
	}

	
}


