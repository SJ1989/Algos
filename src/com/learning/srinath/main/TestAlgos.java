package com.learning.srinath.main;

import com.learning.srinath.algos.search.BinarySearch;
import com.learning.srinath.algos.sorting.BubbleSort;
import com.srinath.learning.testData.TestData;

public class TestAlgos {
	public static void main(String[] args) {
		System.out.println("Testing Algos .....");
		
		BinarySearch.search_test(23, TestData.sorted_arr_1);
		BinarySearch.search_test(5, TestData.sorted_arr_duplicates_1);
		
		BubbleSort.bubbleSort_test(TestData.unSorted_arr_2);
		BubbleSort.bubbleSort_test(TestData.unSorted_arr_duplicates_1);
	}
}
