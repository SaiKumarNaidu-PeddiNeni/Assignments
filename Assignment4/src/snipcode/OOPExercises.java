/**
 * 
 */
package snipcode;

/**
 * @Sai Kumar
 *Nov 10, 2020
 * 
 */
public class OOPExercises { 
	public static void main(String[] args) { 
		A objA = new A(); 
		System.out.println("in main(): "); 
		objA.setA(222);
		System.out.println("objA.a = "+objA.getA()); 
		
	} 
}

class A {
private int a = 100;
public void setA( int value) {
this.a = value;
}
public int getA() {
return a;
}
}
