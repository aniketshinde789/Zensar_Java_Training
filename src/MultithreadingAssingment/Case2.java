package MultithreadingAssingment;

//performing single task at multiple thread
class Testt extends Thread
{
	public void run()
	{
		System.out.println("Task 2");
	}
}

public class Case2 {
	public static void main(String args[])
	{
		Testt t1=new Testt();
		t1.start();
		
		Testt t2=new Testt();
		t2.start();
	}

}
