package com.nitish.algo;

import java.util.Stack;

public class BinaryTreePreOrder {

	public static void main(String[] args) {
		TreeNode rootNode = createBinaryTree();
		System.out.println("PreOrder trasversal with recursive -----------");
		preOrderRecursive(rootNode);

		System.out.println("PreOrder trasversal with iterative -----------");
		preOrderIterative(rootNode);
	}

	private static class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;

		public TreeNode(int data) {
			this.data = data;
		}

	}

	/*
	 * 					  40
	 * 			20					10
	 * 		30		60			50		70
	 */

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

	private static void preOrderRecursive(TreeNode node) {
		if (node != null) {
			System.out.println("Value = " + node.data);
			preOrderRecursive(node.left);
			preOrderRecursive(node.right);

		}
	}

	private static void preOrderIterative(TreeNode node) {
		if (node == null) {
			return;
		}
		Stack<TreeNode> stack = new Stack<>();
		stack.push(node);
		while (!stack.isEmpty()) {
			TreeNode tempNode = stack.pop();
			System.out.println("Value - " + tempNode.data);

			if (tempNode.right != null) {
				stack.push(tempNode.right);
			}
			if (tempNode.left != null) {
				stack.push(tempNode.left);
			}
		}
	}

}
