package JavaAdditionalClass1;

import java.util.Scanner;

public class FrequencyofCharacters18 {

	@SuppressWarnings({ "resource" }) // adding this to remove warning
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text value : ");
		String input = sc.nextLine();
		int a = 256;// Assuming ASCII characters
		int[] frequency = new int[a];
		for (int i = 0; i < input.length(); i++) {

			frequency[input.charAt(i)]++;
		}
		for (int i = 0; i < a; i++) {
			if (frequency[i] > 0) {
				System.out.println((char) i + ": " + frequency[i]);
			}
		}
	}
}
