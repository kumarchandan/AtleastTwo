package com.binarysearch;

// Find the node with minimum value in BST

public class MinValueInBST {
	//
	int getMinValue(Node root) throws RuntimeException {
		//
		if (root == null) {
			return -1;
		}
		//
		Node node = root.left;
		while (node.left != null) {
			node = node.left;
		}
		return node.data;
	}

	//
	int getMaxValue(Node root) throws RuntimeException {
		//
		if(root == null) {
			return -1;
		}
		//
		if (root.right == null) {
			return root.data;
		}
		//
		Node node = root.right;
		while (node.right != null) {
			node = node.right;
		}
		return node.data;
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

		MinValueInBST minValueInBST = new MinValueInBST();
		int minValue = minValueInBST.getMinValue(node20);
		System.out.println("Min value of BST is: " + minValue);
		int maxValue = minValueInBST.getMaxValue(node20);
		System.out.println("Max value of BST is: " + maxValue);
	}
}
