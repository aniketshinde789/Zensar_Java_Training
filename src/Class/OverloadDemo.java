package Class;

public class OverloadDemo {

	
	void calculateArea(float x)
	{
		System.out.println("Area of the square: "+x*x+" s units");
	}
	void calculateArea(float x,float y)
	{
		System.out.println("Area of the rectangle : "+x*y+" sq units ");
	}
	void calculateArea(double r)
	{
		double area=3.14*r*r;
		System.out.println("Areaof the circle : "+area+" sq units");
	}
	public static void main(String args[])
	{
		OverloadDemo obj=new OverloadDemo();
		obj.calculateArea(10,22);
		obj.calculateArea(6f);
		obj.calculateArea(7);
	}
}
