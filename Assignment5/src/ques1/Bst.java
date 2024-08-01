package ques1;

public class Bst {
	static class Node{
		int data;
		Node left,right;
		public Node(int data) {
			this.data=data;
			left=right=null;
		}
	}
	Node root=null;
	
	public void addNode(Node root,int val) {		
		if(val<root.data) {
			if(root.left==null)
				root.left=new Node(val);
			else addNode(root.left,val);
		}
		else {	
			if(root.right==null)
				root.right=new Node(val);
			else addNode(root.right,val);
		}
	}
	
	public void addNode(int val) {
		if(root==null) {
			root=new Node(val);
			return;
		}
		addNode(root,val);
	}
	
	void display(Node tmp) {
		if(tmp==null)
			return;
		display(tmp.left);
		System.out.print(tmp.data+" ");
		display(tmp.right);
	}
	
	public void display() {
		display(root);
	}
}
