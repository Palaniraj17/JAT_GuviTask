package JavaAdditionalClass1;

import java.util.Scanner;

public class PrimeNumber7 {

	@SuppressWarnings("resource") // adding this to remove warning
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find prime or not: ");
		int primenumber = sc.nextInt();
		int count = 0;

		if (primenumber > 1) {
			for (int i = 1; i <= primenumber; i++) {
				if (primenumber % i == 0)
					count++;
			}
			if (count == 2) {
				System.out.println("Entered number " + primenumber + " is Prime Number");
			} else {
				System.out.println("Entered number " + primenumber + " is not Prime Number");
			}
		} else {
			System.out.println("Entered number " + primenumber + " is not Prime Number");
		}
	}
}