package methodreference;

import java.util.function.Predicate;

import functionalinterfaces.data.Student;
import functionalinterfaces.data.StudentDataBase;

public class RefactorMethodReference {

	static Predicate<Student> p1 = RefactorMethodReference:: greaterThanGradeLevel;
	
	public static boolean greaterThanGradeLevel(Student student) {
		return student.getGpa() >= 3;
	}
	
	public static void main(String[] args) {
		System.out.println(p1.test(StudentDataBase.studentSupplierExample.get()));

	}

}
