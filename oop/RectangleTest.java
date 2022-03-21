package oop;

class Rectangle {
	int length;
	int width;
	
	//default constructor
	Rectangle(){
		length = 0;
		width = 0;
	}
	
	//method to intialize length and width
	public void getData(int l, int w) {
		length = l;
		width = w;
	}
	
	//method to calculate area of rectangle
	public void calculateArea() {
		System.out.println("Area of rectangle is "+length*width);
	}
}

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(), r2 = new Rectangle();
		//Rectangle r1 = new Rectangle(); //creating objects of Rectangle
		r1.calculateArea(); 
		
		//Rectangle r2 = new Rectangle();
		r2.getData(10, 5);
		r2.calculateArea();
	}
}