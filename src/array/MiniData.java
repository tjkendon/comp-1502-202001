package array;

public class MiniData {

	private int miniValue;

	public MiniData(int miniValue) {
		this.miniValue = miniValue;
	}
	
	// copy constructor
	// takes an object of the same type & copies its values
	public MiniData(MiniData original) {
		this.miniValue = original.miniValue;
		
	}
	
	public int getMiniValue() {
		return miniValue;
	}

	public void setMiniValue(int miniValue) {
		this.miniValue = miniValue;
	}

	

	@Override
	public String toString() {
		return "MiniData [miniValue=" + miniValue + "]";
	}
	
	
	
}
