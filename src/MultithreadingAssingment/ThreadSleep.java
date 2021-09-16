package MultithreadingAssingment;

public class ThreadSleep extends Thread {
	@Override
	public void run()
	{
		try {
			Thread.sleep(2000);//using sleep method pause the execution of Thread 
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		System.out.println("Child Thread");
	}
	public static void main(String args[]) throws InterruptedException
	{
		Thread.sleep(1000);
		System.out.println("Main Thread..");
		
		ThreadSleep t=new ThreadSleep();
		t.start();
	}
}
