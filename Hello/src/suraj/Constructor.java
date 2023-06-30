package suraj;

import java.awt.geom.Area;

public class Constructor {

	public Constructor(int a, String name) {

		System.out.println(a + name);
	}

	public Constructor() {
		System.out.println("Hello");
	}

	public static double area(double side) {
		return side * side;
	}

	
	// method overriding
	static class First {
		public void run() {
			System.out.println("First");
		}
	}

	static class Second extends First {
		public void run() {
			System.out.println("Second");
		}
	}

	public static void main(String[] args) {

			Constructor constructor = new Constructor(10, "Suraj"); 
			Constructor constructor2 = new Constructor();
		  
		 
		First aFirst = new Second();
		aFirst.run();
	}
}
