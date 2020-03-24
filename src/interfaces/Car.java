package interfaces;

public class Car implements StuffDoer, NoiseMaker {

	@Override
	public void doStuff() {
		// TODO Auto-generated method stub
		
	}
	// instead of extends, we say we implement an interface
	
	@Override
	public void makeNoise() {
		System.out.println("VROOM");
		
	}
	
	


}
