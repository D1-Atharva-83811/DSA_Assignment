package ques3;

public class BST {
	public static class Node{
		public int data;
		Node left,right;
		public Node(int data) {
			this.data=data;
			left=right=null;
		}
	}
	
	public Node root=null;
	
//	public void addNode(Node root,int val) {		
//		if(val<root.data) {
//			if(root.left==null)
//				root.left=new Node(val);
//			else addNode(root.left,val);
//		}
//		else {	
//			if(root.right==null)
//				root.right=new Node(val);
//			else addNode(root.right,val);
//		}
//	}
//	
//	public void addNode(int val) {
//		if(root==null) {
//			root=new Node(val);
//			return;
//		}
//		addNode(root,val);
//	}
	
	public Node addNode(Node node,int val) {
		if(node==null)
			return new Node(val);
		
		if(val<node.data)
			node.left=addNode(node.left,val);
		else
			node.right=addNode(node.right,val);
		return node;
	}
	
	public void addNode(int val) {
		root=addNode(root,val);
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
	
//	public Node search(int val) {
//		return search(root,null,val)[0];
//	}
	
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
	
	public Node search(Node node,int val) {
		if(node==null)
			return null;
		if(node.data==val)
			return node;
		if(val<node.data)
			return search(node.left,val);
		else
			return search(node.right,val);
	}
	
	public Node search(int val) {
		return search(root,val);
	}
	
	public int countLeaf(Node node) {
		if(node.left==null && node.right==null)
			return 1;
		int cntLeft=node.left==null ? 0 : countLeaf(node.left);
		int cntRight=node.right==null ? 0 : countLeaf(node.right);
		return cntLeft+cntRight;
	}
	
	public int countNonLeafNodes(Node node) {
		if(node==null)
			return 0;
		if(node.left!=null && node.right!=null)
			return countNonLeafNodes(node.left)+countNonLeafNodes(node.right)+1;
		if(node.left!=null)
			return countNonLeafNodes(node.left)+1;
		if(node.right!=null)
			return countNonLeafNodes(node.right)+1;
		return 0;
	}
	
	public int depth(Node node) {
		if(node.left==null && node.right==null)
			return 0;
		int depL=node.left==null ? -1 : (depth(node.left)+1);
		int depR=node.right==null ? -1 : (depth(node.right)+1);
		return Math.max(depL,depR);
	}
	
	public Node getParent(Node node,int val) {
		if(node==null || node.data==val)
			return null;
		if(node.left!=null && node.left.data==val)
			return node;
		if(node.right!=null && node.right.data==val)
			return node;
		
		if(val<node.data)
			return getParent(node.left, val);
		else
			return getParent(node.right, val);
	}
	
	public void getChildren(int val) {
		Node node = search(val);
		if(node.left!=null)
			System.out.println(node.left.data);
		if(node.right!=null)
			System.out.println(node.right.data);		
	}
	
}

