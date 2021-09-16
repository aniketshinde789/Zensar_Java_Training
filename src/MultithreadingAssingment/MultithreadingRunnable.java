package MultithreadingAssingment;

public class MultithreadingRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread running....");
	}

	public static void main(String args[]) {
		MultithreadingRunnable t1 = new MultithreadingRunnable();
		Thread t2 = new Thread(t1); // Thread create
		t2.start();
	}

}
