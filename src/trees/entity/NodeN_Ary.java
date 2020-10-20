package trees.entity;

import java.util.ArrayList;
import java.util.List;

public class NodeN_Ary {
	private int value;
	private List<NodeN_Ary> childs = new ArrayList<NodeN_Ary>();
	
	public NodeN_Ary(int value) {
		super();
		this.value = value;
	}
	public List<NodeN_Ary> getChilds() {
		return childs;
	}
	public void addChild(NodeN_Ary node) {
		childs.add(node);
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	
	
	
	
	
}
