package com.array;

// http://www.geeksforgeeks.org/check-if-array-elements-are-consecutive/
// Given an array of elements check if elements in the array are consecutive or not.


public class CheckIfArrayElementsAreConsecutive {
	//
	public boolean checkConsecutive(int[] arr) {
		//
		boolean isConsecutive = false;
		//
		int len = arr.length;
		int Max = getMax(arr);
		int Min = getMin(arr);
		//
		if(Max - Min + 1 == len) {
			isConsecutive = true;
		}
		// Check Uniqueness
		if(checkUniqueness(arr)) {
			isConsecutive = true;
		} else {
			isConsecutive = false;
		}
		//
		return isConsecutive;
	}
	
	// getMax
	private int getMax(int[] arr) {
		int Max = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > Max) {
				Max = arr[i];
			}
		}
		return Max;
	}
	
	// getMin
	private int getMin(int[] arr) {
		int Min = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < Min) {
				Min = arr[i];
			}
		}
		return Min;
	}
	
	//
	private boolean checkUniqueness(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			if(arr[i - 1] == arr[i]) {
				return false;
			}
		}
		return true;
	}
	
	//
	public static void main(String[] args) {
		//
		int[] arr = { 83, 78, 80, 81, 79, 82 };
		int[] arr2 = { 7, 6, 5, 5, 3, 4 };
		
		CheckIfArrayElementsAreConsecutive consecutive = new CheckIfArrayElementsAreConsecutive();
		System.out.println(consecutive.checkConsecutive(arr));
		System.out.println(consecutive.checkConsecutive(arr2));
	}
}
