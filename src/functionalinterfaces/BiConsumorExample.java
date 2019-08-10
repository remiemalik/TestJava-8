package functionalinterfaces;

import java.util.List;
import java.util.function.BiConsumer;

import functionalinterfaces.data.Student;
import functionalinterfaces.data.StudentDataBase;

public class BiConsumorExample {
	
	public static void nameAndActivitities() {
		
		BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println(name + " : " + activities);
		List<Student> studentList = StudentDataBase.getAllStudents();
		
		studentList.forEach((student-> biConsumer.accept(student.getName(), student.getActivities())));
	}


	public static void main(String[] args) {
		
		
		BiConsumer<String, String> biConsumor = (a, b)->{
			System.out.println("a: " + ", " + "b: " + b);
		};

		biConsumor.accept("Java 7", "Java 8");
		
		
		BiConsumer<Integer, Integer> multiply = (a,b) ->{
			System.out.println("Multiplication is:" + (a + b));
		};
		
		BiConsumer<Integer, Integer> division = (a,b) ->{
			System.out.println("Division is:" + (a / b));
		};

		multiply.andThen(division).accept(10, 5);
		
		nameAndActivitities();
		
		
	}
	
	
}
