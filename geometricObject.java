package eddu.smg;

public abstract class geometricObject implements Colorable, Comparable<geometricObject> {
 public abstract double getArea();
 public abstract boolean isColored();
 public abstract void print();
 

 public static geometricObject max(geometricObject a, geometricObject b) {
		if(a.compareTo(b) == 1 || a.compareTo(b) == 0) {
			return a;	
		}
		return b;
 }
 public int compareTo(geometricObject a) {
	 return(Double.compare(this.getArea(),a.getArea()));
}
 
}


