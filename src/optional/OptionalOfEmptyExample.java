package optional;

import java.util.Optional;

public class OptionalOfEmptyExample {

	public static void main(String[] args) {
		
		System.out.println("ofNullable: " + ofNullable().isPresent());
		System.out.println("of: " + of());
		System.out.println("empty: " + empty());



	}
	
	/**
	 * Use this when you are certain that it contains a value.
	 * @return
	 */
	public static Optional<String> ofNullable(){
		Optional<String> stringOptional = Optional.of("Hello");
		return stringOptional;
				
	};

	/**
	 * Use this when you are not certain that it contains a value.
	 * @return
	 */
	public static Optional<String> empty(){
		Optional<String> stringOptional = Optional.ofNullable("Hello");
		return stringOptional;
	}
	
	public static Optional<String> of(){
		return Optional.empty();
	}

}
