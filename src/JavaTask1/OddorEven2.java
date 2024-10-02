package JavaTask1;

import java.util.Scanner;

public class OddorEven2 {

	@SuppressWarnings("resource")// adding this to remove warning
	public static void main(String[] args) {

		int a;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value :");
		a = sc.nextInt();

		if (a % 2 == 0) {
			System.out.println("Entered number is even");
		} else {
			System.out.println("Entered number is odd");
		}
	}

}
