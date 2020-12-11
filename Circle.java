package eddu.smg;

public class Circle extends geometricObject {
	private double r;
	private boolean isColored=false;
	
	Circle(double r){
		setR(r);
	}
	
	
public void setColored(boolean isColored) {
		this.isColored = isColored;
	}
public boolean getColored(boolean isColored) {
	return isColored;
}
public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}

public double getArea() {
	return getR()*getR()*Math.PI;
}
@Override
public boolean isColored() {
	return isColored;
}
@Override
public void howToColor() {
	
}
public void print(){
	System.out.println("Circle with radius = " + r + " and area = " + this.getArea());
}
}
