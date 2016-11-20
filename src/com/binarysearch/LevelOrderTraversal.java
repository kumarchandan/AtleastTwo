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
		if(root == null) {
			return;
		}
		// Start with root :)
		queue.add(root);
		//
		while(!queue.isEmpty()) {
			Node node = queue.remove();
			System.out.println(node.data);
			if(node.left != null) {
				queue.add(node.left);
			}
			if(node.right != null) {
				queue.add(node.right);
			}
		}
	}
	
	// Using Stack	- TODO
	void traverseUsingStack(Node root) {
		//
		if(root == null) {
			return;
		}
		//
		stack.push(root);
		//
		while(!stack.isEmpty()) {
			Node node = stack.pop();
			System.out.println(node.data);
			
		}
		
	}
	
	// Main
	public static void main(String args[]) {
		// Create a tree
		Node node1 = new Node(1);
		node1.left = new Node(2);
		node1.right = new Node(3);
		node1.left.left = new Node(4);
		node1.left.right = new Node(5);
		node1.right.left = new Node(6);
		
		//
		LevelOrderTraversal levelOrderTraversal = new LevelOrderTraversal();
		levelOrderTraversal.traverseUsingQueue(node1);
		
	}
}
