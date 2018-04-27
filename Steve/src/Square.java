
public class Square extends GeometricalFigure implements Measurements{

	@Override
	public boolean equals(Object obj) {
		boolean answer = false;
		
		if (obj instanceof Square) {
			
			Square otherSquare = (Square) obj;
			
			answer = (this.sideLength == otherSquare.getSideLength());
			
			
		}
		return answer;
		
	}

	private double sideLength;
	
	public Square (Point location, double sideLength){
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
		return this.sideLength*this.sideLength; // Referring to an instance variable
	}

	@Override
	public double perimeter() {
		return this.sideLength *4 ;
	}

	@Override
	public String toString() {
		String me = new String();
		me = me.concat("SideLength = " + this.sideLength+ "\n");
		me = me.concat("area  = " + this.area() + "\n");
		me = me.concat("Perimeter = " + this.perimeter() + "\n");
		
		return me;
	}
	//String are immutable (Cannot be changed) so to change it "me" must be reassigned 
	//when "me.concat" is created it is a new object that must be reassigned to "me".

}
