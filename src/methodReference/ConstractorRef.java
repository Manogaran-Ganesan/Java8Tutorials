package methodReference;

interface NeedObj {

	public Bean getBean();
}

class Bean {

	public Bean() {

		System.out.println("Object created for Bean class");

	}
}

public class ConstractorRef {

	public static void main(String[] args) {

		NeedObj ref = Bean::new;
		ref.getBean();

		NeedObj ref2 = () -> new Bean();
		ref2.getBean();

	}

}
