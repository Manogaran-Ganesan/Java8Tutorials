package methodReference;

public class EmployeeTest {

	public static void main(String[] args) {

		EmployeeInterface ref = EmployeeBean::new;

		EmployeeBean mano = ref.getEmpBean(1, "mano");
		EmployeeBean rajini = ref.getEmpBean(2, "rajini");

		mano.display();
		rajini.display();

		//EmployeeInterface ref1 = (id, name) -> new EmployeeBean(3, "murali");
		
	}

}
