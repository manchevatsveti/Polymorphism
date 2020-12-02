package eddu.smg;

public class TestSquare {
	public static void main(String[] args) {
geometricObject[] arr =new geometricObject[5];
arr[0]=new Square();
arr[1]= new Square(2,true);
arr[2]= new Square(3,false);
arr[3]=new Square(4,true);
arr[4]= new Square(5,false);

for(int i=0; i<arr.length;i++) {
	System.out.print(arr[i].getArea()+" ");
	if(arr[i].isColored()) {
	arr[i].howToColor();
	}
	else {
	System.out.println(" ");}
}
}
}

