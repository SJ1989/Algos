package com.learning.srinath.algos.search;

import com.learning.srinath.util.PrintUtils;

public class BinarySearch {
	public static int search(int s_pos, int e_pos, int x, int[] arr) {
		try{
			if(s_pos < 0 || e_pos < 0) return -1;
			
			if(arr == null || arr.length == 0) return -1;
			
			if(e_pos < s_pos) return -1;
			
			int m_pos = (s_pos + e_pos) / 2;
			System.out.println("m_pos -> "+m_pos);
			if(x == arr[m_pos]) return m_pos;
			
			if(x > arr[m_pos]) return search(m_pos+1, e_pos, x, arr);
			
			return search(s_pos, m_pos-1, x, arr);
		} catch(NullPointerException e) {
			System.out.println("Null Pointer Exception -> "+e);
			return -1;
		} catch(Exception e) {
			System.out.println("Null Pointer Exception -> "+e);
			return -1;
		}
		
	}
	
	public static void search_test(int x, int[] arr) {
		System.out.println();
		System.out.println("Performing Binary Search ....");
		System.out.println("Searching for -> "+x);
		System.out.print("Test Data -> ");
		PrintUtils.printArray(arr);
		System.out.println();
		int index = BinarySearch.search(0, arr.length - 1, x, arr);
		if(index != -1) {
			System.out.println("Element Found at index -> "+index);
		} else {
			System.out.println("Element Not Found");
		}
	}
	
	private static void print(Object obj) {
		System.out.println(obj);
	}
}
