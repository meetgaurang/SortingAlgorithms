package net.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputFromConsole {
	Scanner in = new Scanner(System.in);
	/*
	 * Allows user to read 'N' number of float numbers from console
	 */
	List<Float> readFloatList() {
		List<Float> floatList = new ArrayList<Float>();
		System.out.println("Instructions");
		System.out.println("-------------");
		System.out.println("> Please enter N number of numeric inputs. Press 'Enter' for the new input");
		System.out.println("> Please enter non-numeric input to terminate\n");
		System.out.println("Inputs:");
		System.out.println("-------");
		while (in.hasNextFloat()) {
			floatList.add(in.nextFloat());
		}
		return floatList;
	}
	
	AlgorithmTypes readAlgorithmType() {
		System.out.println("> Please choose the algorithm");
		System.out.println("-----------------------------");
		System.out.println("1. Bubble Sort");
		System.out.println("2. Selection Sort");
		int input = 0;
		while (true) {
			System.out.print("Enter Algorithm (e.g. 1:) ");
			in.next();
			input = in.nextInt();
			if (input == 1 || input == 2) {
				break;
			}
		}
		in.close();
		return AlgorithmTypes.values()[input - 1];
	}
}
