package eddu.smg;
import java.util.ArrayList;
import java.util.Scanner;
public class Course {
	Scanner in = new Scanner(System.in);
	
private String courseName;
ArrayList <String> students = new ArrayList <String>();

Course(){
	this.courseName = "";
	students = null;
}

Course(String courseName,ArrayList<String> students ){
	this.courseName = courseName;
	this.students = students;
}

	
public String getCourseName() {
	return courseName;
}
public void addStudent(String student) {
students.add(student); 
}
public void dropStudent(String student) {
	students.remove(student);
}
public ArrayList<String> getStudents(){
	return students;	
}
public void print() {
	System.out.println(this.students.size() + " students in total in "+ this.getCourseName());
	
	System.out.println(this.getStudents());
	System.out.println("\n");
}
}
