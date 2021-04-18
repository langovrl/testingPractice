package learning.Keywords.Java.Final;

public class ChildClass extends ParentClassWithFinalMethod{
	
// 1. Overloading Final Method
	public void name(int a) {
		System.out.println("a = "+a);
	}
	
// 2.  Overriding Final Method not possible uncomment to try

	/*	public void name(int a) {
		System.out.println("a = "+a);
	}
	*/
	
	public static void main(String[] args) {
		ChildClass CC = new ChildClass();
		CC.name(2);

//  3. For Final class object creation is allowed		
		ParentClassWhichIsFinal FinalParent = new ParentClassWhichIsFinal();
		FinalParent.test();
	}
}

//  4. Can not inherit Final class uncomment to try
/*class ChildClassExtentdeningFinalClass extends ParentClassWhichIsFinal{
	
}*/
	