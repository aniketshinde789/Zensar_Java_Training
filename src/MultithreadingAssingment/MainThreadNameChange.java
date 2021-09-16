package MultithreadingAssingment;

public class MainThreadNameChange {

	public static void main(String[] args) {

		System.out.println("Hello");
		System.out.println(Thread.currentThread().getName()); // current thread name main
		Thread.currentThread().setName("Aniket"); // new name set using setName
		System.out.println(Thread.currentThread().getName()); // Aniket
	}

}
