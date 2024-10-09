package JavaTask4;

import java.util.Scanner;

@SuppressWarnings("serial") // adding this to remove warning
class InvalidAgeException extends Exception {
	public InvalidAgeException(String msg) {
		super(msg);
	}

}

public class CreateException {

	@SuppressWarnings("resource") // adding this to remove warning
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter your age");
			int age = sc.nextInt();
			if (age < 18) {
				throw new InvalidAgeException("Age must be 18 or older.");
			}
			System.out.println("You are " + age + " years old.");
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
	}
}
