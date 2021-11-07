package datastructure_Tree;
import java.util.Scanner;

public class P006_����_�����˻�Ʈ�� {
	
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
		
		//���� ó���� root ��带 �����Ѵ�. 
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
		
			postorder(root.left); //null�� �Ǵ� ������ �Ѿ
			postorder(root.right);//null�� �Ǵ� ������ �Ѿ
			System.out.println(root.data);
		
		}
		
	}
	
}
