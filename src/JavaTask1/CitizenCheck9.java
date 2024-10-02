package JavaTask1;

import java.util.Scanner;

public class CitizenCheck9 {

	@SuppressWarnings("resource") // adding this to remove warning
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age :");
		int age = sc.nextInt();
		if (age >= 65) {
			System.out.println("You are senior citizen");
		} else if (age > 18 && age < 65) {
			System.out.println("You are not senior citizen but you are eligible to vote");
		} else {
			System.out.println("You are not senior citizen and not eligible to vote");
		}
	}
}
