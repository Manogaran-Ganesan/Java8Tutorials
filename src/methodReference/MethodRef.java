package methodReference;

interface Method {

	public void add(int a, int b);

}

class Test {

	public static void sum(int x, int y) {

		System.out.println("the sum is :" + (x + y));
	}
}

public class MethodRef {

	public static void main(String[] args) {

		Method ref = Test::sum;
		ref.add(100, 200);
	}

}
