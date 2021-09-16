package MultithreadingAssingment;

class myThread extends Thread {
	@Override
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("Thread is running succesfully after converting the daemon thread");
		} else {
			System.out.println("Thread is running without daemon thread");
		}
	}
}

public class DaemonThread {

	public static void main(String args[]) {
		System.out.println("main thread");
		myThread t1 = new myThread();
		t1.setDaemon(true); // Daemon thread
		t1.start();
	}
}
