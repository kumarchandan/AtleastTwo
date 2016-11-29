package com.binarysearch;

import java.util.ArrayList;

// A program to check if a binary tree is BST or not

public class IsBST {
	//
	ArrayList<Integer> arrayList = new ArrayList<Integer>();
	//
	boolean isBST(Node node) {
		traverseInOrder(node);
		
		for (int i = 1; i < arrayList.size(); i++) {
			if(arrayList.get(i - 1) > arrayList.get(i)) {
				return false;
			}
		}
		return true;
	}
	
	//
	void traverseInOrder(Node node) {
		//
		if(node == null) {
			return;
		}
		//
		traverseInOrder(node.left);
		this.arrayList.add(node.data);
		traverseInOrder(node.right);
	}
	
	// Main
	public static void main(String args[]) {
		// Create tree
		Node node20 = new Node(20);
		Node node8 = new Node(8);
		Node node22 = new Node(22);
		Node node4 = new Node(4);
		Node node12 = new Node(12);
		Node node10 = new Node(10);
		Node node14 = new Node(14);

		node20.left = node8;
		node20.right = node22;
		node8.left = node4;
		node8.right = node12;
		node12.left = node10;
		node12.right = node14;
		
		IsBST isBST = new IsBST();
		boolean result = isBST.isBST(node20);
		System.out.println(result);
	}
}
