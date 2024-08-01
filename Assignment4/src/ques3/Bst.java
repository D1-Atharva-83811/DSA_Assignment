package ques3;

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
	
	public Node addNode(Node root,int val) {		
		if(root==null) {
			root=new Node(val);
			return root;
		}
		
		if(val<root.data)
			root.left=addNode(root.left,val);
		else
			root.right=addNode(root.right,val);
		return root;
	}
	
	public void add(int val) {
		root=addNode(root,val);
	}
	
	public void display(Node tmp) {
		if(tmp==null)
			return;
		display(tmp.left);
		System.out.print(tmp.data+" ");
		display(tmp.right);
	}
}
