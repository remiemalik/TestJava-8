package defaults;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import functionalinterfaces.data.Student;
import functionalinterfaces.data.StudentDataBase;

public class DefaultMethodsExampleTwo {

	static Consumer<Student> studentConsumer = (student) -> System.out.println(student);
	static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
	static Comparator<Student> gradeComparator = Comparator.comparing(Student::getGradeLevel);


	public static void sortByName(List<Student> studentList) {
		Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
		studentList.sort(nameComparator);
	}
	
	public static void sortByGPA(List<Student> studentList) {
		Comparator<Student> nameComparator = Comparator.comparingDouble(Student::getGpa);
		studentList.sort(nameComparator);
	}
	
	public static void comparatorChaining(List<Student> studentList) {
		studentList.sort(gradeComparator.thenComparing(nameComparator));
	}
	
	public static void sortNullValues(List<Student> studentList) {
		
		Comparator<Student> studentComparator = Comparator.nullsLast(nameComparator);
		studentList.sort(studentComparator);
	}
	

	public static void main(String[] args) {
		
		List<Student> studentList = StudentDataBase.getAllStudents();
		sortNullValues(studentList);
		studentList.forEach(studentConsumer);
		
	}
	

}
