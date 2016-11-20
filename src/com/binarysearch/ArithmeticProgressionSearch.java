package com.binarysearch;

// http://www.careercup.com/question?id=4798365246160896
// http://www.geeksforgeeks.org/find-missing-number-arithmetic-progression/

public class ArithmeticProgressionSearch {
	//
//	public int search(int[] inputArr) {
//		int low = 0;
//		int high = inputArr.length - 1;
//		int ap = (inputArr[high] - inputArr[low]) / inputArr.length;
//		int middle = -1;
//		while(low <= high) {
//			middle = (high + low) / 2;
//			if(inputArr[middle] == inputArr[0] + (middle * ap)) {
//				low = middle + 1;
//			} else if((inputArr[middle] > inputArr[0] + (middle * ap)) && inputArr[middle - 1] == inputArr[0] + ((middle-1)*ap)) {
//				return inputArr[0] + (middle * ap);
//			} else {
//				high = middle - 1;
//			}
//		}
//		return -1;
//	}
	
	// Find missing util
	public int findMissingUtil(int arr[], int low, int high, int diff) {
		// There must be two elements to find the missing
		if(high <= low) {
			return Integer.MAX_VALUE;
		}
		// Find index of middle element
		int mid = low + (high - low) / 2;
		//
		if(arr[mid + 1] - arr[mid] != diff) {
			return (arr[mid] + diff);
		}
		// If the elements till mid follow AP, then recur
	    // for right half
	    if (arr[mid] == arr[0] + mid*diff)
	        return findMissingUtil(arr, mid+1, high, diff);
	 
	    // Else recur for left half
	    return findMissingUtil(arr, low, mid-1, diff);
	}
	//
	int findMissing(int[] arr, int n)
	{
	    // If exactly one element is missing, then we can find
	    // difference of arithmetic progression using following
	    // formula.  Example, 2, 4, 6, 10, diff = (10-2)/4 = 2.
	    // The assumption in formula is that the difference is
	    // an integer.
	    int diff = (arr[n-1] - arr[0])/n;
	 
	    // Binary search for the missing number using above
	    // calculated diff
	    return findMissingUtil(arr, 0, n-1, diff);
	}
	//
	public static void main(String[] args) {
		//
		ArithmeticProgressionSearch search = new ArithmeticProgressionSearch();
		int arr[] = {2, 4, 8, 10, 12, 14};
		int len = arr.length;
		System.out.println(search.findMissing(arr, len));
	}
}
