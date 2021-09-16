package MultithreadingAssingment;

//try to change main thread name 
class testThread extends Thread {
	@Override
	public void run() {
		System.out.println("Thread running  " + Thread.currentThread().getName()); // get thread name

	}
}

public class ThreadNameChange {
	public static void main(String args[]) {
		testThread t1 = new testThread(); // create Thread
		t1.start();
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().isAlive()); // Thread is dead or not show boolean value
		t1.isAlive();

	}

}
