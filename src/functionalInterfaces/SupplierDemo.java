package functionalInterfaces;

import java.util.function.Supplier;

public class SupplierDemo implements Supplier<SupplierBean> {

	@Override
	public SupplierBean get() {

		return new SupplierBean();
	}

	public static void main(String[] args) {

		SupplierDemo obj = new SupplierDemo();

		obj.get();

	}

}
