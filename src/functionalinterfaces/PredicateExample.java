package functionalinterfaces;

import java.util.function.Predicate;

public class PredicateExample {
	
	static Predicate<Integer> p1 = (number) ->  number % 2 == 0;
	static Predicate<Integer> p3= (number) ->  number % 3 == 0;


	public static void predicateAnd() {
		System.out.println("Predicate and result is: " + p1.and(p3).test(10));
		System.out.println("Predicate and result is: " + p1.and(p3).test(9));

	}
	
	public static void predicateOr() {
		System.out.println("Predicate or result is: " + p1.or(p3).test(10));
		System.out.println("Predicate or result is: " + p1.or(p3).test(8));
		
	}
	
	public static void predicateNegate() {
		System.out.println("Predicate negate result is: " + p1.or(p3).negate().test(10));
		System.out.println("Predicate negate result is: " + p1.or(p3).negate().test(8));
		
	}
	
	public static void main(String[] args) {
	
		
		System.out.println(p1.test(10));
		
		
		System.out.println(p3.test(4));
		
//		predicateAnd();
//		predicateOr();
		predicateNegate();


	}

}
