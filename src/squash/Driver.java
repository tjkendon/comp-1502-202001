package squash;

public class Driver {

	public static void main(String[] args) {
		 
		
		Game g = new Game();
		for (int i = 0; i < 23; i++) {
			g.score((i%2) +1);
			System.out.println(g.scoreString() + " " + g.isWon());
		}
		
		

	}

}
