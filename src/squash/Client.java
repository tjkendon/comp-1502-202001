package squash;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter # of games:");
		// create new match with # of games

		int gameCount = in.nextInt();
		Match match = new Match(gameCount);
		
		// match finds correct game to work on
		
		String line = in.next();
		while (!line.equalsIgnoreCase("done")) {
			switch (line) {
			case ("1"): // match records point for player 1
				match.recordPlayerPoint(1);
				break;
			case ("2"): // match records point for player 2
				match.recordPlayerPoint(2);
				break;
			default:
				System.out.println("Unrecognized input");
			}
			// output score
			System.out.println(match.getScoreString());
			// check for the game winner
			// check for the match winner
			// if winner is found stop

			line = in.next();
		}
		in.close();

	}

}
