package defaults;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodsExample {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Adam", "Jenny", "Alex", "Dan", "Mike", "Eric");
		
//		Collections.sort(names);
//		
//		System.out.println(names);
	
		names.sort(Comparator.naturalOrder());
		
		System.out.println(names);
		
		names.sort(Comparator.reverseOrder());
		
		System.out.println(names);



	
	}

}
