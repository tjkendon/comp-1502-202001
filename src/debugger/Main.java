package debugger;

public class Main {

	public static void main(String[] args) {
		
		int x = 10;
		boolean y = false;
		
		for (int i = 0; i < x; i++) {
			System.out.println(i + " " + x + " " + y);
			y = !y;
		}
		
		String z = new String("Hello World");
		
		while (z.length() < 20) {
			z = z + "!";
			System.out.println(z);
		}
		
		Point p1 = new Point(5, 5);
		Point o = new Point(0, 0);
		
		while (!o.same(p1)) {
			Point p2 = new Point(p1.getX() - 1, p1.getY() - 1);
			System.out.println(p2.toString());
			p1 = p2;
		}
			
		
		
		
		
		
		

	}

}
