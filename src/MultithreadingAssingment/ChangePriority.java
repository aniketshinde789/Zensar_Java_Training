package MultithreadingAssingment;

public class ChangePriority extends Thread {
	@Override
	public void run() {
		System.out.println("Child Thread Priority " + Thread.currentThread().getPriority()); // child thread inherits
																								// properties from main
																								// thread
	}

	public static void main(String args[]) {
		System.out.println("Main Thread Priority " + Thread.currentThread().getPriority()); // default Priority
		ChangePriority cp = new ChangePriority();
		cp.start();
		System.out.println(cp.getName());

		Thread.currentThread().setPriority(MAX_PRIORITY);
		System.out.println("Thread1 Priority " + Thread.currentThread().getPriority());

		Thread.currentThread().setPriority(MIN_PRIORITY);
		System.out.println("Thread2 Priority " + Thread.currentThread().getPriority());

		Thread.currentThread().setPriority(NORM_PRIORITY);
		System.out.println("Thread3  Priority " + Thread.currentThread().getPriority());

		Thread.currentThread().setPriority(15);// after set priority 15 show error java.lang.IllegalArgumentException
		System.out.println("Thread4  Priority " + Thread.currentThread().getPriority());

	}

}
