package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMenMaxExample {

	public static int findMaxValue(List<Integer> integerList) {
		Integer maxValue = integerList.stream()
		.reduce(0, (x,y) ->  x > y ? x : y);
		return maxValue;
	}
	
	public static Optional<Integer> findMinValue(List<Integer> integerList) {
		Optional<Integer> maxValue = integerList.stream()
		.reduce( (x,y) ->  x < y ? x : y);
		return maxValue;
	}
	
	public static Optional<Integer> findMaxValueOptional(List<Integer> integerList) {
		Optional<Integer> maxValue = integerList.stream()
		.reduce((x,y) ->  x > y ? x : y);
		return maxValue;
	}
	
	public static void main(String[] args) {
		List<Integer> integersList = Arrays.asList(6, 7, 8, 9, 10);
//		System.out.println(findMaxValue(integersList));
//		
//		integersList = new ArrayList<Integer>();
//		Optional<Integer> maxValueOptional = findMaxValueOptional(integersList);
//		if(maxValueOptional.isPresent())
//			System.out.println(maxValueOptional.get());
//		else 
//			System.out.println("none found");
		
		Optional<Integer> minValue= findMinValue(integersList);
		if(minValue.isPresent())
			System.out.println("min value is:" + minValue.get());
		else System.out.println("No input");
	}

}
