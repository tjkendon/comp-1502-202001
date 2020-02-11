package inheritance;

public class Main {

	public static void main(String[] args) {
		
		HouseCat fluffy = new HouseCat();
		
		fluffy.extendClaws();
		fluffy.hunt();
		fluffy.eat();
		fluffy.retractClaws();
		
		FourLeggedPredator x = new FourLeggedPredator();
		x.hunt();
		
		
		SnowLeopard snowy = new SnowLeopard();
		snowy.hunt();
		
	}
	
}
