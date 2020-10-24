package trees.entity;

import java.util.LinkedList;
import java.util.Queue;

public class PriorityList {
	
	private NodePL root;
	
	
	public NodePL find(NodePL root) {
		Queue <NodePL> queue = new  LinkedList<NodePL>();
		queue.add(root);
		while(!queue.isEmpty()) {
			NodePL node = queue.remove();
			if(node.hasLeft()) {
				return node;
			}
			if(node.hasRight()) {
				return node;
			}
			queue.add(node.getLeft());
			queue.add(node.getRight());
		}
		return root;
	}
	
	 public void add(int value) {
		 NodePL parent = find(root);
		 NodePL node = new NodePL(value);
		 
		 if(!parent.hasLeft()) {
			 parent.setLeft(node);
		 }
		 else {
			 parent.setRight(node);
		 }
		 rideUp(node);		 
	 }
	 
	 public void rideUp(NodePL node) {
		 NodePL aux;
		 while(node.getPriority() > node.getParent().getPriority()){
			 aux = node.getParent();
			 node.setParent(node);
			 node = node.getParent();
		 }
	 }
	 
	 public void remove(NodePL node) {
		 NodePL aux = find(node);
		 aux.setParent(null);
		if(aux.hasLeft()) {
			add(aux.getLeft().getPriority());
		}
		if(aux.hasRight()) {
			add(aux.getRight().getPriority());
		}
	 }

}
