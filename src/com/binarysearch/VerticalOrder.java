package com.binarysearch;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/**
 * Q. Print a Binary Tree in Vertical Order
 * A. Do Inorder traversal.
 * 	  While traversing the tree, we can recursively calculate horizontal distance(hd). We initially pass the hd as 0 for root.
 *    For left subtree, we pass ,hd = hd of root--
 *    For right subtree, we pass, hd = hd of root++
 *    For every hd value, we maintain a list of nodes in TreeMap.
 *    Whenever we see a node in traversal, we go to the TreeMap entry and add the node to the TreeMap using hd as a key in Map.

**/
// Vertical Order

class VerticalOrder {
	//
	public static TreeMap<Integer, ArrayList> treeMap = new TreeMap<>();
	//
	public Node vertical(Node node, int level) {
		//
		if(node == null) {
			return null;
		}
		// InOrder Traversal
		// Traverse Left First
		Node left = vertical(node.left, level-=1);
		// Restore level state
		if(left == null) {
			level+=1;
		}
		// on Root, Store value and level
		if(treeMap.get(level) == null) {
			ArrayList<Integer> valueArr = new ArrayList<>();
			valueArr.add(node.data);
			treeMap.put(level, valueArr);
		} else {
			ArrayList<Integer> valueArr = treeMap.get(level);
			valueArr.add(node.data);
			treeMap.put(level, valueArr);
		}
		// Traverse Right
		return vertical(node.right, level+=1);
	}
	
	// Print values
	public void print() {
		//
		Set<Integer> values = treeMap.keySet();
		for (Integer integer : values) {
			System.out.println(treeMap.get(integer));
		}
	}
	
	// Main Class
	public static void main(String args[]) {
		//
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
		//
		VerticalOrder verticalOrder = new VerticalOrder();
		verticalOrder.vertical(node1, 0);
		verticalOrder.print();
	}
}



















