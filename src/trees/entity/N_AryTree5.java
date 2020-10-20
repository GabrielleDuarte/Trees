package trees.entity;

public class N_AryTree5 {
	
	private NodeN_Ary root;
	
	public BinaryTree1 convertNarytoBinary() {
		  Node rootbt = new Node(root.getValue());
		  BinaryTree1 newBinaryTree = new BinaryTree1(rootbt);
		  
		  for (int i = 0; i < root.getChilds().size(); i++) {
			  newBinaryTree.add1(root.getChilds().get(i).getValue());
		 }
		 return newBinaryTree;
	}
}
