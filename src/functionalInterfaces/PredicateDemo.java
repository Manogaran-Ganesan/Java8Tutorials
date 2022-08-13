package functionalInterfaces;

import java.util.function.Predicate;

public class PredicateDemo implements Predicate<String> {

	private String password;

	@Override
	public boolean test(String password) {

		return (password.length() < 5);
	}

	public void lenth() {

		if (test(password) == true) {

			System.out.println("The password leanth should be more than 6 characters");
			
		} else {

			System.out.println("the password lenth is OK");
		}

	}

	public static void main(String[] args) {

		PredicateDemo obj = new PredicateDemo();

		obj.test(obj.password = "abc");

		obj.lenth();

	}

}
