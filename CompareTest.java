package eddu.smg;
import java.util.ArrayList;
import java.util.Collections;

public class CompareTest {
	public static void main(String[] args) {
		geometricObject c1 = new Circle(7);
		geometricObject c2 = new Circle(10);
		
		geometricObject r1 = new Rectangle(3,4);
		geometricObject r2 = new Rectangle(4,1);
		
		geometricObject r3 = new Rectangle(1,2);
		geometricObject r4 = new Rectangle(10,9);
		geometricObject r5 = new Rectangle(3,4);
		geometricObject r6 = new Rectangle(8,7);
		geometricObject r7 = new Rectangle(5,5);
		
	    ArrayList <geometricObject> arr = new ArrayList <geometricObject>();
		
		System.out.println(c1.compareTo(c2));
		geometricObject.max(c1,c2).print();
		
		System.out.println(r1.compareTo(r2));
		geometricObject.max(r1,r2).print();
		
		arr.add(r3);
		arr.add(r4);
		arr.add(r5);
		arr.add(r6);
		arr.add(r7);
		
		System.out.println("\nBefore sorting:");
		for(geometricObject i : arr) {
			i.print();
		}
		
		System.out.println("\nAfter");
		Collections.sort(arr);
		for(geometricObject i : arr) {
			i.print();
		}
		
	System.out.println();
	ArrayList <geometricObject> arr2 = new ArrayList <geometricObject>();
	
	arr2.add(new Circle(4));
	arr2.add(new Circle(6));
	arr2.add(new Rectangle(9,5));
	arr2.add(new Rectangle(12,3));

	
	for(geometricObject o : arr2) {
		o.print();
	}
	System.out.println("Total sum: " +sumArea(arr2));
	}
	public static double sumArea(ArrayList<geometricObject>a) {
		double sum = 0;
		for(geometricObject i : a) {
			sum += i.getArea();
		}
		return sum;
	}

}
