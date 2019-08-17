package defaults;

public interface InterfaceThree extends InterfaceTwo {
	default void methodC() {
		System.out.println("Inside method C");
	}
}
