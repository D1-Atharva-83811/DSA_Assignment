
public class BST {
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
	
	public Node[] search(Node root,Node p,int val) {
		if(root==null)
			return new Node[] {null,null};
		
		if(root.data==val)
			return new Node[] {root,p};
		
		if(val<root.data)
			return search(root.left,root,val);
		return search(root.right,root,val);
	}
	
	public Node search(int val) {
		return search(root,null,val)[0];
	}
	
	public Node findPred(Node root) {
		if(root==null)
			return null;
		if(root.right==null)
			return root;
		return findPred(root.right);
	}
	
	public Node findSuccessor(Node root) {
		if(root==null)
			return null;
		if(root.left==null)
			return root;
		return findSuccessor(root.left);
	}
	
	public Node maxNode(Node node) {
		if(node==null)
			return null;
		if(node.right==null)
			return node;
		return maxNode(node.right);
	}
	
	public Node deleteNode(Node node,int val) {
		if(node==null)
			return node;
		if(val<node.data) 
			node.left=deleteNode(node.left,val);
		else if(val>node.data)
			node.right=deleteNode(node.right,val);
		else {
			if(node.left==null && node.right==null)
				node=null;
			else if(node.left==null)
				return node.right;
			else if(node.right==null)
				return node.left;
			else {
				Node succ=findSuccessor(node.right);
				node.data=succ.data;
				node.right=deleteNode(node.right,succ.data);
			}
		}
		return node;		
	}
	public void preorder(Node node) {
		if(node==null)
			return;
		System.out.print(node.data+" ");
		preorder(node.left);
		preorder(node.right);
	}
}
