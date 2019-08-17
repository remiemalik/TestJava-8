package optional;

import java.util.Optional;

import functionalinterfaces.data.Student;

public class OptionalOrElseExample {

	public static void main(String[] args) {
		System.out.println("Optional or else: " + optionalOrElse());
		System.out.println("Optional or else get: " + optionalOrElseGet());
		System.out.println("Optional or else throws: " + optionalOrElseThrow());
		
	}
	
	public static String optionalOrElseThrow() {
//		Optional<Student> studentOptional = Optional.of(StudentDataBase.studentSupplier.get());
		
		Optional<Student> studentOptional = Optional.ofNullable(null);

		
		String name = studentOptional.map(Student::getName).orElseThrow(()-> new RuntimeException("bad data"));
		return name;
	}
	
	public static String optionalOrElseGet() {
//		Optional<Student> studentOptional = Optional.of(StudentDataBase.studentSupplier.get());
		
		Optional<Student> studentOptional = Optional.ofNullable(null);

		
		String name = studentOptional.map(Student::getName).orElseGet(() -> "Default");
		return name;
	}
	
	public static String optionalOrElse() {
//		Optional<Student> studentOptional = Optional.of(StudentDataBase.studentSupplier.get());
		
		Optional<Student> studentOptional = Optional.ofNullable(null);

		
		String name = studentOptional.map(Student::getName).orElse("Default");
		return name;
	}

}
