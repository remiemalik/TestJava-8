package streams;

import static java.util.stream.Collectors.toList;

import java.util.Comparator;
import java.util.List;

import functionalinterfaces.data.Student;
import functionalinterfaces.data.StudentDataBase;


public class StreamsComparatorExample {

	public static List<Student> sortStudentByName(){
		
		return StudentDataBase.getAllStudents()
		.stream()
		.sorted(Comparator.comparing(Student::getName))
		.collect(toList());
	}
	
	public static List<Student> sortStudentByGpa(){
			return StudentDataBase.getAllStudents()
			.stream()
			.sorted(Comparator.comparing(Student::getGpa).reversed())
			.collect(toList());
		}
	
	public static List<Student> sortStudentByGpaDescending(){
		
		return StudentDataBase.getAllStudents()
		.stream()
		.sorted(Comparator.comparing(Student::getGpa))
		.collect(toList());
	}
	
	public static void main(String[] args) {
	
		System.out.println("Sort by name:");
		sortStudentByName().forEach((student) -> System.out.println(student));
		System.out.println();
		
		System.out.println("Sort by gpa descending: ");
		sortStudentByGpa().forEach((student) -> System.out.println(student));
		System.out.println();
		
		System.out.println("Sort by gpa ascending: ");
		sortStudentByGpaDescending().forEach((student) -> System.out.println(student ));


	}

}
