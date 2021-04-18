package learning.Concepts.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListPractice {
	
	/*
	 * 
How the ArrayList works

The ArrayList class has a regular array inside it. When an element is added, it is placed into the array. 
If the array is not big enough, a new, larger array is created to replace the old one and the old one is removed.

When To Use

It is best to use an ArrayList when:

 -   You want to access random items frequently
 -   You only need to add or remove elements at the end of the list

It is best to use a LinkedList when:

 -   You only use the list by looping through it instead of accessing random items
 -   You frequently need to add and remove items from the beginning, middle or end of the list
 
	 */
	
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(1);
		ll.add(1);
		ll.add(55);
		ll.add(8);
		System.out.println(ll);

		LinkedList llarr = new LinkedList();

		// Add
		llarr.add("ab");
		llarr.add(21);
		llarr.add("a");
		llarr.add(0,2);
		// Get
		System.out.println(llarr.get(0));
		// Modification or updation
		llarr.set(0, "bb");
		// Remove
		llarr.remove(0);
		// Size
		System.out.println(llarr.size());
		System.out.println(llarr);
		// for loop
		for(int i=0;i<llarr.size();i++) {
			System.out.print(llarr.get(i)+" ");
		}
		System.out.println("");
		// foreach
		for(Object i : llarr) {
			System.out.print(i+" ");
		}
		System.out.println("");
		// sort 
		//Collections.sort(llarr);
		System.out.println(llarr);
		for(Object i : llarr) {
			System.out.print(i+" ");
		}
	}

}
