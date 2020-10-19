package trees.entity;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;

public class BinaryTree1 {
	
	private Node root;
	
	private Node getNode(Node node, int value) {
		if (value == node.getValue()) {
			return node;
		} else {
			if (value < node.getValue()) {
				if (node.hasLeft()) {
					return getNode(node.getLeft(), value);
				} else {
					return node;
				}
			} else {
				if (node.hasRight()) {
					return getNode(node.getRight() , value);
				} else {
					return node;
				}
			}
		}
	}
	
	public void add1(int value) {
		if (root == null) {
			root = new Node(value);
		}
		else {
			Node node = getNode(root, value);
			if (value != node.getValue()) {
				Node newNode = new Node(value);
				if (value < node.getValue()) {
					node.setLeft(newNode);
				} else {
					node.setRight(newNode);
				}
			}
		}
	}
	
	public int nodeLeafCount2(Node n) {
		if(n.isLeaf()) {
			return 1;
		}
		else
            return nodeLeafCount2(n.getLeft()) + nodeLeafCount2(n.getRight());
	}
	
	public boolean isSearchBT3() {
			if(root.hasLeft() && root.hasLeft()) {
				if(root.getValue() > root.getLeft().getValue() && root.getValue() < root.getRight().getValue()) {
					return true;
				}
			} else {
				return false;
			}
			return false;
	}
	
//	public int nodeLeafCount2(BinaryTree t) {
//		int count=0;
//		List<Node> visited = new ArrayList<Node>();
//		Node lastVisited;
//		Node visiting = t.root;
//		// Vai fazer recurssão ou nçao? se for retire a linha acima 
//		
//
//		if(visiting.isLeaf()) {
//			return 1;
//		}
//		else {
//			lastVisited = visiting;
//			visited.add(lastVisited);
//			
//			if(lastVisited.hasLeft()){
//				visiting = lastVisited.getLeft();
//				if (visiting.isLeaf()) {
//					count++;
//				}
//			}
//			
//			if(lastVisited.hasRight()){
//				visiting = lastVisited.getRight();
//				if (visiting.isLeaf()) {
//					count++;
//				}
//			}
//			else {
//				
//			}
//			
//		}
//	}
//	getLeafCount(node)
//	1) If node is NULL then return 0.
//	2) Else If left and right child nodes are NULL return 1.
//	3) Else recursively calculate leaf count of the tree using below formula.
//	    Leaf count of a tree = Leaf count of left subtree + 
//	                                 Leaf count of right subtree

}
