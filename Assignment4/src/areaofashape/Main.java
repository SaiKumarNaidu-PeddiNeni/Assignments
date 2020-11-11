package areaofashape;

/*Finding the area of a shape*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String name;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the name");
		name = scan.nextLine();

		if (name.equalsIgnoreCase("circle")) {
			float radius;
			System.out.println("enter radius");
			radius = scan.nextFloat();
			Shape circle = new Circle(name, radius);
			System.out.println(circle.calculateArea());
			circle = null;
		}

		if (name.equalsIgnoreCase("square")) {
			int side;
			System.out.println("enter side");
			side = scan.nextInt();
			Shape square = new Square(name, side);
			System.out.println(square.calculateArea());
			square = null;
		}

		if (name.equalsIgnoreCase("rectangle")) {
			int length;
			int breadth;
			System.out.println("enter length and breadth");
			length = scan.nextInt();
			breadth = scan.nextInt();
			Shape rectangle = new Rectangle(name, length, breadth);
			System.out.println(rectangle.calculateArea());
			rectangle = null;
		}

		scan.close();

	}

}
