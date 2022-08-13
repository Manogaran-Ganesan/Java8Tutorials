package functionalInterfaces;

import java.util.List;

public class Student {

	private int rollnumber;
	private String name;
	private int age;
	private String specialization;
	private List<Integer> phonenumbers;

	public Student(int rollnumber, String name, int age, String specialization, List<Integer> phonenumbers) {
		super();
		this.rollnumber = rollnumber;
		this.name = name;
		this.age = age;
		this.specialization = specialization;
		this.phonenumbers = phonenumbers;
	}

	public int getRollnumber() {
		return rollnumber;
	}

	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public List<Integer> getPhonenumbers() {
		return phonenumbers;
	}

	public void setPhonenumbers(List<Integer> phonenumbers) {
		this.phonenumbers = phonenumbers;
	}

	@Override
	public String toString() {
		return "Student [rollnumber=" + rollnumber + ", name=" + name + ", age=" + age + ", specialization="
				+ specialization + ", phonenumbers=" + phonenumbers + "]";
	}

}
