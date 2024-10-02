package JavaAdditionalClass1;

import java.util.Scanner;

public class CountVowels5 {

	@SuppressWarnings({ "resource" }) // adding this to remove warning
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your word :");
		String firstword = sc.nextLine();
		firstword =firstword.toLowerCase();
		int count = 0;

		for (int i = 0; i <= firstword.length() - 1; i++) {
			char temp = firstword.charAt(i);
			if (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u') {
				count++;
			}
		}
		System.out.println("The number of vowels in the given word is " + count);
	}
}