package optional;

import java.util.Arrays;
import java.util.Optional;

import functionalinterfaces.data.Student;
import functionalinterfaces.data.StudentDataBase;

public class OptionalExample {

	public static void main(String[] args) {
		String name = null;
//		if(name != null)
//			System.out.println("Length of the student name: " + name.length());
//		else
//			System.out.println("Name not found");
		
//		Optional<String> stringOptional = getStudentNameOptional();
		Optional<String> stringOptional = Optional.ofNullable(null);

		
		if(stringOptional.isPresent())
			System.out.println("Length of student Name: "+ stringOptional.get().length());
		else
			System.out.println("Name not found");

		test();
	}
	
	public static String getStudentName() {
		Student student = StudentDataBase.studentSupplier.get();
		
		if(student != null)
			return student.getName();
			
				
	 return null;
	}
	
	public static Optional<String> getStudentNameOptional() {
		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
				
		if(studentOptional.isPresent())
			return studentOptional.map(Student::getName);
	 return Optional.empty();
	}
	
	public static void test() {
		Optional<Student> studentOptional = Optional.ofNullable(new Student("Adam",2,3.6, "male",Arrays.asList("swimming", "basketball","volleyball")));
		if(studentOptional.isPresent())
			System.out.println(studentOptional.get().getName());
		
	}

}
