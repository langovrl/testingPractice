package learning.Concepts.Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPractice {
	
	public static void main(String[] args) {
		HashSet<String> hashset = new HashSet<String>();
		// Duplicates are not allowed
		hashset.add("Test");
		hashset.add("Testt");
		hashset.add("Test");
		System.out.println(hashset);
		
		// 
		HashSet<String> cars = new HashSet<String>();
		cars.add("volvo");
		cars.add("Honda");
		cars.add("");
		cars.add("Scoda");
		cars.add("BMW");
		cars.add("Mercedise");
		cars.add("Honda");
		System.out.println(cars);
		
		// contains
		System.out.println(cars.contains("BMW"));
		
		// removed
		cars.remove("Honda");
		System.out.println(cars);
		
		// clear
		cars.clear();
		System.out.println(cars);
		
		// size
		cars.add("volvo");
		cars.add("Scoda");
		cars.add("BMW");
		cars.add("Mercedise");
		cars.add("Honda");
		System.out.println("Size : "+cars.size()+" "+cars);
		System.out.println();
		for(String i : cars) {
			System.out.print(i+", ");
		}
		System.out.println();
		Iterator itr = cars.iterator();
		while (itr.hasNext()) {
			System.out.println("Itr : "+itr.next());
		}
	}

}
