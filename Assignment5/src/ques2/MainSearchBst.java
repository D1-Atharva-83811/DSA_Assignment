package ques2;

public class MainSearchBst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bst bst = new Bst();
		bst.addNode(8);
		bst.addNode(1);
		bst.addNode(3);
		bst.addNode(9);
		bst.addNode(6);
		
		bst.display();
		System.out.println();
		System.out.println(bst.search(8)!=null ? bst.search(8).data : null);
	}

}

class Bst {
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
	
	public Node search(Node root,int val) {
		if(root==null)
			return root;
		
		if(root.data==val)
			return root;
		
		if(val<root.data)
			return search(root.left,val);
		return search(root.right,val);
	}
	
	public Node search(int val) {
		return search(root,val);
	}
}