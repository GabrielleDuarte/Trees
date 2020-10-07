package trees.entity;

public class BinarySearchTree {
	
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
	
	public boolean add(int value) {
		if (root == null) {
			root = new Node(value);
			return true;
		} else {
			Node node = getNode(root, value);
			if (value != node.getValue()) {
				Node newNode = new Node(value);
				if (value < node.getValue()) {
					node.getLeft() = newNode;
				} else {
					node.getRight() = newNode;
				}
				return true;
			}
		}
		return false;
	}

}
