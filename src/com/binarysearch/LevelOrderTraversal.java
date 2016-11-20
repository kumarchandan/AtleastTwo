package com.binarysearch;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//Recursive Java program for level order traversal of Binary Tree
class LevelOrderTraversal {
	//
	Queue<Node> queue = new LinkedList<Node>();
	Stack<Node> stack = new Stack<Node>();

	// Using Queue
	void traverseUsingQueue(Node root) {
		//
		if (root == null) {
			return;
		}
		// Start with root
		queue.add(root);
		//
		while (!queue.isEmpty()) {
			Node node = queue.remove();
			System.out.println(node.data);
			if (node.left != null) {
				queue.add(node.left);
			}
			if (node.right != null) {
				queue.add(node.right);
			}
		}
	}

	// Using Stack - TODO
	void traverseUsingStack(Node root) {
		//
		if (root == null) {
			return;
		}
		//
		stack.push(root);
		//
		while (!stack.isEmpty()) {
			Node node = stack.pop();
			System.out.println(node.data);

		}

	}

	// Main
	public static void main(String args[]) {
		// Create a tree
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(7);
		Node node8 = new Node(8);
		//
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node3.left = node7;
		node3.right = node5;
		node5.right = node6;
		node4.right = node8;

		//
		LevelOrderTraversal levelOrderTraversal = new LevelOrderTraversal();
		levelOrderTraversal.traverseUsingQueue(node1);

	}
}
