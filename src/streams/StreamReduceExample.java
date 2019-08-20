package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import functionalinterfaces.data.Student;
import functionalinterfaces.data.StudentDataBase;

public class StreamReduceExample {

	public static int performMultiplication(List<Integer> integerList) {
		return integerList.stream()
		.reduce(1, (a, b) -> a * b);
	}
	
	public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList) {
		return integerList.stream()
		.reduce((a, b) -> a * b);
	}
	
	public static Optional<Student> getTheHighestGpaStudent(){
		return StudentDataBase.getAllStudents().stream()
		.reduce((studentFirst, studentTwo) -> (studentFirst.getGpa()> studentTwo.getGpa() ? studentFirst : studentTwo));
	}
	
	
	public static void main(String[] args) {
	
		List<Integer> integers = Arrays.asList(1, 3, 5,7);
		System.out.println(performMultiplication(integers));
		
		Optional<Integer> numbers  =performMultiplicationWithoutIdentity(integers);
		if(numbers.isPresent())
			System.out.println(numbers.get());
		
		Optional<Student> studentOptional = getTheHighestGpaStudent();
		if(studentOptional.isPresent())
			System.out.println(studentOptional.get());

	}

}
