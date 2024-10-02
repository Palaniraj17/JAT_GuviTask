package JavaAdditionalClass1;

import java.util.Scanner;

public class SumofDigits9 {

	@SuppressWarnings("resource") // adding this to remove warning
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		int sum = 0;
		while (number != 0) {
			sum += number % 10;
			number /= 10;
		}
		System.out.println("Sum of entered number digits: " + sum);
	}
}