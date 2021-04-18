package learning.Keywords.Java.Static;

public class ChildClassForStatic extends ParentClassWithStaticMethod {

// Overriding is not allowed for the staic method 
/*	public void add(int a, int b) {
		
	}
*/	
	
// Overloading is allowed for the static method	
	public void add(int a, int b, int c) {
		
	}
	
	public static void main(String[] args) {
		ChildClassForStatic CCFS = new ChildClassForStatic();
		ParentClassWithStaticMethod PCWSM = new ParentClassWithStaticMethod();
		System.out.println(PCWSM.add(1, 2));
	}

}
