/**
 * 
 */
package snipcode1;

/**
 * @Sai Kumar
 *Nov 10, 2020
 * 
 */
public class OOPExercises { 
	public static void main(String[] args) 
	{ 
		FirstClass objA = new FirstClass(); 
		SecondClass objB = new SecondClass(); 
		System.out.println("in main(): "); 
		System.out.println("objA.a = "+objA.getFirstClass()); 
		System.out.println("objB.b = "+objB.getSecondClass()); 
		objA.setFirstClass (222); 
		objB.setSecondClass (333.33); 
		System.out.println("objA.a = "+objA.getFirstClass()); 
		System.out.println("objB.b = "+objB.getSecondClass()); 
		} 
	}


class FirstClass {
private int a = 100;

public int getFirstClass() {
	return a;
}

public void setFirstClass(int a) {
	this.a = a;
}

public FirstClass () {
System.out.println("in the constructor of class FirstClass: ");
}
}

class SecondClass {
private double b = 100;

public double getSecondClass() {
	return b;
}

public void setSecondClass(double b) {
	this.b = b;
}

public SecondClass () {
System.out.println("in the constructor of class FirstClass: ");
}
}
