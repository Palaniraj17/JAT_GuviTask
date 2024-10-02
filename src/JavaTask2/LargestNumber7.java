package JavaTask2;

import java.util.Scanner;

public class LargestNumber7 {

	@SuppressWarnings({ "resource" }) // adding this to remove warning
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int firstinput = sc.nextInt();
		System.out.println("Enter second number : ");
		int secondinput = sc.nextInt();
		System.out.println("Enter third number : ");
		int thirdinput = sc.nextInt();
		
		if(firstinput>secondinput && firstinput>thirdinput) 
		{
			System.out.println("The first entered number is larger that other numbers");
		}
		else if(secondinput>thirdinput && secondinput>firstinput) 
		{
			System.out.println("The second entered number is larger that other numbers");
		}
		else if(thirdinput>firstinput && thirdinput>secondinput) 
		{
			System.out.println("The third entered number is larger that other numbers");
		}
		else if(firstinput==secondinput && firstinput!=thirdinput)
		{
			if(firstinput<thirdinput) {
				System.out.println("The third entered number is larger that other numbers");
			}
			else
				System.out.println("The first and second entered number is larger that other numbers");
		}
		else if(firstinput==thirdinput && firstinput!=secondinput)
		{
			if(firstinput<secondinput) {
				System.out.println("The second entered number is larger that other numbers");
			}
			else
				System.out.println("The first and third entered number is larger that other numbers");
		}
		else if(thirdinput==secondinput && thirdinput!=firstinput)
		{
			if(firstinput<thirdinput) {
				System.out.println("The first entered number is larger that other numbers");
			}
			else
				System.out.println("The third and second entered number is larger that other numbers");
		}
		else
			System.out.println("Please enter the valid three numbers to check");

	}

}
