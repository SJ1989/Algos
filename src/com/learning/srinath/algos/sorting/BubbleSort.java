package com.learning.srinath.algos.sorting;

import com.learning.srinath.util.PrintUtils;
import com.learning.srinath.util.SortUtils;

//Time Complexity - O(n^2)
public class BubbleSort {
	public static int[] sort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j] > arr[j+1]) {
					SortUtils.swap(j, j+1, arr);
				}
			}
		}
		return arr;
	}
	
	public static void bubbleSort_test(int[] arr) {
		System.out.println();
		System.out.println("Performing Bubble Sort ....");
		System.out.print("Input -> ");
		PrintUtils.printArray(arr);
		System.out.println();
		System.out.print("Output -> ");
		PrintUtils.printArray(BubbleSort.sort(arr));
	}
}
