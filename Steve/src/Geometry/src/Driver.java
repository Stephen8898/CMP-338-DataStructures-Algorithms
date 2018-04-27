package Geometry.src;

public class Driver {

	public static void main(String[] args) {
		Square square1, square2, square3;
		Rectangle rectangle1, rectangle2, rectangle3;
		Circle circle1, circle2, circle3;
		Point p = new Point(0.0, 0.0);

		square1 = new Square(p, 5.0);
		p.setX(1.0); p.setY(1.0);
		square2 = new Square(p, 10.0);
		p.setX(3.0); p.setY(19.0);
		square3 = new Square(p, 5.0);
		
		p.setX(5.0); p.setY(8.0);
		rectangle1 = new Rectangle(p, 3.0, 4.0);
		p.setX(3.0); p.setY(4.0);
		rectangle2 = new Rectangle(p, 5.0, 7.0);
		p.setX(17.0); p.setY(92.0);
		rectangle3 = new Rectangle(p, 3.0, 4.0);
		
		p.setX(2.0); p.setY(9.0);
		circle1 = new Circle(p, 2.0);
		p.setX(6.0); p.setY(22.0);
		circle2 = new Circle(p, 5.0);
		p.setX(6.0); p.setY(22.0);
		circle3 = new Circle(p, 2.0);
		
		System.out.println("Square 1 \n" + square1);
		System.out.println("Square 2 \n" + square2);
		if (square1.equals(square2)) {
			System.out.println("Square 1 and Square 2 are equal");
		} else {
			System.out.println("Square 1 and Square 2 are not equal");
		}
		if (square1.equals(square3)) {
			System.out.println("Square 1 and Square 3 are equal");
		} else {
			System.out.println("Square 1 and Square 3 are not equal");
		}
		
		System.out.println();
		System.out.println("Rectangle 1 \n" + rectangle1);
		System.out.println("Rectangle 2 \n" + rectangle2);
		if (rectangle1.equals(rectangle2)) {
			System.out.println("Rectangle 1 and Rectangle 2 are equal");
		} else {
			System.out.println("Rectangle 1 and Rectangle 2 are not equal");
		}
		if (rectangle1.equals(rectangle3)) {
			System.out.println("Rectangle 1 and Rectangle 3 are equal");
		} else {
			System.out.println("Rectangle 1 and Rectangle 3 are not equal");
		}

		
		
		System.out.println();
		System.out.println("Circle 1 \n" + circle1);
		System.out.println("Circle 2 \n" + circle2);
		if (circle1.equals(circle2)) {
			System.out.println("Circle 1 and Circle 2 are equal");
		} else {
			System.out.println("Circle 1 and Circle 2 are not equal");
		}
		if (circle1.equals(circle3)) {
			System.out.println("Circle 1 and Circle 3 are equal");
		} else {
			System.out.println("Circle 1 and Circle 3 are not equal");
		}

		
		System.out.println();
	}

}
