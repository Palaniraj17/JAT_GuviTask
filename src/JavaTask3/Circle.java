package JavaTask3;

import java.util.Scanner;

public class Circle {

	private float radiuspr;

	public Circle(float radius) {

		this.radiuspr = radius;
	}

	public Circle() {
		return;
	}

	public void Circum() {
		double circum = 6.28 * radiuspr;// Circumference= 2*pi*radius --> 2*pi = 6.285714285714285714
		System.out.println("The circumference of the circle is(Non parameter) " + circum);
	}

	public void Circum(float radiuspr) {
		double circum = 6.28 * radiuspr; // Circumference= 2*pi*radius --> 2*pi = 6.285714285714285714
		System.out.println("The circumference of the circle is(Parameter) " + circum);
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Circle obj = new Circle(7);
		obj.Circum();// Used non parameterized constructor
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the raidus of the circle :");
		float radius1 = sc.nextFloat();
		obj.Circum(radius1);// Used parameterized constructor
	}
}
