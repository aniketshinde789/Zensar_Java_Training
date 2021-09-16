package MultithreadingAssingment;

public class ThreadUsingMultithreading extends Thread {

	@Override
	public void run() {
		System.out.println("Thread runing....");
	}

	public static void main(String args[]) {
		ThreadUsingMultithreading t1 = new ThreadUsingMultithreading(); // Thread create
		t1.start();
	}

}
