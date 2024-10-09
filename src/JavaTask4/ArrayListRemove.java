package JavaTask4;

import java.util.ArrayList;

public class ArrayListRemove {

	public static void main(String[] args) {

		ArrayList<Object> myarlist = new ArrayList<Object>();

		myarlist.add("Null");
		myarlist.add("One");
		myarlist.add("Two");
		myarlist.add("Three");
		myarlist.add("Four");
		myarlist.add("Five");
		myarlist.add("Six");
		//To print the elements in the array list
		for (Object elements : myarlist) {
			System.out.println("The array list elements are :" + elements);
		}
		for (int i = 0; i <= myarlist.size(); i++) {
			i = 0;
			myarlist.removeFirst();
		}
		System.out.println("Removed the all elements in the array list. The final array list will be :" + myarlist);
	}
}
