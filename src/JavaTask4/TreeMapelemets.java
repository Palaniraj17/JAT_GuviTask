package JavaTask4;

import java.util.TreeMap;

public class TreeMapelemets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer, String> tmap =new TreeMap<>();
		tmap.put(01, "Arun");
		tmap.put(02, "Zen");
		tmap.put(03, "Guna");
		tmap.put(04, "Ram");
		tmap.put(05, "Ken");
		tmap.put(06, "Xavier");
		System.out.println("The employee names are ");
		for(String names:tmap.values())
		{
			System.out.println(names);
		}
	}

}
