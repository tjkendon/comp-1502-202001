package squash;

import java.util.ArrayList;

public class Match {
	
	private ArrayList<Game> games;
	

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
			if (!g.isWon()) {
				return g;
			}

		}
		// return null if there's no answer we can use.
		return null;
	}
	
	public void recordPlayerPoint(int player) {
		System.out.println("Player " + player + " Scores");
		// find the currently active game
		Game currentGame = getActiveGame();
		// if there is a game, then record the score
		if (currentGame != null) {
			currentGame.score(player);
		}
	}
	
	
	public String getScoreString() {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < games.size(); i++) {
			builder.append(i).append(" ").append(games.get(i).scoreString()).append("\n");
		}
		return builder.toString();
	}
	
	public int winner() {
		// return the winner # if we can or 0 if not
		
		int p1Wins = 0;
		int p2Wins = 0;
		
		for (Game g: games) {
			if (g.isWon()) {
				if (g.winner() == 1) {
					p1Wins++;
				} else {
					p2Wins++;
				}
			}
		}
		
		if (p1Wins > (games.size() / 2)) {
			return 1;
		} else if (p2Wins > (games.size() / 2)) {
			return 2;
		} else {
			return 0;
		}
		
	}
	
}
