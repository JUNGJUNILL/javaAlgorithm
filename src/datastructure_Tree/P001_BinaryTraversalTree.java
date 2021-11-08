package datastructure_Tree;

//이진 트리와 이진 검색 트리는 다르다....
class Node{
	int data;
	Node left, right; 
}

class BinaryTree {
	public Node root; 
	
	public void setRoot(Node node){
		this.root = node;
	}
	
	public Node getRoot(){
		return root;
	}
	
	public Node makeNode(Node left, int data, Node right){
		Node node =new Node(); 
		node.data = data; 
		node.left = left; 
		node.right=right;
		return node;
	}
	
	public void inorder(Node node){
		if(node != null){
			inorder(node.left);
			System.out.println(node.data);
			inorder(node.right);
		}
	}
	
	public void preorder(Node node){
		if(node != null){
			System.out.println(node.data);
			preorder(node.left);
			preorder(node.right);
		}
		
	}
	
	public void postorder(Node node){
		if(node != null){
			postorder(node.left);
			postorder(node.right);
			System.out.println(node.data);
		}
	}
	
}

public class P001_BinaryTraversalTree{
	
	public static void main(String[] args) {
		
		BinaryTree t =new BinaryTree();
		Node n4 = t.makeNode(null, 4, null);
		Node n5 = t.makeNode(null, 5, null);
		Node n2 = t.makeNode(n4, 2, n5);
		Node n3 = t.makeNode(null, 3, null);
		Node n1 = t.makeNode(n2, 1, n3);
		t.setRoot(n1);

		
		System.out.println("==inorder==");
		t.inorder(t.getRoot());
		
		System.out.println("==preorder==");
		t.preorder(t.getRoot());
		
		System.out.println("==postorder==");
		t.postorder(t.getRoot());
		
	
	}
}











