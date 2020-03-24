package interfaces;

public interface SpecificStuffDoer extends StuffDoer {
	// an interface can extend another interface and add more specific behaviours
	
	public void doSpecificStuff(String string);

}
