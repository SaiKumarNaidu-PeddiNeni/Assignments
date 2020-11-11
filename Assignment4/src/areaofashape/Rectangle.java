package areaofashape;

public class Rectangle extends Shape {
	private int length;
	private int breadth;

	/*
	 * public int getLength() { return length; }
	 * 
	 * public void setLength(int length) { this.length = length; }
	 * 
	 * public int getBreadth() { return breadth; }
	 * 
	 * public void setBreadth(int breadth) { this.breadth = breadth; }
	 */

	public Rectangle(String name, int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
		super.name = name;
	}

	public float calculateArea() {

		return length * breadth;
	}

}
