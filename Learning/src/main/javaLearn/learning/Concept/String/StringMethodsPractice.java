package learning.Concept.String;

import java.util.Arrays;

public class StringMethodsPractice {
	static String s = "Sachin"; // Can be declared like this 
	static String sa = new String("Sachin"); // Or like this
	
	
	
	public static void main(String[] args) {
		
		// String is immutable below is example
		s.concat("Tendulkar");
		System.out.println(s);
		sa.concat("Tendulkar");
		System.out.println(sa);
		
		// ChartAt()
		System.out.println(s.charAt(2));
		// length()
		System.out.println(s.length());
		// toLowerCase()
		System.out.println(s.toLowerCase());
		// toUpperCase()
		System.out.println(s.toUpperCase());
		// equals()
		System.out.println(s.equals(sa));
		// isEmpty()
		System.out.println(s.isEmpty());
		// compareTo()
		String x = "SachinTendulkar";
		System.out.println(s.compareTo(x));
		// equalsIgnoreCase()
		String y = "SachiN";
		System.out.println(s.equalsIgnoreCase(y));
		// split()
		String z = "20/11/2020";
		String[] a = z.split("/");
		System.out.println(Arrays.toString(a));
		
		// startsWith()
		System.out.println(s.startsWith("S"));
		System.out.println(s.startsWith("a"));
		// endsWith()
		System.out.println(s.endsWith("n"));
		// replace()
		System.out.println(s.replace('n', 'k'));
		// lastIndexOf()
		String an = "paparazi";
		System.out.println(an.lastIndexOf('a'));
		// valueOf()
		int val = 100;
		System.out.println(String.valueOf(val));
		
	}

}
