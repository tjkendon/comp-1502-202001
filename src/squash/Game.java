package squash;

public class Game {

	public final static int POINTS_PER_GAME = 11;
	
	private int playerOneScore = 0;
	private int playerTwoScore = 0;
	
	
	public Game() {
		this.playerOneScore = 0;
		this.playerTwoScore = 0;
	}
	
	public void score(int player) {
		switch(player) {
		case 1: playerOneScore++; break;
		case 2: playerTwoScore++; break;
		}
	}
	
	public boolean isWon() {
		if (((playerOneScore >= 11) && 
		   (playerOneScore >= playerTwoScore +2)) || 
				((playerTwoScore >= 11) && 
						   (playerTwoScore >= playerOneScore +2))) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public String scoreString() {
		return playerOneScore + " - " + playerTwoScore;
	}

	public int getPlayerOneScore() {
		return playerOneScore;
	}

	public int getPlayerTwoScore() {
		return playerTwoScore;
	}
	
}
