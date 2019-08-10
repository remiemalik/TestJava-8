package imperiativevsdeclarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Two {

	public static void main(String[] args) {
		
		// imperitave
		
		List<Integer> list = Arrays.asList(1, 2, 3,3, 4, 5, 5, 5, 6, 7, 8, 8, 9, 10);
		
		List<Integer> uniqueList = new ArrayList<>();
		
		for(Integer integer: list) {
			if(!uniqueList.contains(integer))
				uniqueList.add(integer);
		}
		
		System.out.println(uniqueList);
		
		// declarative
		uniqueList = uniqueList.stream().distinct().collect(Collectors.toList());
		
		System.out.println(uniqueList);
		
		List<String> names = Arrays.asList("Joe", "Remie", "Tessa", "Bob", "Joost");
		
		List<String> myNames = names.stream().filter(name -> name.startsWith("Remie")).collect(Collectors.toList());
		System.out.println(myNames);
		
		boolean exist = names.stream().anyMatch(name -> name.startsWith("Remie"));
		
		System.out.println("Remie: " + exist);
		
		boolean existAll = names.stream().allMatch(name -> name.startsWith("R"));
		
		System.out.println("r: " + existAll);
	
	}

}

