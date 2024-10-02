package JavaAdditionalClass1;

import java.util.Scanner;

public class ReverseString2 {

	@SuppressWarnings("resource") // adding this to remove warning
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text: ");
		String str = sc.nextLine();
		String reversedStr = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reversedStr += str.charAt(i);
		}

		System.out.println("The entered text in reverse order: " + reversedStr);
	}
}