package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(5);
		numbers.add(3);
		numbers.add(7);
		numbers.add(123);
		numbers.add(33);
		numbers.add(14);
		numbers.add(68);
		
		System.out.println(numbers);
		
		Collections.sort(numbers);
		// put the numbers in their natural order
		
		System.out.println(numbers);
		// easy
		
		List<String> words = new ArrayList<>();
		words.add("hello");
		words.add("cat");
		words.add("Duck");
		words.add("Spoon");
		words.add("spoon");
		words.add("car");
		words.add("cart");
		
		System.out.println(words);
		
		Collections.sort(words);
		// sorts into lexigraphical sorting order
		// asciibetical
		
		
		System.out.println(words);
		
		List<Ship> ships = new ArrayList<>();
		ships.add(new Ship("SS Canada", 1454));
		ships.add(new Ship("SS Britania", 1451));
		ships.add(new Ship("SS Albatros", 1500));
		
		System.out.println(ships);
		
		Collections.sort(ships);
		// can't sort without a natural order
		
		System.out.println(ships);
		
		

	}

}
