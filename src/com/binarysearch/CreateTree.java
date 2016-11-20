package com.binarysearch;

import java.util.ArrayList;

// Helper class : to create tree

public class CreateTree {
	// Create Tree
	public static ArrayList<Node> createTree(int[] arr) {
		//
		ArrayList<Node> arrayList = new ArrayList<Node>();
		//
		for (int i = 0; i < arr.length; i++) {
			arrayList.add(new Node(arr[i]));
		}
		return arrayList;
	}
	
	// Main
	public static void main(String args[]) {
		int arr[] = { 1,2,3,4,5 };
		CreateTree.createTree(arr);
	}
}
