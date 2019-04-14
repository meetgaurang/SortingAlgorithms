package net.sorting;

import java.util.List;

public class BubbleSortAlgoritham implements SortingAlgorithm {
	/*
	 * Sort the given list. Best case complexity: O(N) Worst case complexity: O(N^2)
	 */
	@Override
	public void execute(List<Float> floatList) {
		int size = floatList.size();
		for (int i = 0; i < size; i++) {
			boolean swapped = false;
			for (int j = 0; j < size - i - 1; j++) {
				if (floatList.get(j) > floatList.get(j + 1)) {
					// Swap the numbers
					Float temp = floatList.get(j);
					floatList.set(j, floatList.get(j + 1));
					floatList.set(j + 1, temp);
					swapped = true;
				}
			}
			// Check whether list is already sorted
			if (swapped == false) {
				break;
			}
		}
	}
}
