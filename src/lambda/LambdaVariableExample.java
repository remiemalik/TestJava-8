package lambda;

import java.util.function.Consumer;

public class LambdaVariableExample {

	public static void main(String[] args) {

		int i = 0;
		
		Consumer<Integer> c1= (number) ->{
			System.out.println("Value is :" + number);
			
		};
	}

}
