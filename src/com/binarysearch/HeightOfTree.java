package com.binarysearch;

/** 
 * Find height of a given tree.
**/
public class HeightOfTree {
	// getHeight
	int getHeight(Node node) {
		//
		if(node == null) {
			return 0;
		}
		//
		int leftChildHeight = getHeight(node.left);
		int rightChildHeight = getHeight(node.right);
		//
		if(leftChildHeight > rightChildHeight) {
			return leftChildHeight + 1;
		} else {
			return rightChildHeight + 1;
		}
	}
	
	
	//
	public static void main(String args[]) {
		// Create a tree
		Node node1 = new Node(1);
		node1.left = new Node(2);
		node1.right = new Node(3);
		node1.left.left = new Node(4);
		node1.left.right = new Node(5);
		node1.right.left = new Node(6);
		node1.left.right.right = new Node(7);
		node1.left.right.right.left = new Node(8);
		
		//
		HeightOfTree heightOfTree = new HeightOfTree();
		int height = heightOfTree.getHeight(node1);
		System.out.println("Height of tree is : " + height);
	}
}
