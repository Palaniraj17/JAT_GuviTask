package JavaTask2;

import java.util.Scanner;

public class GradingSystem5 {

	  @SuppressWarnings("resource")
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter your mark: ");
	        int mark = sc.nextInt();
	        findgrade(mark);
	    }

	    public static void findgrade(int mark) {
	        if (mark <= 100 && mark >= 0) {
	            if (mark == 100) {
	                System.out.println("Grade for mark " + mark + " is S");
	            } else if (mark >= 90 && mark <= 99) {
	                System.out.println("Grade for mark " + mark + " is A");
	            } else if (mark >= 80 && mark <= 89) {
	                System.out.println("Grade for mark " + mark + " is B");
	            } else if (mark >= 70 && mark <= 79) {
	                System.out.println("Grade for mark " + mark + " is C");
	            } else if (mark >= 60 && mark <= 69) {
	                System.out.println("Grade for mark " + mark + " is D");
	            } else if (mark >= 50 && mark <= 59) {
	                System.out.println("Grade for mark " + mark + " is E");
	            } else {
	                System.out.println("Grade for mark " + mark + " is F");
	            }
	        } else {
	            System.out.println("Invalid Input");
	        }
	    }
}
