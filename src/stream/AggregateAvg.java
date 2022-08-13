package stream;

import java.util.Arrays;
import java.util.List;

public class AggregateAvg {

	public static void main(String[] args) {

		List<EmpSalaryAggreate> emp = Arrays.asList(new EmpSalaryAggreate(1, "rajini", "SC", 1000),
				new EmpSalaryAggreate(2, "mano", "IT", 2000), new EmpSalaryAggreate(3, "murali", "SC", 3000),
				new EmpSalaryAggreate(4, "ramya", "IT", 4000), new EmpSalaryAggreate(5, "seenu", "IT", 5000),
				new EmpSalaryAggreate(6, "raghu", "SC", 6000));

		double avgSalary = emp.stream()
				.filter(employee -> employee.getDep().equalsIgnoreCase("IT"))
				.map(employee -> employee.getSalary())
				.mapToInt(em -> em)
				.average().getAsDouble();

		System.out.println("Avg salary in IT Dep :" + avgSalary);

		Integer sumSalary = emp.stream()
				.filter(employee -> employee.getDep().equalsIgnoreCase("IT"))
				.map(employee -> employee.getSalary())
				.mapToInt(em -> em)
				.sum();

		System.out.println("sum salary in IT Dep :" + sumSalary);

		Integer maxSalary = emp.stream()
				.filter(employee -> employee.getDep().equalsIgnoreCase("IT"))
				.map(employee -> employee.getSalary())
				.mapToInt(em -> em).max()
				.getAsInt();

		System.out.println("max salary in IT Dep :" + maxSalary);

		Integer minSalary = emp.stream()
				.filter(employee -> employee.getDep().equalsIgnoreCase("IT"))
				.map(employee -> employee.getSalary())
				.mapToInt(em -> em).min()
				.getAsInt();

		System.out.println("min salary in IT Dep :" + minSalary);

	}

}
