package com.dynamicpro;

// http://www.geeksforgeeks.org/dynamic-programming-set-4-longest-common-subsequence/

public class LongestCommonSubsequence {
	
	//
	public int lcsDynamic(char str1[], char str2[]) {
		//
		int max = 0;
		int[][] temp = new int[str1.length + 1][str2.length + 1];
		
		for (int i = 1; i < temp.length; i++) {
			for (int j = 1; j < temp[i].length; j++) {
				// If elements equal
				if(str1[i - 1] == str2[j - 1]) {
					temp[i][j] = temp[i - 1][j - 1] + 1;
				} else {
					temp[i][j] = Math.max(temp[i-1][j], temp[i][j-1]);
				}
				// Record max till now
				if(temp[i][j] > max) {
					max = temp[i][j];
				}
			}
		}
		
		return max;
	}
	
	//
	public static void main(String[] args) {
		LongestCommonSubsequence lcs = new LongestCommonSubsequence();
		String str2 = "abcdaf";
        String str1 = "acbcf";
        
        int result = lcs.lcsDynamic(str1.toCharArray(), str2.toCharArray());
        System.out.println(' ');
        System.out.println(result);
	}
}
