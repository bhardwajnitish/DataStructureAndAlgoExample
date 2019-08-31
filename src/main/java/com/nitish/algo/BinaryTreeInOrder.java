package com.nitish.algo;

import java.util.Stack;

/**
 * left -> head -> right
 * @author Lenovo
 *
 */
public class BinaryTreeInOrder {

	public static void main(String[] args) {
		TreeNode node = createBinaryTree();
		System.out.println("InOrder Traversal recursive-------------");
		inOrderTraversalRecursive(node);

		System.out.println("InOrder Traversal iterative-------------");
		inOrderTraversalIterative(node);
	}

	private static class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;

		public TreeNode(int data) {
			this.data = data;
		}

	}

	private static TreeNode createBinaryTree() {
		TreeNode rootNode = new TreeNode(40);
		TreeNode node20 = new TreeNode(20);
		TreeNode node10 = new TreeNode(10);
		TreeNode node30 = new TreeNode(30);
		TreeNode node60 = new TreeNode(60);
		TreeNode node50 = new TreeNode(50);
		TreeNode node70 = new TreeNode(70);

		rootNode.left = node20;
		rootNode.right = node10;

		node20.left = node30;
		node20.right = node60;

		node10.left = node50;
		node10.right = node70;

		return rootNode;
	}

	/*
	 * 					  40
	 * 
	 * 				20			10
	 * 
	 * 			30	   60	 50		70
	 * 
	 * --------------- Output-------------------------------
	 * 
	 * 	30, 20, 60, 40, 50, 10, 70
	 */

	private static void inOrderTraversalRecursive(TreeNode node) {
		if (node != null) {
			inOrderTraversalRecursive(node.left);

			System.out.println("Value - " + node.data);

			inOrderTraversalRecursive(node.right);
		}
	}

	private static void inOrderTraversalIterative(TreeNode node) {
		if (node != null) {
			Stack<TreeNode> stack = new Stack<>();
			TreeNode currentNode = node;
			while (!stack.isEmpty() || currentNode != null) {
				if (currentNode != null) {
					stack.push(currentNode);
					currentNode = currentNode.left;
				} else {
					TreeNode tempNode = stack.pop();
					System.out.println("Value - " + tempNode.data);
					currentNode = tempNode.right;
				}
			}
		}
	}

}
