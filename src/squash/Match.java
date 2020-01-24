package squash;

import java.util.ArrayList;

public class Match {
	
	private ArrayList<Game> games;

	// could add a default constructor here
	// keep a "standard" number of games to begin with
	
	public Match(int gameCount) {
		games = new ArrayList<>();
		if ((gameCount >= 1) && 
				(gameCount <= 5) && 
				(gameCount % 2 == 1)) {
			for (int i = 0; i < gameCount; i++) {
				games.add(new Game());
			}
		} else {
			System.err.println("Invalid # of games");
		}
	}
	
	// find the active game
	public Game getActiveGame() {
		for (Game g: games) {
			// if game isn't won, return in
		}
		return null;
	}
	
	public void recordPlayerOnePoint() {
		System.out.println("Player 1 Scores");
		// find the active game & save the point
	}
	
	public void recordPlayerTwoPoint() {
		System.out.println("Player 2 Scores");
		// find the active game & save the point
	}
	
	public String getScore() {
		return "Unknown";
	}
	
	
}
