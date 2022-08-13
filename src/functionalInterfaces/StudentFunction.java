package functionalInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StudentFunction {

	public static void main(String[] args) {

		List<Student> studentsInfo = new ArrayList<Student>();

		studentsInfo.add(new Student(1, "rajini", 29, "Bio", Arrays.asList(123, 123)));
		studentsInfo.add(new Student(2, "mano", 27, "Tech", Arrays.asList(456, 456)));
		studentsInfo.add(new Student(3, "murali", 24, "Eng", Arrays.asList(789, 789)));
		studentsInfo.add(new Student(4, "ramya", 29, "Hr", Arrays.asList(198, 198)));
		studentsInfo.add(new Student(5, "raghu", 28, "Pyc", Arrays.asList(765, 765)));
		studentsInfo.add(new Student(6, "seenu", 24, "Bpo", Arrays.asList(987, 987)));

		System.out.println("funtion...");
		Function<Student, String> function = f -> f.getName().toUpperCase();
		List<String> upper = new ArrayList<String>();

		for (Student fun : studentsInfo) {

			upper.add(function.apply(fun));

			System.out.println(upper);

		}

		System.out.println("supplier....");
		Supplier<Student> supplier = () -> new Student(7, "duplicate", 1, "dup", Arrays.asList(000, 000));
		System.out.println(studentsInfo.add(supplier.get()));

		System.out.println("Consumer...");
		Consumer<Student> consumer = s -> {
			System.out.println("Name :" + s.getName() + " and  " + "Age :" + s.getAge());
		};

		for (Student s : studentsInfo) {

			consumer.accept(s);
		}

		System.out.println("Predicate....");

		Predicate<Student> predicate = p -> p.getAge() > 25;

		List<Student> ageabove25 = new ArrayList<Student>();

		for (Student pre : studentsInfo) {

			if (predicate.test(pre)) {

				ageabove25.add(pre);

				System.out.println(pre);
			}

		}

	}

}
