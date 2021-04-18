package learning.Keywords.Java.Abstract;

public class ChildClassForAbstractKeyword extends ParentClassWhichIsAbstract {

// 1. Overriding is allowed 
	public void car() {
		System.out.println("This is Car method from child class which is overrided");
	}
	
	public void truck() { 
		System.out.println("This is truck method overloaded in the child class");
	}
	
// 2. Overloading is allowed 
	
	public void car(int a) {
		System.out.println("This is Car method from child class which is overloaded & a = "+a);
	}
// To overload abstract method you need to override the method first	
	public void truck(int b) { 
		System.out.println("This is truck method overloaded in the child class b = "+b);
	}
	
	public static void main(String[] args) {
		ChildClassForAbstractKeyword CCFA = new ChildClassForAbstractKeyword();
		CCFA.car();
		CCFA.car(1); 
		CCFA.truck();
		CCFA.truck(2);
// Can not create object of the abstract class
//		ParentClassWhichIsAbstract PCWIA = new ParentClassWhichIsAbstract();
		
		
	}
}
