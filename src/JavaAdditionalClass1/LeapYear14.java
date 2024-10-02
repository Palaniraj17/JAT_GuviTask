package JavaAdditionalClass1;

import java.util.Scanner;

public class LeapYear14 {

	@SuppressWarnings({ "resource" }) // adding this to remove warning
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year to find leap or not : ");
		int year = sc.nextInt();

		if ((year % 400 == 0 || year % 4 == 0) && (year % 100 != 0)) {
			System.out.println("Entered year is leap year");
		} else {
			System.out.println("Entered year is not leap year");
		}
	}
}