package streams;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

import java.util.List;
import java.util.Set;

import functionalinterfaces.data.Student;
import functionalinterfaces.data.StudentDataBase;

public class StreamsMapExample {

	public static List<String> namesList(){
		return StudentDataBase.getAllStudents()
		.stream()
		.map(Student::getName)
		.map(String::toUpperCase)
		.collect(toList());
		
	}
	
	public static Set<String> namesSet(){
		return StudentDataBase.getAllStudents()
		.stream()
		.map(Student::getName)
		.map(String::toUpperCase)
		.collect(toSet());
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(namesList());
		System.out.println(namesSet());


	}

}
