package inheritance;

public class FourLeggedPredator extends Animal {

	public FourLeggedPredator() {
		System.out.println("FourLeggedPredator");
	}
	
	public void printEyeColour() {
		super.eyeColour = "Red";
		System.out.println(super.eyeColour);
	}
	
	public void hunt() {
		System.out.println("Find animal");
		super.eat();
	}
	
	
	
}

