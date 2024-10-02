package JavaTask1;

import java.util.Scanner;

public class StrLength7 {

	@SuppressWarnings("resource") // adding this to remove warning
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the text message :");
		String msg = sc.nextLine();
		System.out.println(msg.length());
	}
}