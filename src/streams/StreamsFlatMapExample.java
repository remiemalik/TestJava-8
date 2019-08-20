package streams;

import static java.util.stream.Collectors.toList;

import java.util.List;

import functionalinterfaces.data.Student;
import functionalinterfaces.data.StudentDataBase;

public class StreamsFlatMapExample {
	
	
	public static List<String> printStudentActivities(){
		
		List<String> activities = StudentDataBase.getAllStudents().stream()
		.map(Student::getActivities)
		.flatMap(List::stream)
		.distinct()
		.sorted()
		.collect(toList());
		
		return activities;
		
	}
	
public static long printStudentActivitiesCount(){
		
		long numberOfStudentActivities = StudentDataBase.getAllStudents().stream()
		.map(Student::getActivities)
		.flatMap(List::stream)
		.distinct()
		.count();
		
		return numberOfStudentActivities;
		
	}

	public static void main(String[] args) {
		
		System.out.println(printStudentActivities());
		System.out.println(printStudentActivitiesCount());
	}

}
