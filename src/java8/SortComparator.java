package java8;

import java.util.Comparator;

public class SortComparator implements Comparator<SortBean> {

	@Override
	public int compare(SortBean o1, SortBean o2) {

		return o2.getSalary() - o1.getSalary();
	}

}
