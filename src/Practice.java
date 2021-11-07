

class Node{
	int data; 
	Node left; 
	Node right;
}
class Tree{

	public Node root; 
	
	public void setRoot(Node node){
		this.root = node; 
	}
	
	public Node getRoot(){
		return root; 
	}
	
	public Node MakeNode(Node left, int data, Node right){
		Node node=new Node(); 
		node.data = data; 
		node.left  =left; 
		node.right =right; 
		return node; 
	}
	
	
	//전위순회
	public void preorder(Node node){
		if(node !=null){
			System.out.print(node.data+" ");
			preorder(node.left); 
			preorder(node.right);
		}
	}
	
	//중위순회
	public void inorder(Node node){
		if(node !=null){
			inorder(node.left);
			System.out.print(node.data+" ");
			inorder(node.right);
		}
	}
	
	//후위순회[
	public void postorder(Node node){
		if(node != null){
			postorder(node.left);
			postorder(node.right);
			System.out.print(node.data+" ");
		}
	}
	
}


public class Practice {
	
	public static void main(String[] args) throws Exception{
		
		Tree t = new Tree(); 
		Node n4 = t.MakeNode(null, 4, null); 
		Node n5 = t.MakeNode(null, 5, null); 
		Node n2 = t.MakeNode(n4, 2, n5);
		Node n3 = t.MakeNode(null, 3, null);
		Node n1 = t.MakeNode(n2, 1, n3); 
		
		t.setRoot(n1);
		t.preorder(t.getRoot());
		System.out.println();
		t.inorder(t.getRoot());
		System.out.println();
		t.postorder(t.getRoot());
	}
}

