package trees.entity;


public class main {

	public static void main(String[] args) {
		Node rootbt1 = new Node(1);
		Node rootbt2 = new Node(10);
		Node rootbt3 = new Node(6);
		Node rootbt4 = new Node(14);
		Node rootbt5 = new Node(16);
		BinaryTree1 tree1bt = new BinaryTree1(rootbt1);
		BinaryTree1 tree2bt = new BinaryTree1(rootbt2);
		BinaryTree1 tree3bt = new BinaryTree1(rootbt3);
		BinaryTree1 tree4bt = new BinaryTree1(rootbt4);
		BinaryTree1 tree5bt = new BinaryTree1(rootbt5);

		NodeN_Ary root2 = new NodeN_Ary(20);
		N_AryTree5 tree2 = new N_AryTree5(root2);
		
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
		
		tree1bt.add1(3);
		tree1bt.add1(0);
		tree1bt.add1(8);
		tree1bt.add1(6);
		tree1bt.add1(10);
		tree1bt.add1(15);
		
		tree2bt.add1(19);
		tree2bt.add1(9);
		tree2bt.add1(5);
		tree2bt.add1(50);
		tree2bt.add1(66);
		tree2bt.add1(10);
		
		tree3bt.add1(11);
		tree3bt.add1(12);
		tree3bt.add1(23);
		tree3bt.add1(8);
		tree3bt.add1(96);
		
		tree4bt.add1(65);
		tree4bt.add1(7);
		tree4bt.add1(13);
		tree4bt.add1(5);
		tree4bt.add1(3);
		tree4bt.add1(1);
		
		tree5bt.add1(4);
		tree5bt.add1(10);
		tree5bt.add1(26);
		tree5bt.add1(8);
		tree5bt.add1(32);
		tree5bt.add1(40);
		
		
		
		System.out.println("Nó tree1 direita:" + tree1bt.getRoot().getRight().getValue());
		System.out.println("Nó tree1 esquerda:" + tree1bt.getRoot().getLeft().getValue());
		System.out.println("É BINÁRIA de busca?: " + tree1bt.isSearchBT3());
		System.out.println("quantos nós folhas: " + tree1bt.nodeLeafCount2(rootbt1));
		BinaryTree1 tree3 = tree2.convertNarytoBinary();
		System.out.println("Raiz ex n-aria:" + tree3.getRoot().getValue() + "nó direito: " + tree3.getRoot().getRight().getValue() + " nó esquerdo: " + tree3.getRoot().getLeft().getValue());
		
		
	}

}
