package com.learning.srinath.util;

public class SortUtils {
	public static int[] swap(int i, int j, int[] arr) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
		return arr;
	}
}
