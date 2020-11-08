package trees.entity;

public class N_AryTree {
	
	private NodeN_Ary root;
	
	public N_AryTree(NodeN_Ary root) {
		super();
		this.root = root;
	}
	
	public NodeN_Ary getRoot() {
		return root;
	}
	public void setRoot(NodeN_Ary root) {
		this.root = root;
	}

	public BinaryTree convertNarytoBinary() {
		  Node rootbt = new Node(root.getValue());
		  BinaryTree newBinaryTree = new BinaryTree(rootbt);
		  
		  for (int i = 0; i < root.getChilds().size(); i++) {
			  newBinaryTree.add(root.getChilds().get(i).getValue());
		 }
		 return newBinaryTree;
	}
}
