package java8;

import java.util.ArrayList;
import java.util.List;

public class ForEachBeanTest {

	public static List<ForEachBean> getForEachBean() {

		List<ForEachBean> forEachBean = new ArrayList<ForEachBean>();

		forEachBean.add(new ForEachBean(1, "rajini", 20000));
		forEachBean.add(new ForEachBean(2, "mano", 30000));
		forEachBean.add(new ForEachBean(1, "murali", 40000));

		return forEachBean;

	}

	public static void main(String[] args) {

		System.out.println(ForEachBeanTest.getForEachBean());

		System.out.println("============");

		getForEachBean().stream().filter(p -> p.getSalary() > 20000).forEach(c -> System.out.println(c));

	}

}
