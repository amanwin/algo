package com.bst;

public class BSTProgram {

	// insertion
	// searching
	// deletion

	// 6 --> 5 --> 8

	static class BST {
		public int value;
		public BST left;
		public BST right;

		public BST(int value) {
			this.value = value;
		}

		// Worst:O(n) time | O(n) space
		public BST insert(int value) {
			if (value < this.value) {
				if (left == null) {
					BST newBST = new BST(value);
					left = newBST;
				} else {
					left.insert(value);
				}
			} else {
				if (right == null) {
					BST newBST = new BST(value);
					right = newBST;
				} else {
					right.insert(value);
				}
			}
			return this;
		}
		
		//search a value in BST
		public boolean contains(int value) {
			if(value < this.value) {
				if(left == null)
					return false;
				else 
					return left.contains(value);
			} else if(value > this.value) {
				if(right == null) {
					return false;
				} else {
					return right.contains(value);
				}
			} else {
				return true;
			}
		}

		@Override
		public String toString() {
			return "BST [value=" + value + ", left=" + left + ", right=" + right + "]";
		}

	}

	public static void main(String[] args) {
		int[] items = { 6, 3, 8, 2, 5 };
		// The below line creates a BST with root node 7 with left and right as null
		BSTProgram.BST bst = new BST(7);
		/*for (int i = 0; i < items.length; i++) {
			bst.insert(items[i]);
		}*/
		bst.insert(6).insert(3).insert(8).insert(2).insert(5);
		System.out.println("BST created : ");
		System.out.println(bst);
		System.out.println("Searching 2 in bst : "+bst.contains(2));
		System.out.println("Searching 1 in bst : "+bst.contains(1));
	}
}
