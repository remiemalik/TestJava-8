package functionalinterfaces;

import java.util.List;
import java.util.function.Predicate;

import functionalinterfaces.data.Student;
import functionalinterfaces.data.StudentDataBase;

public class PredicateStudentExample {

	static Predicate<Student> p1 = (student) -> student.getGradeLevel() >= 3;
	static Predicate<Student> p2 = (student) -> student.getGpa() >= 3.9;

	
	public static void filterStudentsByGradeLevel() {
		System.out.println("filter students by grade level:");
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(student-> {
			if(p1.test(student))
				System.out.println(student);
		});
	}
	
	public static void filterStudentsByGpaLevel() {
		System.out.println("filter students by gpa level:");

		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(student-> {
			if(p2.test(student))
				System.out.println(student);
		});
	}
	
	public static void filterStudents() {
		System.out.println("filter students by both levels:");

		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(student-> {
			if(p1.or(p2).test(student))
				System.out.println(student);
		});
	}
	
	public static void main(String[] args) {
//		filterStudentsByGradeLevel();
//		filterStudentsByGpaLevel();
		filterStudents();
	}

}
