package JavaTask1;

import java.util.Scanner;

public class Factorial6 {

	@SuppressWarnings("resource") // adding this to remove warning
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to find factorial: ");
		long findfactorial = sc.nextInt();

		int factorial = 1;
		for (int i = 1; i <= findfactorial; i++) {

			factorial = factorial * i;
		}
		System.out.println("The factorial of entered number is " + factorial);
	}
}
