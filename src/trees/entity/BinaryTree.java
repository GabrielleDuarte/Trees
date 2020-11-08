package trees.entity;

public class BinaryTree {
	
	private Node root;
	
	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public BinaryTree(Node root) {
		super();
		this.root = root;
	}

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
	
	public void add(int value) {
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
	
	public int nodeLeafCount(Node n) {
		if(n.isLeaf()) {
			return 1;
		}
		else
            return nodeLeafCount(n.getLeft()) + nodeLeafCount(n.getRight());
	}
	
	public boolean isSearchBT() {
			if(root.hasLeft() && root.hasLeft()) {
				if(root.getValue() > root.getLeft().getValue() && root.getValue() < root.getRight().getValue()) {
					return true;
				} 
			}
			if (root.hasLeft() && root.getValue() > root.getLeft().getValue()) {
					return true;
			}
			if(root.hasRight() && root.getValue() < root.getRight().getValue()) {
				return true;
			}
			else { 
				return false;
			}
	}
	
	public int height(Node node) {
		if(node.isLeaf()) {
			return 1;
		}
		else {
			return 1 + Math.max(height(node.getLeft()), height(node.getRight()));
		}
	}
	
	public boolean isFull(Node node) {
		if(node.isLeaf()) {
			return true;	
		}
		if (node.getLeft()!=null && node.getRight()!=null) {
			return (isFull(node.getLeft()) && isFull(node.getRight()));
		}
		else {
			return false;
		}
	}
	
	public boolean isAVL(Node root) {
		int thisHeight = height(root.getLeft())-height(root.getRight());
		
		if(thisHeight<=1 && thisHeight>=-1) {
			return true;
		}
		else {
			return false;
		}
	}
}
