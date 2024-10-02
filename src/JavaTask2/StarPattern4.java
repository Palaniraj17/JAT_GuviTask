package JavaTask2;

import java.util.Scanner;

public class StarPattern4 {

	@SuppressWarnings({ "resource" }) // adding this to remove warning
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int number = sc.nextInt();

		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= number; j++) {
				if (j == i || j == number - i + 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
