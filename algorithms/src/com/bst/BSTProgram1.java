package com.bst;

public class BSTProgram1 {

	static class BST {
		public int value;
		public BST left;
		public BST right;
		
		public BST(int value) {
			this.value = value;
		}
		
		public BST insert(int value) {
			if(value < this.value) {
				if(left == null) {
					BST newBST = new BST(value);
					left = newBST;
				} else {
					left.insert(value);
				}
			} else {
				if(right == null) {
					BST newBST = new BST(value);
					right = newBST;
				} else {
					right.insert(value);
				}
				
			}
			return this;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
