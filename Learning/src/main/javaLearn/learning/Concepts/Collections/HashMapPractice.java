package learning.Concepts.Collections;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapPractice {

	public static void main(String[] args) {
		HashMap<Integer, String> HM = new HashMap<Integer, String>();
		HM.put(1, "Jan");
		HM.put(2, "Feb");
		HM.put(3, "Mar");
		HM.put(4, "April");
		HM.put(5, "Mar");
		System.out.println(HM);
		System.out.println(HM.get(2));
		HM.clear();
		System.out.println(HM);
		HM.put(1, "Jan");
		HM.put(2, "Feb");
		HM.put(3, "Mar");
		HM.put(4, "April");
		HM.put(5, "Mar");
		System.out.println(HM.size());
		for(int i : HM.keySet()) {
			System.out.println(i);
		}
		for(String i: HM.values()) {
			System.out.println(i);
		}
		
	}
}
