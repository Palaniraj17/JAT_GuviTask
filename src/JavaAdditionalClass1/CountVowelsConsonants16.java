package JavaAdditionalClass1;

import java.util.Scanner;

public class CountVowelsConsonants16 {

	@SuppressWarnings({ "resource" }) // adding this to remove warning
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your word :");
		String firstword = sc.nextLine();
		firstword.toLowerCase();
		int countforvowels = 0;
		int countforconsonants = 0;

		for (int i = 0; i <= firstword.length() - 1; i++) {
			char temp = firstword.charAt(i);
			if (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u') {
				countforvowels++;

			} else {
				countforconsonants++;
			}
		}
		System.out.println("The number of vowels in the given word is " + countforvowels);
		System.out.println("The number of consonants in the given word is " + countforconsonants);
	}
}