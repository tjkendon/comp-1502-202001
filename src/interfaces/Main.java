package interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main (String[] args) {
		
		Car car = new Car();
		car.makeNoise();
		
		Cat cat = new Cat();
		cat.makeNoise();
		
		List<NoiseMaker> makers = new ArrayList<>();
		
		makers.add(car);
		makers.add(cat);
		
		for (NoiseMaker m : makers) {
			m.makeNoise();
		}
		
		NoiseMaker noiseCar = (NoiseMaker) car;
		StuffDoer doerCar = (StuffDoer) car;
		
		car.doStuff();
		car.makeNoise();
		
		noiseCar.makeNoise();
		//noiseCar.doStuff(); won't work not in the reference
		
		
	}
	
}
