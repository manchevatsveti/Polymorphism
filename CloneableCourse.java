package eddu.smg;
import java.util.Scanner;
public class CloneableCourse implements Cloneable {
	Scanner in = new Scanner(System.in);
	
private String courseName;
private String[] students = new String[100];
private int numberOfStudents=0;

	CloneableCourse(){
	this.courseName = "";
	students = null;
	numberOfStudents = 0;
}

	CloneableCourse(String courseName,String students[],int numberOfStudents ){
	this.courseName = courseName;
	this.students = students;
	this.numberOfStudents = numberOfStudents;
}

	@Override
	public Object clone () throws CloneNotSupportedException{
		return super.clone();
	}
	
public String getCourseName() {
	return courseName;
}
public void addStudent(String student) {
students[numberOfStudents] = student; 
numberOfStudents++; 
}
public void dropStudent(String student) {
	int drop=-1;
	for(int i=0;i<students.length;i++) {
		if(students[i].equalsIgnoreCase(student)) {
			drop =i;
			break;
		}
	}
	if(drop!=-1) {
for(int i=drop;i<numberOfStudents-1;i++) {
	students[i]=students[i+1];
}
students[numberOfStudents-1]=null;
numberOfStudents--;
}
}
public String[] getStudents(){
	return students;	
}
public int getNumberOfStudents() {
	return numberOfStudents;
}
public void print() {
	System.out.println(this.getNumberOfStudents() + " students in total in "+ this.getCourseName());
	
	for(int i = 0; i < this.getNumberOfStudents(); i++) {
		System.out.println("students [" + i + "] is " + this.getStudents()[i]);
	}
}
}
	

