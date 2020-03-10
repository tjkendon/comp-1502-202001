package object;

public class Point{

	
	private int x;
	private int y;
	
	private String name;
	
	private String notes;
	
	
	public Point(int x, int y, String name) {
		this.x = x;
		this.y = y;
		this.name = name;
		
	}
	
	@Override
	public String toString() {
		String ret = name + " at " + x + ", " + y;
		return ret;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	/*@Override
	public boolean equals(Object other) {
	// must override object.equals(), so we *must* take object as the argument≠
		
		// always false if other is null
		if (other != null) {
			// must make sure the class is right
			if (other instanceof Point) {
				// cast to access the field variables
				Point otherPoint = (Point) other;
				// ensure the variables match
				if ((this.x == otherPoint.x) 
						&& (this.y == otherPoint.y) 
						&& this.name.equals(otherPoint.name)) {
					return true;
				}
			}
		}
		
		return false;
	}*/
	
	
	
	
}
