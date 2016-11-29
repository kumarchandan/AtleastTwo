package com.binarysearch;

import java.util.Stack;

public class InOrderTraversalStack {
	//
	void traverse(Node node) {
		//
		Stack<Node> stack = new Stack<>();
		
		while(true) {
			//
			while(node != null) {
				stack.push(node);
				node = node.left;
			}
			//
			if(stack.isEmpty()) {
				return;
			}
			//
			node = stack.pop();
			System.out.println(node.data);
			node = node.right;
			
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
		
		InOrderTraversalStack inOrderTraversalStack = new InOrderTraversalStack();
		inOrderTraversalStack.traverse(node1);

	}
}
