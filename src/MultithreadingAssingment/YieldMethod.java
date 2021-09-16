package MultithreadingAssingment;

public class YieldMethod extends Thread{
	@Override
	public void run()
	{
		
		for(int i=1;i<=5;i++)
		{
		System.out.println(Thread.currentThread().getName()+" " +i);
		}

	}
	public static void main(String args[])
	{
		YieldMethod t= new YieldMethod();
		t.start();
		Thread.yield();// yield method() which stops the current executing thread and give a chance to other threads for exceution
		for(int i=1;i<=5;i++)
		{
			
			System.out.println("Main Thread"+i);
		}
	}
}
