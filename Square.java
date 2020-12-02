package eddu.smg;

public class Square extends geometricObject {
private double a=1;
private boolean isColored=false;
public Square() {
}
public Square(double a, boolean isColored) {
	setA(a);
	setColored(isColored);
}
public void howToColor() {
	System.out.println("Color all four sides.");
	
}
public double getA() {
	return a;
}
public void setA(double a) {
	this.a = a;
}
public boolean isColored() {
	return isColored;
}
public void setColored(boolean isColored) {
	this.isColored = isColored;
}
public double getArea() {
	return getA()*getA();
}
}
