package functionalinterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import functionalinterfaces.data.Student;
import functionalinterfaces.data.StudentDataBase;

public class BiFunctionExample {

	static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction =  (students, studentPredicate) ->{
		Map<String, Double> studentGradeMap = new HashMap<String, Double> ();
		students.forEach(student -> {
			if(studentPredicate.test(student))
				studentGradeMap.put(student.getName(), student.getGpa());
		});
		return studentGradeMap;
	};
	
	public static void main(String[] args) {
		System.out.println(biFunction.apply(StudentDataBase.getAllStudents(), PredicateStudentExample.p1));
		
		

	}

}
