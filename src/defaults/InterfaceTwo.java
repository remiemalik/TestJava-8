package defaults;

public interface InterfaceTwo extends InterfaceOne {

	default void methodB() {
		System.out.println("Inside method B");
	}
	
}
