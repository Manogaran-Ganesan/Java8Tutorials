package java8;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;

public class SortList implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {

		return 0;
	}

	public static void main(String[] args) {

		List<Integer> ls = new ArrayList<Integer>();

		ls.add(10);
		ls.add(30);
		ls.add(20);
		ls.add(40);

		/*
		 * Collections.sort(ls); Collections.reverse(ls);
		 * 
		 * System.out.println(ls);
		 */

		ls.stream().sorted(Comparator.reverseOrder()).forEach(c -> System.out.println(c));

	}

}
