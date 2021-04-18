package learning.Keywords.Java.Abstract;

public abstract class ParentClassWhichIsAbstract {

	public void car() {
		System.out.println(" This is Car method from Parent class");
	}
	
// Abstract class can contain final method
	public final void twoWheeler() {
		System.out.println(" This is Car method from Parent class");
	}
	
	public abstract void truck();
}
