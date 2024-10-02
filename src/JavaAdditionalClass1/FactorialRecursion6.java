package JavaAdditionalClass1;

import java.util.Scanner;

public class FactorialRecursion6 {

	static int factorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}

	@SuppressWarnings({ "resource" }) // adding this to remove warning
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find recursion factorial : ");
		int number = sc.nextInt();
		System.out.println("The factorial of " + number + " is " + factorial(number));
	}
}