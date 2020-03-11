package array;

import java.util.ArrayList;
import java.util.Arrays;

public class CopyProblems {

	public static void main(String[] args) {

		
		String x = "Hello";
		x = x + " World";
		
		Data d1 = new Data(45, "Fluffy");
		System.out.println(d1);
		
		Data d2 = d1;
		
		System.out.println("D1-" + d1);
		System.out.println("D2-" + d2);
		
		d2.setScore(100);
		
		System.out.println("D1-" + d1);
		System.out.println("D2-" + d2);
		
		d1.setScore(0);
		
		System.out.println("D1-" + d1);
		System.out.println("D2-" + d2);
		
		MiniData mini1 = d1.getMini();
		System.out.println("Mini1-" + mini1);
		mini1.setMiniValue(2000);
		
		System.out.println("D1-" + d1);
		System.out.println("D2-" + d2);
		System.out.println("Mini1-" + mini1);
		
		Data d3 = new Data(d1);
		d3.setScore(300);
		System.out.println("D1-" + d1);
		System.out.println("D2-" + d2);
		System.out.println("D3-" + d3);
		
		
		Data[] dataArray = new Data[5];
		dataArray[0] = new Data(75, "Rover");
		dataArray[1] = new Data(82, "Kippers");
		
		Arrays.toString(dataArray);
		
		printDataArray(dataArray);
		
		Data[] dataArray2 = dataArray;
		printDataArray(dataArray2);
		dataArray[3] = new Data(99, "Muffin");
		
		System.out.println("----");
		printDataArray(dataArray);
		printDataArray(dataArray2);
		
		ArrayList<Data> ald = new ArrayList<>();
		ald.add(new Data(101, "Bob"));
		ald.add(new Data(102, "Sam"));
		ald.add(new Data(103, "Cat"));
		
		ArrayList<Data> ald2 = ald;
		
		System.out.println(ald);
		System.out.println(ald2);
		
		ald2.add(new Data(104, "Dog"));
		
		System.out.println(ald);
		System.out.println(ald2);
		
		ArrayList<Data> ald3 = new ArrayList<>(ald);
		
		ald3.add(new Data(104, "Pip"));
		
		System.out.println(ald);
		System.out.println(ald2);
		System.out.println(ald3);
		
		
		
		
	}
	
	public static void printDataArray(Data[] data) {
		for  (int i = 0; i < data.length; i++) {
			System.out.println("Data[" + i + "] " + data[i]);
		}
	}
	
	public static Data[] deepCopyData(Data[] data) {
		Data[] newData = new Data[data.length];
		for (int i = 0; i < data.length; i++) {
			// sometimes a shallow copy here is 
			// desired or useful, sometimes
			// you need a full deep copy
			newData[i] = new Data(data[i]);
		}
		return newData;
	}

}
