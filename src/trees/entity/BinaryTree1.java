package trees.entity;

public class BinaryTree1 {
	
	private Node root;
	
	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public BinaryTree1(Node root) {
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
	
	public int height(Node n) {
		if(n.isLeaf()) {
			return 1;
		}
		else {
			return 1 + Math.max(height(n.getLeft()), height(n.getRight()));
		}
	}
}
