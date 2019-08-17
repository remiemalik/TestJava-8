package methodreference;

import java.util.function.Consumer;

import functionalinterfaces.data.Student;
import functionalinterfaces.data.StudentDataBase;

public class ConstumerMethodReferenceExample {

	static Consumer<Student> c1 = System.out::println;
	static Consumer<Student> c2 = Student::printListActivitites;

	public static void main(String[] args) {
		
		StudentDataBase.getAllStudents().forEach(c1);
		StudentDataBase.getAllStudents().forEach(c2);
	}

}
