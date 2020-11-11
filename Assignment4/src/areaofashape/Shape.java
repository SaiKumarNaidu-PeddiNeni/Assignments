package areaofashape;

abstract public class Shape {
	protected String name;
	
	/*
	 * public String getName() { return name; }
	 */

	public void setName(String name) {
		this.name = name;
	}

	abstract public float calculateArea();

}
