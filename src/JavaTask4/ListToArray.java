package JavaTask4;

import java.util.ArrayList;
import java.util.Arrays;

public class ListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> myarliststring = new ArrayList<String>();

		myarliststring.add("Null");
		myarliststring.add("One");
		myarliststring.add("Two");
		myarliststring.add("Three");
		myarliststring.add("Four");
		myarliststring.add("Five");
		myarliststring.add("Six");
		
		ArrayList<Integer> myarlistint = new ArrayList<Integer>();

		myarlistint.add(0);
		myarlistint.add(1);
		myarlistint.add(2);
		myarlistint.add(3);
		myarlistint.add(4);
		myarlistint.add(5);
		myarlistint.add(6);
		
		String[] stArray= myarliststring.toArray(new String[myarliststring.size()]);
		Integer[] intArray = myarlistint.toArray(new Integer[myarlistint.size()]);
		
		System.out.println("The array of integer array list is "+Arrays.toString(stArray));
		System.out.println("The array of String array list is "+Arrays.toString(intArray));
		
	}
}
