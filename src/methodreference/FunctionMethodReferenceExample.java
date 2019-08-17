package methodreference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

	public static void main(String[] args) {
		System.out.println(toUpperCaseLabmda.apply("java8"));
		System.out.println(toUpperMethodReference.apply("java8"));
	}
	
	static Function<String,String> toUpperCaseLabmda = (s) -> s.toUpperCase();
	
	static Function<String,String> toUpperMethodReference= String::toUpperCase;


}
