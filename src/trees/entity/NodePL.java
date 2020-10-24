package trees.entity;

public class NodePL {
	
	private int priority;
	private NodePL parent;
	private NodePL left;
	private NodePL right;
	
	public NodePL(int priority) {
		super();
		this.priority = priority;
	}
	public NodePL getLeft() {
		return left;
	}
	public void setLeft(NodePL left) {
		this.left = left;
	}
	public NodePL getRight() {
		return right;
	}
	public void setRight(NodePL right) {
		this.right = right;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	public NodePL getParent() {
		return parent;
	}
	public void setParent(NodePL parent) {
		this.parent = parent;
	}
	public boolean hasLeft() {
		return left != null;
	}

	public boolean hasRight() {
		return right != null;
	}
}
