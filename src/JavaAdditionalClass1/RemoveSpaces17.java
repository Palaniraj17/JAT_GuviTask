package JavaAdditionalClass1;

import java.util.Scanner;

public class RemoveSpaces17 {

	@SuppressWarnings("resource") // adding this to remove warning
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence with space: ");
		String str = sc.nextLine();
		char[] charArray = str.toCharArray();
		int index = 0;
		for (char c : charArray) {
			if (Character.isWhitespace(c)) {
				continue;
			}
			charArray[index] = c;
			index++;
		}
		System.out.println("Entered sentenance without whitespace: " + new String(charArray, 0, index));
	}
}