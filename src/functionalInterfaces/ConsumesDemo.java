package functionalInterfaces;

import java.util.function.Consumer;

public class ConsumesDemo implements Consumer<Exception> {

	@Override
	public void accept(Exception t) {

		System.out.println(t);

	}

	public static void main(String[] args) {

		ConsumesDemo obj = new ConsumesDemo();
		obj.accept(new NullPointerException());

	}

}
