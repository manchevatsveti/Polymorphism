package eddu.smg;

public class TestCloning 
{
 
    public static void main(String[] args) throws CloneNotSupportedException
    {
    	String[] arr = new String[] {"Sam", "Joe", "Peter","Stella"};
    	CloneableCourse course1 = new CloneableCourse("Math", arr, 4);
    	CloneableCourse course2 = new CloneableCourse("Math", arr, 4);
 
    	CloneableCourse cloned = (CloneableCourse) course1.clone();
 
        System.out.println(cloned.getCourseName());
 
        System.out.println(course1 == cloned);
 
        System.out.println(course2.getNumberOfStudents() == cloned.getNumberOfStudents());
 
    }
}
