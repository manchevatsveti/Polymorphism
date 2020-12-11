package eddu.smg;

import java.util.ArrayList;

public class TestCourse {
	public static void main(String[] args) {
		
		ArrayList <String> students = new ArrayList <String>();
		students.add("Peter Jones");
		students.add("Kim Smith");
		students.add("Anne Kennedy");
		
		ArrayList <String> students2 = new ArrayList <String>();
		students2.add("Peter Jones");
		students2.add("Steve Smith");
		
		Course course1 = new Course("Math",students);
		Course course2 = new Course("IT",students2);
		
		course1.print();
		course2.print();
		
		course1.dropStudent("Kim Smith");
		course2.addStudent("Bella Will");
		
		course1.print();
		course2.print();
	}
}
