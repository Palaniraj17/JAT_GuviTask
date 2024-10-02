package JavaTask1;

import java.util.Scanner;

public class GreaterSumvalue1 {
	@SuppressWarnings("resource") // adding this to remove warning
	public static void main(String[] args) {
		int a, b, c, d;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the A value :");
		a = sc.nextInt();
		System.out.print("Enter the B value :");
		b = sc.nextInt();
		System.out.print("Enter the C value :");
		c = sc.nextInt();
		System.out.print("Enter the D value :");
		d = sc.nextInt();

		if ((a + b) < (c + d)) {
			System.out.println("The sum of C,D is greater than the sum of A,B are equal");
		} else if ((a + b) > (c + d)) {
			System.out.println("The sum of A,B is greater than the sum of C,D are equal");
		} else {
			System.out.println("The sum of A,B and the sum of C,D are equal");
		}
	}
}
