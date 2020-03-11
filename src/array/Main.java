package array;

public class Main {
	
	public static void main(String[] args) {
		
		
		
		int[] numbers = new int[10];
		// int[] is a reference to an *array* of ints
		// numbers is the reference name
		// new tells java to reserve memory for this
		// int[10] says we want 10 ints in the array
		
		System.out.println(numbers);
		// only prints the reference #
	
		System.out.println(numbers[0]);
		// prints the int stored at index 0
		
		System.out.println(numbers.length);
		// prints out the size of the array
		
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		numbers[5] = 100;
		// assign the same way as we would to a variable
		// except we include the array name and the index
		
		System.out.println(intArrayString(numbers));
		
		int[] n2 = new int[10];
		for (int i = 0; i < n2.length; i++) {
			n2[i] = i + 1;
			System.out.println(intArrayString(n2));
		}
		
		char[] chars = new char[3];
		chars[0] = 'c';
		chars[1] = 'a';
		chars[2] = 't';
		// we can do for any primitive
		
		String[] strings = new String[3];
		strings[0] = "Hello";
		strings[1] = "World";
		//strings[2] = "Arrays!";
		
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
		
	}
	
	public static String intArrayString(int[] a) {
		StringBuilder b = new StringBuilder();
		b.append("[");
		for (int i = 0; i < a.length; i++) {
			b.append(a[i]).append(", ");
		}
		b.append("]");
		return(b.toString());
	}
	
	

}
