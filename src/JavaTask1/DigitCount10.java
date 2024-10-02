package JavaTask1;

import java.util.Scanner;

public class DigitCount10 {

	@SuppressWarnings("resource") // adding this to remove warning
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to find digits: ");
		int digitcount = sc.nextInt();
		int count = 0;
		for (int i = 0; i <= digitcount; i++) {
			if (digitcount % 10 >= 0 ) {
				count++;
			}
			digitcount = digitcount / 10;
			if (digitcount == 1) {
				count++;
			}
		}
		System.out.println("The number of digits of entered number is "+count);
	}

}
