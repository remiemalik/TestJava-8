package grouping;

import java.util.*;
import java.util.stream.Stream;

import functionalinterfaces.data.Student;
import functionalinterfaces.data.StudentDataBase;

import static grouping.StreamsPartitioningExample.*;
import static java.util.stream.Collectors.*;

public class StreamsGroupingByExample {

	public static void getStudentsByGender() {
		Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents()
		.stream()
		.collect(groupingBy(Student::getGender));
		
		System.out.println(studentMap);
	}

	public static void customizedGroupingBy() {
		Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents()
				.stream()
				.collect(groupingBy(student -> student.getGpa() >= 3.8 ? "Outstanding" : "Average"));

		System.out.println(studentMap);
	}

	public static void twoLevelGroupingFirst() {
		Map<Integer, Map<String, List<Student>>> studentMap = StudentDataBase.getAllStudents()
				.stream()
				.collect(groupingBy(Student::getGradeLevel,
						groupingBy(student -> student.getGpa()>= 3.8 ? "Outstanding" : "Average")));

		System.out.println(studentMap);
	}

	public static void twoLevelGroupingSecond() {
		Map<Integer, Integer> studentMap = StudentDataBase.getAllStudents()
				.stream()
				.collect(groupingBy(Student::getGradeLevel,
						summingInt(Student::getNoteBooks)));

		System.out.println(studentMap);
	}

	public static void threeLevelGrouingExample(){
		LinkedHashMap<String,Set<Student>> studentMap = StudentDataBase.getAllStudents().stream()
				.collect(groupingBy(Student::getName,LinkedHashMap::new,
						toSet()));

		System.out.println(" studentMap : " + studentMap);
	}

	public static void calculateLeasttpGpa(){
		Map<Integer, Optional<Student>> studentMapOptional =  StudentDataBase.getAllStudents().stream()
				.collect(groupingBy(Student::getGradeLevel,maxBy(Comparator.comparingDouble(Student::getGpa))
				));

		Stream.of(studentMapOptional).forEach(System.out::println);


		Map<Integer, Student> studentMap =  StudentDataBase.getAllStudents().stream()
				.collect(groupingBy(Student::getGradeLevel,
						collectingAndThen(maxBy(Comparator.comparingDouble(Student::getGpa))
								,Optional::get
						)));

		Stream.of(studentMap).forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		calculateLeasttpGpa();

	}

}
