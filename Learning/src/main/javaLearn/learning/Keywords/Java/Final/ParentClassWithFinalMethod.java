package learning.Keywords.Java.Final;

public class ParentClassWithFinalMethod {
// 1. Creating class with one or more final method is allowed (No need to declare class as final)	
	public final void name() {
		int a= 1;
		System.out.println("My Name is Dude");
	}
	
	public void surname() {
		System.out.println("My Name is Dude");
	}
}
