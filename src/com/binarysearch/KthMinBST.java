package com.binarysearch;

import java.util.ArrayList;

// K’th smallest element in BST

//K’th smallest element in BST using O(1) Extra Space

public class KthMinBST {
	//
	static ArrayList<Integer> arrayList = new ArrayList<>();
	//
	int getKthMin(Node node, int index) {
		// Do Inorder traversal
		traverseInOrder(node);
		//
		int count = 0;
		for (Integer integer : arrayList) {
			count++;
			if(count == index) {
				return integer.intValue();
			}
		}
		return -1;
	}
	
	// Traverse Inorder and save data in arrayList
	void traverseInOrder(Node node) {
		//
		if(node == null) {
			return;
		}
		//
		traverseInOrder(node.left);
		arrayList.add(node.data);
		traverseInOrder(node.right);
	}
	

	//
	public static void main(String args[]) {
		// Create a tree
		Node node20 = new Node(20);
		Node node22 = new Node(22);
		Node node8 = new Node(8);
		Node node12 = new Node(12);
		Node node4 = new Node(4);
		Node node10 = new Node(10);
		Node node14 = new Node(14);
		//
		node20.left = node8;
		node20.right = node22;
		node8.left = node4;
		node8.right = node12;
		node12.left = node10;
		node12.right = node14;
		
		// U
		KthMinBST kthMinBST = new KthMinBST();
		int minValue = kthMinBST.getKthMin(node20, 5);
		System.out.println(minValue);
		
	}
}
