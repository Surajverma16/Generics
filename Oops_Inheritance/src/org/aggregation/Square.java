package org.aggregation;

class Circle {

	int area(int side) {
		return side * side;
	}
}

public class Square {
	private double pi = 3.14;

	double area(int radius) {
		Circle circle = new Circle();
		return pi * circle.area(radius);
	}

	public static void main(String[] args) {

		Square square = new Square();
		System.out.println(square.area(5));
	}

}
