
public class Rectangle extends GeometricalFigure implements Measurements { 

	
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
		return 2* this.length + 2* this.width;
	}


@Override
public boolean equals(Object obj) {
	boolean answer = false;
	
	if (obj instanceof Rectangle) {
		
		Rectangle otherRectangle = (Rectangle) obj;
		
		answer = (this.area() == otherRectangle.area());
		
		
	}
	return answer;
	
}
}