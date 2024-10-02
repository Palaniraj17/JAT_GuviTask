package JavaAdditionalClass1;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram10 {
	@SuppressWarnings("resource") // adding this to remove warning
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your first word :");
		String firstword = sc.nextLine();
		System.out.println("Enter your second word :");
		String secondword = sc.nextLine();
		firstword = firstword.toLowerCase();
		secondword=secondword.toLowerCase();
		char fword[] = firstword.toCharArray();
		char sword[] = secondword.toCharArray();
		Arrays.sort(fword);
		Arrays.sort(sword);
		if (Arrays.equals(fword, sword)) {
			System.out.println("Both are Anagram to each other");
		} else {
			System.out.println("Both are not Anagram to each other");
		}
	}
}