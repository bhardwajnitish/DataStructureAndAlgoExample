package com.nitish.ds;

public class BinaryTreeExample {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.add(5);
		tree.add(7);
		tree.add(3);
		tree.add(9);
		tree.add(2);
		tree.add(6);

		tree.preOrderTransversal(node);
	}

	private static class BinaryTree {
		private Node node;

		public BinaryTree() {
			this.node = null;
		}

		public void add(int value) {
			if (this.node == null) {
				this.node = new Node();
				this.node.value = value;
				this.node.left = null;
				this.node.right = null;
			} else {
				Node temp = this.node;
				this.node = new Node();
				this.node.value = value;
				this.node.left = temp;

			}
		}

		public Node get(int value) {
			return this.node;
		}

		public void preOrderTransversal(Node node) {
			if (node.left == null) {
				System.out.println("1st node - " + node.value);
				return;
			}
			System.out.println("Node - " + node.value);
			this.preOrderTransversal(node.left);

		}

		private static class Node {
			int value;
			Node left;
			Node right;

		}
	}

}
