package interfaces;

// interface is a definition of behaviour - different from an abstract class
// because an abstract class focuses on implementation, but the interface for use
// to talk about behaviour specifically

// an interface is contract between classes, you will have this method and can
// do whatever the method specifies I should be able to do




public interface NoiseMaker {
// new keyword interface rather than class
	// interfaces get the same name scheme as classes (capital start, camel case) 
	
	// all noisemaking classes should:
	public void makeNoise();
	// don't say abstract (because we're not allowed any implementation)
	
	
}

// could think about an interface as a list of methods that a class needs to implement

// Java provides several for built in work
//   comparable
//   serializable 
