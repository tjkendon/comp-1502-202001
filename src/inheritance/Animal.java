package inheritance;

public class Animal {
	
	protected String eyeColour;
	
	
	
	public Animal(String eyeColour) {
		//System.out.println("Animal");
		this.eyeColour = eyeColour;
	}
	
	public void eat() {
		System.out.println("Vigerous eating noises");
	}
	
	public void sleep() {
		System.out.println("Zzzz Zzzz Zzzz");
	}
	
	public void speak() {
		System.out.println("I AM AN ANIMAL");
	}

}
