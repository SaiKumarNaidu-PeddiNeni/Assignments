package areaofashape;
import java.lang.Math;

public class Circle extends Shape{
	private float radius;
	
	

	public Circle(String name,float radius) {
		super();
		this.radius = radius;
		super.name=name;
	}

	/*
	 * public float getRadius() { return radius; }
	 * 
	 * public void setRadius(float radius) { this.radius = radius; }
	 */

	@Override
	public float calculateArea() {
		
		return ((float)Math.PI)*radius*radius;
	}
	
	
	

}
