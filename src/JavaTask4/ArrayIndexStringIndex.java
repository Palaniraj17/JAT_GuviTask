package JavaTask4;

public class ArrayIndexStringIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intarray = { 1, 2, 3, 4, 5 };
		String msg = "Apple";

		try {
			int intcheck = intarray[2];
			System.out.println("The element of 6th place in int array is " + intcheck);
			char chart = msg.charAt(10);
			System.out.println("The element of 20th place in string array is " + chart);
		} 
		
		catch (ArrayIndexOutOfBoundsException e) {
			// actual exception
			e.printStackTrace();

			// customize exception message
			System.out.println("The array index value is out of range");
		}

		catch (StringIndexOutOfBoundsException er) {
			// actual exception
			er.printStackTrace();

			// customize exception message
			System.out.println("The string index value is out of range");
		}

	}

}
