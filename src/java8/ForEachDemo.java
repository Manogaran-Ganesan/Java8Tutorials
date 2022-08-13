package java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {

	public static void main(String[] args) {

		List<String> ls = new ArrayList<String>();

		ls.add("rajini");
		ls.add("mano");
		ls.add("murali");

		// ls.stream().forEach(s -> System.out.println(s));

		ls.stream().filter(p -> p.length() == 4).forEach(c -> System.out.println(c));

		Map<String, Integer> mp = new HashMap<String, Integer>();
		mp.put("rajini", 1);
		mp.put("mano", 2);
		mp.put("murali", 3);

		mp.entrySet().stream().filter(key -> key.getKey().length() > 4).forEach(m -> System.out.println(m));

	}

}
