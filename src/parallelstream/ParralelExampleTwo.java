package parallelstream;

import functionalinterfaces.data.Student;
import functionalinterfaces.data.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class ParralelExampleTwo {

    public static List<String> printStudentActivities(){
        long startTime = System.currentTimeMillis();
        List<String> activities = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(toList());
        long endTime = System.currentTimeMillis();
        System.out.println("Time it took: " + (endTime - startTime));
        return activities;
    }
    public static List<String> second(){
        long startTime = System.currentTimeMillis();

        List<String> activities = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(toList());

        long endTime = System.currentTimeMillis();
        System.out.println("Time it took: " + (endTime - startTime));

        return activities;
    }

    public static void main(String[] args) {
        printStudentActivities();
        second();
    }
}
