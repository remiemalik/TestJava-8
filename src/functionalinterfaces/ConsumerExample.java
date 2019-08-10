package functionalinterfaces;

import java.util.List;
import java.util.function.Consumer;

import functionalinterfaces.data.Student;
import functionalinterfaces.data.StudentDataBase;

public class ConsumerExample {
	
	static Consumer<Student> c2 = (student) -> System.out.println(student);
	static Consumer<Student> c3 = (student) -> {
		System.out.println(student.getName());
	};
	static Consumer<Student> c4 = (student) -> {
		System.out.println(student.getActivities());
	};
	static List<Student> studentList = StudentDataBase.getAllStudents();


	public static void main(String[] args) {
		Consumer<String> output = (s) -> System.out.println(s.toUpperCase()); 
		output.accept("Remie");
				
//		printName();
//		printNameAndActivities();
		printNameAndActivitiesWithGrades();
	}
	
	public static void printName() {
		studentList.forEach(c2);
	}
	
	public static void printNameAndActivities() {
		// consumer chaining
		studentList.forEach(c3.andThen(c4));
	}
	
	public static void printNameAndActivitiesWithGrades() {
		// consumer chaining
		studentList.forEach((student -> {
			if(student.getGradeLevel() >= 3 && student.getGpa() >= 3.9)
				c3.andThen(c4).accept(student);;
		}
		));
	}

}
