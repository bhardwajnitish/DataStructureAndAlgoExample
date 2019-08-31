package com.nitish.algo;

import java.util.Stack;

/**
 * left -> right -> head
 * @author Lenovo
 *
 */
public class BinaryTreePostOrder {

	public static void main(String[] args) {
		TreeNode rootNode = createBinaryTree();
		postOrderTraversalResursive(rootNode);
		System.out.println("\n---------------------------------------\n\n");
		postOrderTraversalIterative(rootNode);

		System.out.println("\n---------------------------------------\n\n");

		postOrderTraversalIterative1(rootNode);
	}

	private static class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;

		public TreeNode(int data) {
			this.data = data;
		}

		@Override
		public String toString() {
			return "TreeNode [data=" + this.data + "]";
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
	 * 				40
	 * 		   20         10
	 * 	   30     60   50     70
	 * 
	 * --------------- Output ----------------------
	 * 
	 * 30, 60, 20, 50, 70, 10, 40
	 */

	private static void postOrderTraversalResursive(TreeNode node) {
		if (node != null) {
			postOrderTraversalResursive(node.left);
			postOrderTraversalResursive(node.right);
			System.out.print(node.data + " ");
		}
	}

	private static void postOrderTraversalIterative(TreeNode node) {
		if (node != null) {
			Stack<TreeNode> stack = new Stack<>();
			TreeNode currentNode = node;
			while (true) {
				if (currentNode != null) {
					if (currentNode.right != null) {
						stack.push(currentNode.right);
					}
					stack.push(currentNode);
					currentNode = currentNode.left;
					continue;
				}
				if (stack.isEmpty()) {
					return;
				}
				currentNode = stack.pop();

				if (currentNode.right != null && !stack.isEmpty() && currentNode.right == stack.peek()) {
					stack.pop();
					stack.push(currentNode);
					currentNode = currentNode.right;
				} else {
					System.out.print(currentNode.data + " ");
					currentNode = null;
				}
			}

		}
	}

	private static void postOrderTraversalIterative1(TreeNode node) {
		Stack<TreeNode> stack1 = new Stack<>();
		Stack<TreeNode> stack2 = new Stack<>();
		if (node != null) {
			stack1.push(node);
			while (!stack1.isEmpty()) {
				TreeNode currentNode = stack1.pop();
				stack2.push(currentNode);
				if (currentNode.left != null) {
					stack1.push(currentNode.left);
				}
				if (currentNode.right != null) {
					stack1.push(currentNode.right);
				}
			}
		}
		while (!stack2.isEmpty()) {
			System.out.print(stack2.pop().data + " ");
		}
	}

}
