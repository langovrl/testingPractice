package learning.Keywords.Java.Final;

public final class ParentClassWhichIsFinal {
    int a=1;
//  Every method & variable of final class does not need to be final
	public void test() {
		System.out.println("Print Test of a = "+a);
	}
}
