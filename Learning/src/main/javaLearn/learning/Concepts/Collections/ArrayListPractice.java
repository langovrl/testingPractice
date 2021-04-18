package learning.Concepts.Collections;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListPractice {
	
	public static void main(String[] args) {
		ArrayList arrList = new ArrayList();
		// Add
		arrList.add("ab");
		arrList.add(21);
		arrList.add("a");
		arrList.add(0,2);
		// Get
		System.out.println(arrList.get(0));
		// Modification or updation
		arrList.set(0, "bb");
		// Remove
		arrList.remove(0);
		// Size
		System.out.println(arrList.size());
		System.out.println(arrList);
		// for loop
		for(int i=0;i<arrList.size();i++) {
			System.out.print(arrList.get(i)+" ");
		}
		System.out.println("");
		// foreach
		for(Object i : arrList) {
			System.out.print(i+" ");
		}
		System.out.println("");
		// sort 
		ArrayList<Integer> arr= new ArrayList<Integer>();
		arr.add(1);
		arr.add(5);
		arr.add(3);
		arr.add(4);
		Collections.sort(arr);
		System.out.println(arr);
		for(Object i : arr) {
			System.out.print(i+" ");
		}
	}

}
