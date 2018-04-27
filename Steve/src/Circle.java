/*
public class Circle extends GeometricalFigure implements Measurements {

	private double radius; 
	public Circle(Point location, double radius) {
		super(location);//
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
	public double perimemter() {
		return 2 * Math.PI * this.radius;
	}

	@Override
	public boolean equals(Object obj) {
		boolean answer = false;
		
		if (obj instanceof Circle) {
			
			Circle otherCircle = (Circle) obj;
			
			answer = (this.area() == otherCircle.area());	
			
		}
		return answer;
		
	}
}
*/