package trees.entity;

import java.util.ArrayList;
import java.util.List;

public class NodeN_Ary {
	private int value;
	private List<NodeN_Ary> childs = new ArrayList<NodeN_Ary>();
	
	
	public List<NodeN_Ary> getChilds() {
		return childs;
	}
	public void setChilds(List<NodeN_Ary> childs) {
		this.childs = childs;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	
	
	
	
	
}
