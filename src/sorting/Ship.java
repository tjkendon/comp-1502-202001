package sorting;

public class Ship implements Comparable<Ship>{
	
	private String name;
	private int idNumber;
	public Ship(String name, int idNumber) {
		super();
		this.name = name;
		this.idNumber = idNumber;
	}
	public String getName() {
		return name;
	}
	public int getIdNumber() {
		return idNumber;
	}
	
	
	public String toString() {
		return name + " - " + idNumber;
	}
	@Override
	public int compareTo(Ship other) {
		// returns negative if this goes before other Ship
		// returns 0 if they're the same
		// returns positive if this goes after the other Ship
		
		// sorting by number
//		if (this.idNumber < other.idNumber) {
//			return -1;
//		} else if (this.idNumber == other.idNumber) {
//			return 0;
//		} else {
//			return 1;
//		}
		
		//sorting by name
		return this.name.compareTo(other.name);
			
		
		// when you make your own classes you must make your own decisions 
		// about how to sort them
		
		
		
	}

}
