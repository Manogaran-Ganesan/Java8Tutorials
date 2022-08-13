package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeeStream {

	public static void main(String[] args) {

		List<EmployeeBean> emp = new ArrayList<EmployeeBean>();

		emp.add(new EmployeeBean(1, "rajini", 1000));
		emp.add(new EmployeeBean(2, "mano", 2000));
		emp.add(new EmployeeBean(3, "murali", 3000));
		emp.add(new EmployeeBean(4, "ramya", 100));
		emp.add(new EmployeeBean(5, "seenu", 500));
		emp.add(new EmployeeBean(6, "raghu", 600));

		/*
		 * Predicate<EmployeeBean> predicate = em -> em.getEmpSalary() < 1000;
		 * 
		 * Function<EmployeeBean, Integer> function = empp -> empp.getEmpSalary() +
		 * 1000;
		 * 
		 * System.out.
		 * println("Employee who is getting less than 1000 and we gave hike to them");
		 * 
		 * for (EmployeeBean e : emp) {
		 * 
		 * if (predicate.test(e)) {
		 * 
		 * System.out.println(e.getEmpName()+"  "+e.getEmpSalary());
		 * 
		 * System.out.println(function.apply(e)); }
		 * 
		 * }
		 */

		List hike = emp.stream()
				.filter(em -> em.getEmpSalary() < 1000) 
				.map(empp -> empp.getEmpSalary() * 100)
				.collect(Collectors.toList());

		System.out.println(hike);

	}

}
