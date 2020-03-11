package array;

public class Data {
	
	private int score;
	private String name;
	private MiniData mini;
	
	public Data(Data original) {
		
		this.score = original.score;
		this.name = original.name;
		// make sure that we have a deep copy
		// all the way down
		this.mini = new MiniData(original.mini);
		
	}
	
	public Data(int score, String name) {
		super();
		this.score = score;
		this.name = name;
		mini = new MiniData(1000); 
	}
	
	public MiniData getMini() {
		MiniData returnMini = new MiniData(mini.getMiniValue());
		
		return returnMini;
	}


	public void setMini(MiniData mini) {
		this.mini = mini;
	}


	


	


	@Override
	public String toString() {
		return "Data [score=" + score + ", name=" + name + ", mini=" + mini + "]";
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	

}
