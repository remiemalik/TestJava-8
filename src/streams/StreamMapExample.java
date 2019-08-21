package streams;

import functionalinterfaces.data.Student;
import functionalinterfaces.data.StudentDataBase;

public class StreamMapExample {

	private static int numberOfNoteBooks() {
		Integer numberOfNoteBooks = StudentDataBase.getAllStudents().stream()
		.filter((student -> student.getGradeLevel() >= 3))
		.filter((student -> student.getGender().equals("female")))

		.map(Student::getNoteBooks)
		.reduce(0,  Integer::sum);
		return numberOfNoteBooks;
		
	}
	
	public static void main(String[] args) {

		System.out.println(numberOfNoteBooks());
	}

}
