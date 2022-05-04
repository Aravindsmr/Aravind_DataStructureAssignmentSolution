/**
 * 
 */
package com.greatlearning.questiontwo;

/**
 * @author Aravind
 *
 */
public class BSTtoSkewed {

	/**
	 * @param args
	 */
	public static Node node;
	static Node lastNode;
	static Node head;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BSTtoSkewed.node = new Node(50);
		BSTtoSkewed.node.left = new Node(30);
		BSTtoSkewed.node.right = new Node(60);
		BSTtoSkewed.node.left.left = new Node(10);
		BSTtoSkewed.node.right.left = new Node(55);

		toSkewed(node); // converts BST to Skewed tree
		traverseSkewed(head); // prints the Skewed tree
	}

	static class Node {

		int data;
		Node left, right;

		Node(int data) {

			this.data = data;
			this.right = null;
			this.left = null;
		}
	}

	// function to convert the BST to Skewed tree in increasing order
	public static void toSkewed(Node root) {

		if (root == null) {
			return;
		}

		toSkewed(root.left); // recursion of left subtree

		Node rightNode = root.right;

		// condition to check if head is defined in skewed tree
		if (head == null) {
			head = root;
			root.left = null;
			lastNode = root;
		} else {
			lastNode.right = root;
			root.left = null;
			lastNode = root;
		}

		toSkewed(rightNode); // recursion of right sub tree
	}

	// traverse skewed tree and print the nodes
	static void traverseSkewed(Node root) {

		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		traverseSkewed(root.right);
	}

}
