package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WordLength {

	// collections - maps
	
			private Map<Integer, ArrayList<String>> wordLength; 
					
			
	public WordLength() {
		wordLength = new HashMap<Integer, ArrayList<String>>();
	}
	
	
	public void add(int length, String s) {
		if (!wordLength.containsKey(length)) {
			wordLength.put(length, new ArrayList<String>());
		}
		wordLength.get(length).add(s);
	}
	
	public String toString() {
		return wordLength.toString();
	}
			
			
			
	
}
