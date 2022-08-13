package stream;

public class EmpSalaryAggreate {

	private int id;
	private String name;
	private String dep;
	private int salary;

	public EmpSalaryAggreate(int id, String name, String dep, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.dep = dep;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmpAvg [id=" + id + ", name=" + name + ", dep=" + dep + ", salary=" + salary + "]";
	}

}
