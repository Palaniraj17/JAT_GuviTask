package JavaTask3;

import java.util.Scanner;

public class Account {

	private int creditpr;
	private int debitpr;
	private int checkpr;

	public Account(int credit, int debit, int check) {

		this.creditpr = credit;
		this.debitpr = debit;
		this.checkpr = check;
	}

	public Account() {

		creditpr = 500;// Hardcoding the value
		debitpr = 1000;
		checkpr = 2000;
	}

	public void balcheck() {

		System.out.println("The current balance of the account is " + checkpr);

	}

	public void balcheck(int check) {
		System.out.println("The current balance of the account is " + check);
	}

	public void baldebit(int debit) {
		checkpr = checkpr - debit;
		System.out.println("After the money debited , the account balance is " + checkpr);
	}

	public void baldebit() {
		checkpr = checkpr - debitpr;
		System.out.println("After the money debited , the account balance is " + checkpr);
	}

	public void balcredit() {
		checkpr = checkpr + creditpr;
		System.out.println("After the money credited , the account balance is " + checkpr);
	}

	public void balcredit(int credit) {
		checkpr = checkpr + credit;
		System.out.println("After the money credited , the account balance is " + checkpr);
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Account obj = new Account();
		obj.balcheck();
		obj.balcredit();
		obj.baldebit();

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the amount to be credited :");
		int balcredit1 = sc.nextInt();
		obj.balcredit(balcredit1);

		System.out.print("Enter the amount to be debited :");
		int baldebit1 = sc.nextInt();
		obj.baldebit(baldebit1);

		System.out.print("Enter the current balance to update in the account :");
		int balcheck1 = sc.nextInt();
		obj.balcheck(balcheck1);
	}
}