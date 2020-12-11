package eddu.smg;

public class Rectangle extends geometricObject{
private double a,b ;

Rectangle(){
	setA(1);
	setB(1);
	}
Rectangle(double a, double b){
	setA(a);
	setB(b);
}
public double getA() {
	return a;
}

public void setA(double a) {
	this.a = a;
}

public double getB() {
	return b;
}

public void setB(double b) {
	this.b = b;
}
@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return a*b;
	}
@Override
	public void howToColor() {
		// TODO Auto-generated method stub
		
	}
@Override
	public boolean isColored() {
		// TODO Auto-generated method stub
		return false;
	}
public void print() {
	System.out.println("Rectangle with x = " + a + ", y = " + b + " and area = " + this.getArea());
}
}
