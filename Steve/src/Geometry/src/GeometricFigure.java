package Geometry.src;

public class GeometricFigure {
	
	private Point location;

	public GeometricFigure(Point location) {
		super();
		this.location = location;
	}

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point location) {
		this.location = location;
	}

	@Override
	public String toString() {
		String me = new String();
		
		me = me.concat("Location    = " + this.location + "\n");
		
		return me;
	}
	
	
	

}
