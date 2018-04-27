package Geometry.src;

public class Square extends GeometricFigure implements Measurements {

	private double sideLength;

	public Square(Point location, double sideLength) {
		super(location);
		this.sideLength = sideLength;
	}

	public double getSideLength() {
		return sideLength;
	}

	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}

	@Override
	public double area() {
		return this.sideLength * this.sideLength;
	}

	@Override
	public double perimeter() {
		return this.sideLength * 4;
	}

	@Override
	public boolean equals(Object obj) {
		boolean answer = false;
		
		if (obj instanceof Square) {
			Square otherSquare = (Square) obj;
			
			answer = (this.sideLength == otherSquare.getSideLength());
		}
		
		return answer;
	}

	@Override
	public String toString() {
		String me = super.toString();
		
		me = me.concat("Side Length = " + this.sideLength + "\n");
		me = me.concat("Area        = " + this.area() + "\n");
		me = me.concat("Perimeter   = " + this.perimeter() + "\n\n");
		
		return me;
	}

	
	
}
