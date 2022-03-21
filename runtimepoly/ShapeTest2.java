package runtimepoly;

class Shape {
	void draw() {
		System.out.println("drawing...");
	}
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("drawing rectangle...");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("drawing circle...");
	}
}

class Triangle extends Shape {
	void draw() {
		System.out.println("drawing triangle...");
	}
}

class Square extends Shape {
	void draw() {
		System.out.println("drawing square...");
	}
}

class Cube extends Shape {
	// no methods here
}

class ShapeTest2 {
	public static void main(String args[]) {
		Shape s;
		s = new Rectangle();
		s.draw();
		s = new Circle();
		s.draw();
		s = new Triangle();
		s.draw();
		s = new Square();
		s.draw();
		s = new Cube();
		s.draw();//Shape class draw() method is invoked
	}
}
