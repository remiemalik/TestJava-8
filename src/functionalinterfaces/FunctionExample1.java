package functionalinterfaces;

public class FunctionExample1 {

	public static void main(String[] args) {
		String result = performConcat("hello");
		
		System.out.println(result);

	}
	
	public static String performConcat (String name) {
		return FunctionExample.addSomeString.apply(name);
	}

}
