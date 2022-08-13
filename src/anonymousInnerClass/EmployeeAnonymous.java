package anonymousInnerClass;

public class EmployeeAnonymous {

	public static void main(String[] args) {

		EmployeeBeanInterface ref = new EmployeeBeanInterface() {

			public EmployeeBean getBean() {

				return new EmployeeBean();
			}

		};
		
		ref.getBean();

	}

}
