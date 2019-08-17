package functionalinterfaces;

import java.util.function.BooleanSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;


public class DataConsumerExamples {

	public static void main(String[] args) {
		int number = 100;
		BooleanSupplier isHundred = () -> number == 100;
		System.out.println("Number is hundred: "+ isHundred.getAsBoolean());
		
		IntSupplier intSupplier = () -> number * 100;
		System.out.println("10 times 100 is: " + intSupplier.getAsInt());
		
		Supplier<String> myName = () -> "Remie".toUpperCase();
		System.out.println("My name is: " + myName.get());

	}

}
