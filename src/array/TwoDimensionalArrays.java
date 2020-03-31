package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class TwoDimensionalArrays {
	
	public static void main(String[] args) {
	
		// array initalizer 
		
		int[] numbers = {1, 3, 5};
		
		// don't have to say new - Java can figure out the memory need on its own
		// don't have to give a size - Java uses the size of the initalizer
		
		// can't assign just the beginning of a larger array;
		// initializer can only be used on declaration
		
		System.out.println(Arrays.toString(numbers));
		
		String[] words = {"Hello", "World"};
		
		System.out.println(Arrays.toString(words));
		
		
		int[][] numberGrid = {{1, 2, 3}, {4, 5, 6}, {7, 8,9}};
		System.out.println(Arrays.toString(numberGrid));
		
		for (int i = 0; i < numberGrid.length; i++) {
			// use nested for loops to handle 2d arrays
			for (int j = 0; j < numberGrid[i].length; j++) {
				System.out.print(numberGrid[i][j]);
				// use ref[outer][inner]
			}
			System.out.println();
		}
		
		// create times table (up to 5)
		int[][] times = new int[13][13];
		
		for (int i = 0; i < times.length; i++) {
			for (int j = 0; j < times[i].length; j++) {
				times[i][j] = i * j;
			}
		}
		
		for (int i = 0; i < times.length; i++) {
			for (int j = 0; j < times[i].length; j++) {
				System.out.print(times[i][j] + " ");
			}
			System.out.println();
		}
		
		
		int[][][] threeD = new int[5][5][5];
		for (int i = 0; i < threeD.length; i++) {
			for (int j = 0; j < threeD[i].length; j++) {
				for (int k = 0; k < threeD[i][j].length; k++) {
					threeD[i][j][k] = i * j * k;
				}
			}
		}
		
		for (int i = 0; i < threeD.length; i++) {
			for (int j = 0; j < threeD[i].length; j++) {
				for (int k = 0; k < threeD[i][j].length; k++) {
					System.out.print(threeD[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
		ArrayList<ArrayList<String>> wordGrid = new ArrayList<ArrayList<String>>();
		wordGrid.add(new ArrayList<String>());
		wordGrid.get(0).add("Hello");
		wordGrid.get(0).add("World");
		wordGrid.add(new ArrayList<String>());
		wordGrid.get(1).add("COMP");
		wordGrid.get(1).add("1502");
		
		System.out.println(wordGrid);
		
		for (int i = 0; i < wordGrid.size(); i++) {
			for (int j = 0; j < wordGrid.size(); j++) {
				System.out.print(wordGrid.get(i).get(j) + " ");
			}
			System.out.println();
		}
		
		
		
		
		WordLength w = new WordLength();
		w.add(3, "cat");
		w.add(3, "dog");
		w.add(3, "eel");
		w.add(5, "hello");
		w.add(5, "world");
		w.add(4, "comp");
		w.add(4, "1502");
		
		System.out.println(w);
		
		
		
	}

}
