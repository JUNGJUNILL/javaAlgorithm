package Algorithm_basic_Top10;

import java.util.Scanner;

class Tree {
	class Node{
		int data; 
		Node left; 
		Node right; 
		public Node(int data){
			this.data = data; 
		}
	}
	
	Node root; 
	public Node insert(Node root, int data){
		
		if(root==null){
			root = new Node(data); 
			return root; 
		}
		
		if(data < root.data){
			root.left = insert(root.left,data); 
			
		}else if(data > root.data){
			root.right = insert(root.right,data); 
			
		}
		return root; 
	}
	
	public void insert(int data){
		root = insert(root,data); 
	}
	
	public int SearchTree(Node n ,  int find){
		
		if(n == null){
			return 0; 
		}
		
		Node node = n; 
		Node leftNode  = n.left; 
		Node rightNode= n.right; 
		
		if(find < node.data){
			
			return SearchTree(leftNode, find); 
		}else if(find > node.data){
			
			return SearchTree(rightNode, find);
		}else{
			
			return 1; 
		}
		
		
	}
	
	
	
}


//시간초과 
public class 이진탐색 {
	
	//https://www.acmicpc.net/problem/1920
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		StringBuffer bf=new StringBuffer(); 
		int num01 = sc.nextInt(); 
		
		Tree t = new Tree(); 
		
		for(int i=0; i<num01; i++){
			t.insert(sc.nextInt());
		}
		
		int num02 = sc.nextInt(); 
		int[] arr =new int[num02]; 
		
		for(int j=0; j<num02; j++){
			
			arr[j] =t.SearchTree(t.root, sc.nextInt());


		}
	
		for(int n  : arr){
			System.out.println(n);
		}
		
		
	}

}
