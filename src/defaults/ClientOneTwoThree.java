package defaults;

public class ClientOneTwoThree implements InterfaceOne, InterfaceTwo, InterfaceThree{

	public static void main(String[] args) {
		
		ClientOneTwoThree clientOneTwoThree = new ClientOneTwoThree();
		clientOneTwoThree.methodA();
		clientOneTwoThree.methodB();
		clientOneTwoThree.methodC();

	}

	public void methodA() {
		System.out.println("Inside method A" + ClientOneTwoThree.class);
	
}

}
