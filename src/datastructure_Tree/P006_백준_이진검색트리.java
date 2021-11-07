package datastructure_Tree;
import java.util.Scanner;

public class P006_백준_이진검색트리 {
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);		
		Tree01 t = new Tree01(); 		
		while(in.hasNextInt()){
			t.Insert(in.nextInt()); 
		}
		
		t.postorder(t.root);
	}

}


class Tree01{
	
	class Node{
		int data; 
		Node right; 
		Node left; 
		
		public Node(int data){
			this.data = data; 
		}
	}
	
	Node root; 

	
	public void Insert(int data){
		root = Insert(root,data);
	}
	
	public Node Insert(Node root, int data){
		
		//가장 처음에 root 노드를 생성한다. 
		if(root==null){
			root = new Node(data); 
		}
		
		if(data < root.data){
			root.left = Insert(root.left,data); 
		
		}else if(data > root.data){
			root.right = Insert(root.right,data); 
		
		}
		return root;
	}
	
	public void postorder(Node root){
		if(root != null){
		
			postorder(root.left); //null이 되는 순간에 넘어감
			postorder(root.right);//null이 되는 순간에 넘어감
			System.out.println(root.data);
		
		}
		
	}
	
}
