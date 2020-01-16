package squash;

import java.util.ArrayList;

public class Match {
	
	private ArrayList<Game> games;

	// could add a default constructor here
	// keep a "standard" number of games to begin with
	
	public Match(int gameCount) {
		games = new ArrayList<>();
		// add gameCount new games to the arrayList
	}
	
	// find the active game
	public Game getActiveGame() {
		for (Game g: games) {
			// if game isn't won, return in
		}
		return null;
	}
	
	public void recordPlayerOnePoint() {
		// find the active game & save the point
	}
	
	public void recordPlayerTwoPoint() {
		// find the active game & save the point
	}
	
	public String getScore() {
		return "Unknown";
	}
	
	
}
