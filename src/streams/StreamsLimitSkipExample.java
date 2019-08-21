package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

	public static Optional<Integer> limit(List<Integer> integers){
		return integers.stream()
		.limit(2)
		.reduce((x, y) -> x + y);
	}
	
	public static Optional<Integer> skip(List<Integer> integers){
		return integers.stream()
		.skip(2)
		.reduce((x, y) -> x + y);
	}
	
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(6,7,8,9,10);
		Optional<Integer> limitResult = skip(integers);
		if(limitResult.isPresent())
			System.out.println(limitResult.get());
		else 
			System.out.println("no input");
	}

}
