package streams;

import java.util.Optional;

import functionalinterfaces.data.Student;
import functionalinterfaces.data.StudentDataBase;

public class StreamsFindAnyFirstExample {

	public static Optional<Student> findAnyStudent(){
		return StudentDataBase.getAllStudents().stream()
		.filter(student-> student.getGpa() >= 3.9)
		.findAny();
	}
	
	public static Optional<Student> findFirst(){
		return StudentDataBase.getAllStudents().stream()
		.filter(student-> student.getGpa() >= 3.9)
		.findFirst();
	}
	
	public static void main(String[] args) {
		Optional<Student> studentOptional = findFirst();
		if(studentOptional.isPresent())
			System.out.println(studentOptional.get());
		
	}

}
