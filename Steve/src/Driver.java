
public class Driver {

	public static void main(String[] args) {
		Square sq1, sq2, sq3;
		Rectangle rect1, rect2, rect3;
	//	Circle cir1,cir2, cir3;
		Point p = new Point(0.0, 0.0);
		
		sq1 = new Square(p,5.0);
		p.setX(1.0); p.setY(1.0);
		sq2 = new Square(p,10.0);
		p.setX(5.0); p.setY(8.0);
		sq3 =new Square(p,6.0);
		
		p.setX(5.0); p.setY(8.0);
		rect1 = new Rectangle(p, 3.0, 4.0);
		p.setX(3.0); p.setY(4.0);
		rect2 = new  Rectangle(p, 5.0, 7.0);
		p.setX(2.0); p.setY(7.0);
		rect3 = new Rectangle(p,3.0,4.0);
		/*
		p.setX(2.0); p.setY(9.0);
		cir1 =new Circle(p, 2.0);
		p.setX(6.0); p.setY(22.0);
		cir2 = new Circle(p, 5.0);
		p.setX(6.0) p.setY(22.0);;
		cir3 = new Circle(p,2.0);
		*/
	//A	System.out.println("Square 1: Area = " ,sq1.area();  );
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
	}

}
