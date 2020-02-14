package inheritance;

public class HouseCat extends Cat {

	public HouseCat() {
		
	}
	
	public void purr() {
		System.out.println("Rumble");
	}
	
	@Override
	public void speak() {
		super.speak();
		System.out.println("Meow.");
	}
	
	@Override
	public void extendClaws() {
		super.extendClaws();
		System.out.println("Scratch Couch");
	}
	
}
