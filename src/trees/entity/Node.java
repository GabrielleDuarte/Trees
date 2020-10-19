package trees.entity;

import java.util.ArrayList;
import java.util.List;

public class Node {
	private int value;
	private Node left; 
	private Node right;
	public List<Integer> h = new ArrayList<Integer>();
	
	public Node(int value) {
		super();
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}


	public boolean isLeaf() {
		return left == null && right == null;
	}

	public boolean hasLeft() {
		return left != null;
	}

	public boolean hasRight() {
		return right != null;
	}

//	public int countChild() {
//		if(hasLeft() && hasLeft()) {
//			return 2;
//		}
//		else if(!hasLeft() || !hasRight()) {
//			return 1;
//		}
//		else {
//			return 0;
//		} 
//	}
	
}
