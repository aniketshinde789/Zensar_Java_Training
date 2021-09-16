package MultithreadingAssingment;

public class DaemonThread1 extends Thread {
	@Override 
	public void run()
	{
		System.out.println("Child Thread..........");
	}
}
class ThreadDemo2
{


	public static void main(String args[])
	{
		System.out.println("Thread1");       //main Thread
		DaemonThread1 t=new DaemonThread1();     //create new Thread
		t.setDaemon(true);                 //daemon Thread
		t.start();
		
	}
}
