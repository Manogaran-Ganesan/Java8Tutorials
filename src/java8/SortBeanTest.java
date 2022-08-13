package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortBeanTest {

	public static void main(String[] args) {

		List<SortBean> sortBean = new ArrayList<SortBean>();
		sortBean.add(new SortBean(1, "rajini", 30000));
		sortBean.add(new SortBean(2, "mano", 40000));
		sortBean.add(new SortBean(3, "murali", 20000));

		/*
		 * Comparator<SortBean> ref = (o1, o2) -> o1.getSalary() - o2.getSalary();
		 * 
		 * Collections.sort(sortBean, ref);
		 * 
		 * System.out.println(sortBean);
		 */

		//sortBean.stream().sorted(((o1, o2) -> o2.getSalary() - o1.getSalary())).forEach(c -> System.out.println(c));

		sortBean.stream().sorted(Comparator.comparing(SortBean::getSalary)).forEach(System.out::println);

	}

}
