package trees.entity;


public class main {

	public static void main(String[] args) {
		Node rootbt1 = new Node(1);
		Node rootbt2 = new Node(10);
		Node rootbt3 = new Node(6);
		Node rootbt4 = new Node(14);
		Node rootbt5 = new Node(16);
		Node rootbt6 = new Node(10);
		BinaryTree tree1bt = new BinaryTree(rootbt1);
		BinaryTree tree2bt = new BinaryTree(rootbt2);
		BinaryTree tree3bt = new BinaryTree(rootbt3);
		BinaryTree tree4bt = new BinaryTree(rootbt4);
		BinaryTree tree5bt = new BinaryTree(rootbt5);
		BinaryTree tree6bt = new BinaryTree(rootbt6);

		NodeN_Ary root2 = new NodeN_Ary(20);
		N_AryTree tree2 = new N_AryTree(root2);
		
		NodeN_Ary node1 = new NodeN_Ary(3);
		NodeN_Ary node2 = new NodeN_Ary(6);
		NodeN_Ary node3 = new NodeN_Ary(5);
		NodeN_Ary node4 = new NodeN_Ary(10);
		NodeN_Ary node5 = new NodeN_Ary(9);
		NodeN_Ary node6 = new NodeN_Ary(15);
		NodeN_Ary node7 = new NodeN_Ary(12);
		NodeN_Ary node8 = new NodeN_Ary(1);
		NodeN_Ary node9 = new NodeN_Ary(7);
		NodeN_Ary node10 = new NodeN_Ary(89);
		
		tree2.getRoot().addChild(node1);
		tree2.getRoot().addChild(node2);
		tree2.getRoot().addChild(node3);
		
		tree2.getRoot().getChilds().add(node4);
		tree2.getRoot().getChilds().add(node5);
		tree2.getRoot().getChilds().add(node6);
		tree2.getRoot().getChilds().get(0).addChild(node7);
		tree2.getRoot().getChilds().get(0).addChild(node8);
		tree2.getRoot().getChilds().get(0).addChild(node9);
		tree2.getRoot().getChilds().get(0).addChild(node10);
		
		tree1bt.add(3);
		tree1bt.add(0);
		tree1bt.add(8);
		tree1bt.add(6);
		tree1bt.add(10);
		tree1bt.add(15);
		
		tree2bt.add(19);
		tree2bt.add(9);
		tree2bt.add(5);
		tree2bt.add(50);
		tree2bt.add(66);
		tree2bt.add(10);
		
		tree3bt.add(11);
		tree3bt.add(12);
		tree3bt.add(23);
		tree3bt.add(8);
		tree3bt.add(96);
		
		tree4bt.add(65);
		tree4bt.add(7);
		tree4bt.add(13);
		tree4bt.add(5);
		tree4bt.add(3);
		tree4bt.add(1);
		
		tree5bt.add(4);
		tree5bt.add(10);
		tree5bt.add(26);
		tree5bt.add(8);
		tree5bt.add(32);
		tree5bt.add(40);
		
		tree6bt.add(1);
		tree6bt.add(11);
		tree6bt.add(20);
		
		System.out.println(tree6bt.isFull(tree6bt.getRoot()));	
		
		
		
		
	}

}
