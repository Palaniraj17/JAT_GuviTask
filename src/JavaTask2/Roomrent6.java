package JavaTask2;

import java.util.Scanner;

public class Roomrent6 {

	@SuppressWarnings({ "resource" }) // adding this to remove warning
	public static void main(String[] args) {
		int stayeddays;
		int month;
		float roomrent;
		float seasonrate;
		float newrate;
		float total;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month number : ");
		month = sc.nextInt();

		switch (month) {
		case 1:
			System.out.println("Enter the stayeddays number : ");
			stayeddays = sc.nextInt();
			System.out.println("Enter the room rent per day : ");
			roomrent = sc.nextInt();
			System.out.println("The room tariff value is " + stayeddays * roomrent);
			break;
		case 2:
			System.out.println("Enter the stayeddays number : ");
			stayeddays = sc.nextInt();
			System.out.println("Enter the room rent per day : ");
			roomrent = sc.nextInt();
			System.out.println("The room tariff value is " + stayeddays * roomrent);
			break;
		case 3:
			System.out.println("Enter the stayeddays number : ");
			stayeddays = sc.nextInt();
			System.out.println("Enter the room rent per day : ");
			roomrent = sc.nextInt();
			System.out.println("The room tariff value is " + stayeddays * roomrent);
			break;
		case 4:
			System.out.println("Enter the stayeddays number : ");
			stayeddays = sc.nextInt();
			System.out.println("Enter the room rent per day : ");
			roomrent = sc.nextInt();
			seasonrate = stayeddays * roomrent;
			total = seasonrate * 20 / 100;
			newrate = seasonrate + total;
			System.out.println("The room tariff value is " + newrate);
			break;
		case 5:
			System.out.println("Enter the stayeddays number : ");
			stayeddays = sc.nextInt();
			System.out.println("Enter the room rent per day : ");
			roomrent = sc.nextInt();
			seasonrate = stayeddays * roomrent;
			total = seasonrate * 20 / 100;
			newrate = seasonrate + total;
			System.out.println("The room tariff value is " + newrate);
			break;
		case 6:
			System.out.println("Enter the stayeddays number : ");
			stayeddays = sc.nextInt();
			System.out.println("Enter the room rent per day : ");
			roomrent = sc.nextInt();
			seasonrate = stayeddays * roomrent;
			total = seasonrate * 20 / 100;
			newrate = seasonrate + total;
			System.out.println("The room tariff value is " + newrate);
			break;
		case 7:
			System.out.println("Enter the stayeddays number : ");
			stayeddays = sc.nextInt();
			System.out.println("Enter the room rent per day : ");
			roomrent = sc.nextInt();
			System.out.println("The room tariff value is " + stayeddays * roomrent);
			break;
		case 8:
			System.out.println("Enter the stayeddays number : ");
			stayeddays = sc.nextInt();
			System.out.println("Enter the room rent per day : ");
			roomrent = sc.nextInt();
			System.out.println("The room tariff value is " + stayeddays * roomrent);
			break;
		case 9:
			System.out.println("Enter the stayeddays number : ");
			stayeddays = sc.nextInt();
			System.out.println("Enter the room rent per day : ");
			roomrent = sc.nextInt();
			System.out.println("The room tariff value is " + stayeddays * roomrent);
			break;
		case 10:
			System.out.println("Enter the stayeddays number : ");
			stayeddays = sc.nextInt();
			System.out.println("Enter the room rent per day : ");
			roomrent = sc.nextInt();
			System.out.println("The room tariff value is " + stayeddays * roomrent);
			break;
		case 11:
			System.out.println("Enter the stayeddays number : ");
			stayeddays = sc.nextInt();
			System.out.println("Enter the room rent per day : ");
			roomrent = sc.nextInt();
			seasonrate = stayeddays * roomrent;
			total = seasonrate * 20 / 100;
			newrate = seasonrate + total;
			System.out.println("The room tariff value is " + newrate);
			break;
		case 12:
			System.out.println("Enter the stayeddays number : ");
			stayeddays = sc.nextInt();
			System.out.println("Enter the room rent per day : ");
			roomrent = sc.nextInt();
			seasonrate = stayeddays * roomrent;
			total = seasonrate * 20 / 100;
			newrate = seasonrate + total;
			System.out.println("The room tariff value is " + newrate);
			break;
		}
		if (month >= 1 && month <= 12) {
		}
		else
		{
			System.out.println("Please enter valid month number");
		}
	}
	}
