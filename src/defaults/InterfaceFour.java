package defaults;

public interface InterfaceFour {

	default void methodA() {
		System.out.println("Inside method A" + InterfaceOne.class);
	}
}
