package trees.entity;


public class main {

	public static void main(String[] args) {
		Node root1 = new Node(1);
		BinaryTree1 tree1 = new BinaryTree1(root1);
		NodeN_Ary root2 = new NodeN_Ary(5);
		N_AryTree5 tree2 = new N_AryTree5(root2);
		NodeN_Ary node1 = new NodeN_Ary(3);
		NodeN_Ary node2 = new NodeN_Ary(89);
		tree2.getRoot().addChild(node1);
		tree2.getRoot().addChild(node2);
		
		tree1.add1(3);
		tree1.add1(0);
		System.out.println("Nó tree1 direita:" + tree1.getRoot().getRight().getValue());
		System.out.println("Nó tree1 esquerda:" + tree1.getRoot().getLeft().getValue());
		System.out.println("É BINÁRIA?: " + tree1.isSearchBT3());
		System.out.println("quantos nós folhas: " + tree1.nodeLeafCount2(root1));
		BinaryTree1 tree3 = tree2.convertNarytoBinary();
		System.out.println("Raiz ex n-aria:" + tree3.getRoot().getValue() + "nó direito: " + tree3.getRoot().getRight().getValue() + " nó esquerdo: " + tree3.getRoot().getLeft().getValue());
		
		
	}

}
