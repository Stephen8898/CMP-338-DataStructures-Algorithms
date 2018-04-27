package Geometry.src;

public class Circle extends GeometricFigure implements Measurements {

	private double radius;
		
	public Circle(Point location, double radius) {
		super(location);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * this.radius * this.radius;
	}

	@Override
	public double perimeter() {
		return 2 * Math.PI * this.radius;
	}

	@Override
	public boolean equals(Object obj) {
		boolean answer = false;
		
		if (obj instanceof Circle) {
			Circle otherCircle = (Circle) obj;
			
			answer = (this.radius == otherCircle.getRadius());
		}
		
		return answer;
	}

	@Override
	public String toString() {
		String me =  super.toString();
		
		me = me.concat("Radius    = " + this.radius + "\n");
		me = me.concat("Area      = " + this.area() + "\n");
		me = me.concat("Perimeter = " + this.perimeter() + "\n\n");
		
		return me;
	}

}
