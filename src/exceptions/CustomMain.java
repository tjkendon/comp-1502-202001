package exceptions;


// for playing with our COMP1502Exception 
public class CustomMain {
	
	public static void main(String[] args) {
		
		
		
		try {
			doStuff(1);
			doStuff(5);
		} catch (COMP1502Exception ce) {
			System.err.println("Exception Caught");
			System.err.println(ce.getData());
			System.err.println(ce.getMessage());
			ce.printStackTrace();
		}
		
		
		
	}
	
	public static void doStuff(int x) throws COMP1502Exception {
		System.out.println("DoStuff");
		if (x > 3) {
			throw new COMP1502Exception("Math is confusing");
		}
		
	}

}
