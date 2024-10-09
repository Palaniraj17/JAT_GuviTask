package JavaTask4;

import java.util.Scanner;

public class Dividebyzeroerror {

	@SuppressWarnings("resource") // adding this to remove warning
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int a = sc.nextInt();
		System.out.print("Enter the second number : ");
		int b = sc.nextInt();

		int c = 0;

		try {
			c = a / b;
			System.out.println("The answer is " + c);
		} catch (ArithmeticException e) {

			// actual exception
			e.printStackTrace();

			// customize exception message
			System.out.println("Divided by zero is not possible");
		}

	}

}
