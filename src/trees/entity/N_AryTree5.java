package trees.entity;

public class N_AryTree5 {
	
	private NodeN_Ary root;
	
	public N_AryTree5(NodeN_Ary root) {
		super();
		this.root = root;
	}
	
	public NodeN_Ary getRoot() {
		return root;
	}
	public void setRoot(NodeN_Ary root) {
		this.root = root;
	}

	public BinaryTree1 convertNarytoBinary() {
		  Node rootbt = new Node(root.getValue());
		  BinaryTree1 newBinaryTree = new BinaryTree1(rootbt);
		  
		  for (int i = 0; i < root.getChilds().size(); i++) {
			  newBinaryTree.add1(root.getChilds().get(i).getValue());
		 }
		 return newBinaryTree;
	}
}
