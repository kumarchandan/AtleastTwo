package com.array;

// 1) Add two numbers which are given in form of Array.

public class ArrayAddition {
	//
	public int[] add(int[] arr1, int[] arr2) {
		//
		int maxLen = Math.max(arr1.length, arr2.length);
		int[] arr3 = new int[maxLen];
		int i = arr1.length - 1;
		int j = arr2.length - 1;
		maxLen -= 1;
		int extra = 0;
		int sum = 0;
		//
		while(i >= 0 && j >= 0) {
			sum = arr1[i] + arr2[j] + extra;
			extra = sum / 10;
			arr3[maxLen] = sum % 10;
			//
			i -= 1;
			j -= 1;
			maxLen -= 1;
		}
		//
		while(i >= 0) {
			sum = arr1[i] + extra;
			extra = sum / 10;
			arr3[maxLen] = sum % 10;
			//
			i -= 1;
			maxLen -= 1;
		}
		//
		while(j >= 0) {
			sum = arr2[j] + extra;
			extra = sum / 10;
			arr3[maxLen] = sum % 10;
			//
			j -= 1;
			maxLen -= 1;
		}
		//
		if(extra != 0) {
			int[] arr4 = new int[arr3.length + 1];
			for(int k = arr4.length - 1; k > 0; k--) {
				arr4[k] = arr3[k - 1];
			}
			//
			arr4[0] = extra;
			return arr4;
		}
		//
		return arr3;
	}
	
	//
	public static void main(String[] args) {
		ArrayAddition arrayAddition = new ArrayAddition();
		int arr1[] = {9,9,9,9,9,9,9};
        int arr2[] = {1,6,8,2,6,7};
        int[] result = arrayAddition.add(arr1, arr2);
        
        for(int i = 0; i < result.length; i++) {
        	System.out.println(result[i]);
        }
	}
}













