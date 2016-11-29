package com.binarysearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// Write a function to print spiral(zig-zag) order traversal of a tree.

// http://stackoverflow.com/questions/17485773/print-level-order-traversal-of-binary-tree-in-zigzag-manner


public class ZigzagLevelTraversal {
	//
	Queue<Node> queue = new LinkedList<Node>();
	ArrayList<Node> arrayList = new ArrayList<>();

	//
	void spiralTraverse(Node root) {
		//
		Stack<Integer> stack = new Stack<>();
		
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
		Node node9 = new Node(9);
		Node node10 = new Node(10);
		Node node11 = new Node(11);
		//
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node4.left = node6;
		node4.right = node7;
		node5.left = node8;
		node5.right = node9;
		node3.right = node10;
		node10.right = node11;

		//
		ZigzagLevelTraversal zigzagLevelTraversal = new ZigzagLevelTraversal();
		zigzagLevelTraversal.spiralTraverse(node1);
	}
}
