package methodReference;

public class RunnableInterface {

	public static void methodRef() {

		for (int i = 0; i <= 5; i++) {
			System.out.println("child thread1");
		}

	}

	public static void main(String[] args) {

		Runnable ref = RunnableInterface::methodRef;

		Thread t = new Thread(ref);

		t.start();

		for (int i = 0; i <= 5; i++) {
			System.out.println("main thread");
		}

	}

}
