package com.binarysearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

//Recursive Java program for level order traversal of Binary Tree
class TopView {
	//
	Queue<Node> queue = new LinkedList<Node>();
	HashMap<Integer, Node> hashMap = new HashMap<>();

	// Using Queue
	HashMap<Integer, Node> topView(Node root) {
		//
		if (root == null) {
			return null;
		}
		// Start with root
		queue.add(root);
		int level = 0;
		//
		while (!queue.isEmpty()) {
			Node node = queue.remove();
			System.out.println(node.data);
			//
			if (!hashMap.containsKey(level)) {
				hashMap.put(level, node);
			}
			if (node.left != null) {
				level -= 1;
				queue.add(node.left);

			}
			if (node.right != null) {
				level += 1;
				queue.add(node.right);
			}
		}
		return hashMap;
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
		node2.right = node5;
		node3.left = node6;
		node3.right = node7;

		//
		TopView topView = new TopView();
		HashMap<Integer, Node> hashMap = topView.topView(node1);
		// Print the elements
		for (HashMap.Entry<Integer, Node> set : hashMap.entrySet()) {
			System.out.println(set.getKey().intValue() + " : " + set.getValue().data);
		}

	}
}
