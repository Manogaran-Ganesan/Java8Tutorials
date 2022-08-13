package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapAndReduce {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		List<String> words = Arrays.asList("mano", "rajinigg", "murali");

		int sum = 0;

		for (Integer n : numbers) {

			sum = sum + n;
		}
		System.out.println(sum);

		int cnt = numbers.stream().mapToInt(i -> i).sum();
		System.out.println(cnt);

		// Optional<Integer> num=numbers.stream().reduce((a,b)->a+b);
		Optional<Integer> num = numbers.stream().reduce((a, b) -> a * b);

		System.out.println(num.get());

		Optional<Integer> max = numbers.stream().reduce(Integer::max);
		System.out.println(max.get());

		Optional<Integer> min = numbers.stream().reduce(Integer::min);
		System.out.println(min.get());

		String len = words.stream().reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();
		if (len.length() <= 7) {
			System.out.println("Character lenth is ok");

		}

		else {
			System.out.println("character lenth exceed more than allowed size");
		}

	}

}
