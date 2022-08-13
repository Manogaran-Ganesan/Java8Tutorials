package functionalInterfaces;

import java.util.function.Function;

public class FunctionDemo implements Function<String, Integer>{
	
	@Override
	public Integer apply(String t) {
		
		return null;
	}

	public static void main(String[] args) {

		Function<String, Integer> ref = (s) -> {

			int len = s.length();

			return len;
		};

		System.out.println(ref.apply("manog"));

	}



}
