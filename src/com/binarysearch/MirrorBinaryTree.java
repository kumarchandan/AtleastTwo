package com.binarysearch;

// Write an Efficient Function to Convert a Binary Tree into its Mirror Tree

public class MirrorBinaryTree {
	//
	Node mirrorTree(Node node) throws RuntimeException {
		// Post-Order traversal
		if(node == null) {
			return null;
		}
		//
		mirrorTree(node.left);
		//
		mirrorTree(node.right);
		//
		System.out.println(node.data);
		// mirror it
		Node tempNode = node.left;
		node.left = node.right;
		node.right = tempNode;
		
		return node;
	}

	//
	public static void main(String args[]) {
		// Create a tree
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(7);
		//
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		node3.right = node7;
		
		MirrorBinaryTree mirrorBinaryTree = new MirrorBinaryTree();
		Node mirrorNode = mirrorBinaryTree.mirrorTree(node1);
		// Mirror Tree Root
		System.out.println(mirrorNode);
	}
}
