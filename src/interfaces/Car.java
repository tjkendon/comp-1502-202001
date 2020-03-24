package interfaces;

public class Car implements NoiseMaker{
	// instead of extends, we say we implement an interface
	
	@Override
	public void makeNoise() {
		System.out.println("VROOM");
		
	}


}
