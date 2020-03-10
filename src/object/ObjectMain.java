package object;

public class ObjectMain {

	public static void main(String[] args) {
	
		
		Object o = new Object();
		Object o2 = new Object();
		
		System.out.println(o);
		System.out.println(o2);
		System.out.println(o.hashCode());
		System.out.println(o.equals(o2));
		
//		//Point p = new Point(1,1);
//		Object p1 = (Object) p;
//		
//		//p = new Point(2,2);
//		
//		System.out.println(p);
//		System.out.println(p1);
//		
//		System.out.println(p.toString());
//		System.out.println(p.hashCode());
//		System.out.println(p.equals(o));
		
		Point x = new Point(1,1, "A");
		Point y = new Point(1,1, "A");
		
		System.out.println(x.equals(y));

	}

}
