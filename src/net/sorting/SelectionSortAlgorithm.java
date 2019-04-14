package net.sorting;

import java.util.List;

public class SelectionSortAlgorithm implements SortingAlgorithm {
	@Override
	public void execute(List<Float> floatList) {
		int size = floatList.size();
		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j < size; j++) {
				if (floatList.get(i) > floatList.get(j)) {
					float temp = floatList.get(i);
					floatList.set(i, floatList.get(j));
					floatList.set(j, temp);
				}
			}
		}
	}
}
