package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CollectionsVsStream {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Adam");
		names.add("Jim");
		names.add("Jenny");
		
		names.remove(0);
		
		System.out.println(names);
		
		for (String name : names) {
			System.out.println(name);
		}
		
		Stream<String> nameStream = names.stream();
		nameStream.forEach(System.out::println);
		nameStream.forEach(System.out::println);


	}

}
