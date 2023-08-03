package com.aasif.arrays;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 2, 3, 3 };
		int newSize = RemoveDuplicates.removeDuplicatesOptimal(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static int removeDuplicatesOptimal(int[] arr) {
		int i = 0;
		for (int j = 0; j < arr.length; j++) {
			if (arr[i] != arr[j]) {
				swap(arr, ++i, j);
			}
		}
		return i+1;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return;
	}

	private static int removeDuplicatesBruteForce(int[] arr) {
		Set<Integer> linkedHashSet = new LinkedHashSet<>();
		for (int a : arr) {
			linkedHashSet.add(a);
		}
		int i = 0;
		for (int a : linkedHashSet) {
			arr[i++] = a;
		}
		return i + 1;
	}

}
