package defaults;

public interface InterfaceOne {

	default void methodA() {
		System.out.println("Inside method A" + InterfaceOne.class);
	}
}
