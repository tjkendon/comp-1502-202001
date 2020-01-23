package enums;

import enums.Nifty.NiftyEnum;

public class EnumExample {

	// enum keyword, Name (Class Rules) 
	// in braces, the possible values
	// all constant style (all caps, snake)
	// ends with a semicolon
	enum Colour {RED, BLUE, GREEN};

	public static void main(String args[]) {
		
		// variable as usual
		// assign enum.value
		Colour x = Colour.BLUE;
		System.out.println(x);
		x = Colour.GREEN;
		System.out.println(x);
		x = Colour.RED;
		System.out.println(x);
		
		if (x == Colour.RED) {
			System.out.println("It's Red!");
		}
		
		// for switches you leave off the enum name
		// for the values
		switch (x) {
		case RED: System.out.println("Z"); break;
		case BLUE: System.out.println("Y"); break;
		case GREEN: System.out.println("X"); break;
		}
		
		// get the value of an enum from a string
		x = Colour.valueOf("RED");
		if (x == Colour.RED) {
			System.out.println("It's Red!");
		}
		
		// using enums from other classes
		// prefix with the class name??
		Nifty.NiftyEnum y = Nifty.NiftyEnum.KINDA_NIFTY;
		System.out.println(y);
		
	}
	
}
