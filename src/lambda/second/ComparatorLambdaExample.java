package lambda.second;

import java.util.Comparator;

public class ComparatorLambdaExample {

	public static void main(String[] args) {
		
		// prior java 8
		
		Comparator<Integer> comparator = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer first, Integer second) {
				return first.compareTo(second);
			}
		};
		
		System.out.println("Result of the comparator is: " + comparator.compare(3, 2));
		
		// lambda way
		Comparator<Integer> comparatorLambda = (Integer a, Integer b) ->  a.compareTo(b); ; 
		
		System.out.println("Result of the comparator using Lambda is: " + comparatorLambda.compare(3, 2));
		
		Comparator<Integer> comparatorLambdaTwo = (a,  b) ->  a.compareTo(b); ; 
		
		System.out.println("Result of the comparator using Lambda Two is: " + comparatorLambda.compare(3, 2));

	}

}
