package net.sorting;

import java.util.List;

/*
 * This is the main executor class 
 * */
public class MainExecutor {
	public static void main(String args[]) {
		SortingAlgorithm algorithm;
		InputFromConsole input = new InputFromConsole();
		List<Float> floatList = input.readFloatList();
		
		AlgorithmTypes type = input.readAlgorithmType();
		
		switch (type) {
			case BUBBLE_SORT:
				algorithm = new BubbleSort();
				break;
			case SELECTION_SORT:
				algorithm = new SelectionSort();
				break;
			default:
				algorithm = new BubbleSort();
		}
		algorithm.execute(floatList);
		System.out.println("\nHere is the sorted list using " + type + ": ");
		System.out.println(floatList);
	}
}
