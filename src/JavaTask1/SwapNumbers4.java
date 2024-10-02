package JavaTask1;

import java.util.Scanner;

public class SwapNumbers4 {
	@SuppressWarnings("resource") // adding this to remove warning
	public static void main(String[] args) {

		int number1, number2, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		number1 = sc.nextInt();
		System.out.println("Enter the second number");
		number2 = sc.nextInt();
		temp = number1;
		number1 = number2;
		number2 = temp;
		System.out.println("After swapped the first number is " + number1);
		System.out.println("After swapped the second number is " + number2);
	}
}
