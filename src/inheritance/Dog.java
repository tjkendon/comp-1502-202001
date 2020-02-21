package inheritance;

public class Dog extends FourLeggedPredator {

	public Dog (String eyeColour) {
		super(eyeColour);
	}
	
	
	public void speak() {
		
		System.out.println("Woof");
	}
}
