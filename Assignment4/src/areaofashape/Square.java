package areaofashape;

public class Square extends Shape{
	private int side;

	/*
	 * public int getSide() { return side; }
	 * 
	 * public void setSide(int side) { this.side = side; }
	 */

	public Square(String name,int side) {
		super();
		this.side = side;
		super.name=name;
	}
	
    public float calculateArea() {
		
		return side*side;
	}
	
	
		

}
