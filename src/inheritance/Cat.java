package inheritance;

public class Cat extends FourLeggedPredator {

	protected boolean clawsIn;
	
	public Cat() {
		System.out.println("Cat");
	}
	
	public void extendClaws() {
		clawsIn = true;
		System.out.println("Knives");
	}
	
	public void retractClaws() {
		clawsIn = true;
		System.out.println("Beans");
	}
	
}
