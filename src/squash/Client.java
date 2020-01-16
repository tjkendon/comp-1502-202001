package squash;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Squash:");
		String line = in.next();
		while (!line.equalsIgnoreCase("done")) {
			
			
			line = in.next();
		}
		
	}

}
