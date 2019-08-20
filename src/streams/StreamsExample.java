package streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import functionalinterfaces.data.Student;
import functionalinterfaces.data.StudentDataBase;

public class StreamsExample {

	public static void main(String[] args) {
		
		Predicate<Student> studentPredicate = (student -> student.getGradeLevel() >= 3);
		Predicate<Student> studentGpaPredicate = (student -> student.getGpa() >= 3);
		
		Map<String,List<String>> studentMap = StudentDataBase.getAllStudents().stream()
           .filter(studentPredicate)
           .peek((student-> {
				System.out.println("After first filter:" + student);
			}))
           .filter(studentPredicate)
           .peek((student-> {
				System.out.println("After second filter:" + student);
			}))
           .collect(Collectors.toMap(Student::getName ,Student::getActivities ));
		
		
		System.out.println(studentMap);
	}

}
