package ques3;

public class Ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST bst=new BST();
		bst.addNode(8);
		bst.addNode(3);
		bst.addNode(10);
		bst.addNode(1);
		bst.addNode(6);
		bst.addNode(4);
		bst.addNode(7);
		bst.addNode(14);
		bst.addNode(13);
		
		bst.preorder(bst.root);
		System.out.println();
		
		bst.deleteNode(bst.root, 4);
		
		bst.preorder(bst.root);
		System.out.println();
		bst.display();
	}
}
