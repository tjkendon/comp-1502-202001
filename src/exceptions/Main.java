package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	
	// Notes on Exceptions
	
	// Errors - something is seriously wrong with the JVM
	// Exceptions - something is wrong with the program
	
	// 2 Kinds of exception
	// - checked exception - noted in code (throws) - must be treated
	// - unchecked exception - runtime exception - aren't noted in the code
	
	// if not handled, java defaults print the stack trace
	
	// when an exception happens Java stops running
	// as a programmer this is your note that something is wrong
	
	// when it stops running, it tries to solve the problem, or it passes
	// the problem back up to the method that calls it
	
	// try/catch block
	// java will execute in the try block, until there's an exception
	// then it will jump to the catch block right away.
	// catch block is defined with the type of exception it can catch and gives 
	// the exception a variable/reference to
	
	// throw - our way to tell Java something bad has happened
	
	// big takeaways 
	// - exceptions should be used for exceptional situations
	// - this lets us code as though nothing goes wrong and only have to deal with
	//   problems when things actually go wrong
	// - gives you a chance to recover, if you can
	// - lots of checked vs unchecked exceptions arguments
	
	public static void main(String[] args) throws FileNotFoundException {
		
		boolean debug = true;
		
		try {
			 		
		  methodChecked();
		//  methodUnchecked();
		//	helpfulMethod(10);
		//	helpfulMethod(-10);
		  
		  
		// as soon as exception happens this code is skipped
		  System.out.println("Everything's OK");
		} catch (ArithmeticException ae) {
			System.err.println(ae.getMessage());
			System.err.println("Everything went wrong, math is bad");
			if (debug) {
				ae.printStackTrace();
			}
		} catch (IllegalArgumentException iae) {
			System.err.println("Bad method arguments");
			System.err.println(iae.getLocalizedMessage());
//		}
			
		} catch (FileNotFoundException fnfe) {
			System.err.println(fnfe.getMessage());
						System.err.println("Everything went wrong, Not able to find file to open");
		} catch (IOException ioe) {
			System.err.println(ioe.getMessage());
			System.err.println("Something is wrong with IO");
		} catch (Exception e) {
			System.err.println("I dunno");
		} 
		
		System.out.println("I'm here!");
		

	}
	
	public static void methodUnchecked() {
		int i = 0;
		int j = 100;
		
		System.out.println(j / i);

	}
	
	public static void methodChecked() throws FileNotFoundException {
		// throws is the keyword meaning that an exception *might* happen
		
		boolean fileOK = false;
		Scanner kb = new Scanner(System.in);
		while (!fileOK) {
			try {
				System.out.println("Please enter file name:");
				String fileName = kb.nextLine();
				File f = new File(fileName);

				Scanner scanner = new Scanner(f);
				
				fileOK = true;
			} catch (FileNotFoundException fnfe) {
				System.out.println("Not able to find file, please try again");
			} catch (IOException ioe) {
				System.out.println("IO Exception");
				//scanner.close();
			} finally {
				// this is always run whether the try finished
				// or one of the exceptions was run
				//scanner.close();
			}
		}
		
		//scanner.nextLine();
				
	}
	
	public static void helpfulMethod(int numberLoops)  {
		
		if (numberLoops <= 0) {
			throw new IllegalArgumentException("Must loop a non-zero number of times. Tried to print " + numberLoops);
		}
		
		for (int i = 0; i < numberLoops; i++) {
			System.out.println("I've printed " + i + " times");
		}
	}
	
	
	
	
	
	

}
