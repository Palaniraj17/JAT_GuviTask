package JavaTask2;
import java.util.Scanner;
public class Palindromeforandif1 {

	@SuppressWarnings({ "resource" }) // adding this to remove warning
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any text : ");
		String palincheck = sc.nextLine();
		palincheck = palincheck.toLowerCase();
		String revtext="";
		
		for(int i=palincheck.length()-1;i>=0;i--)
		{
			revtext = revtext+palincheck.charAt(i);
		}
		if (palincheck.equalsIgnoreCase(revtext))
		{
			System.out.println("The entered text is Palindrome");
		}
		else
		{
			System.out.println("The entered text is not Palindrome");
		}
	}
}
