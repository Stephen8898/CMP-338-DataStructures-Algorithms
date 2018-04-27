package Geometry.src;

public class Rectangle extends GeometricFigure implements Measurements {

	private double length;
	private double width;
			
	public Rectangle(Point location, double length, double width) {
		super(location);
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double area() {
		return this.length * this.width;
	}

	@Override
	public double perimeter() {
		return 2 * (this.length + this.width);
	}

	@Override
	public boolean equals(Object obj) {
		boolean answer = false;
		
		if (obj instanceof Rectangle) {
			Rectangle otherRectange = (Rectangle) obj;
			
			answer = (this.area() == otherRectange.area());
		}
		
		return answer;
	}

	@Override
	public String toString() {
		String me =  super.toString();
		
		me = me.concat("Length    = " + this.length + "\n");
		me = me.concat("Width     = " + this.width + "\n");
		me = me.concat("Area      = " + this.area() + "\n");
		me = me.concat("Perimeter = " + this.perimeter() + "\n\n");
		
		return me;
	}

	
}
