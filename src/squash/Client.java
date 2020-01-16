package squash;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter # of games:");
		// create new match with # of games

		// match finds correct game to work on
		String line = in.next();
		line = in.next();
		while (!line.equalsIgnoreCase("done")) {
			switch (line) {
			case ("1"): // match records point for player 1
				System.out.println("Player 1 scores");
				break;
			case ("2"): // match records point for player 2
				System.out.println("Player 2 scores");
				break;
			default:
				System.out.println("Unrecognized input");
			}
			// output score
			System.out.println("Current score is unknown");
			// check for the game winner
			// check for the match winner
			// if winner is found stop

			line = in.next();
		}

	}

}
