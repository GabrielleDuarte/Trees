package trees.entity;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;

public class BinaryTree {
	
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

}
