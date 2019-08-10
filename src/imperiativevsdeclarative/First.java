package imperiativevsdeclarative;

import java.util.stream.IntStream;

public class First {

	public static void main(String[] args) {
		
		// imperative
		int sum = 0;
		for(int index = 0; index <= 100; index++) {
			sum += index;
		}
		
		System.out.println(sum);
		
		// declarative
		
		int sumtwo = IntStream.rangeClosed(0, 100).sum();
		
		System.out.println(sumtwo);
		
		;
	}

}

