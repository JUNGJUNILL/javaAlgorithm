package Algorithm_basic_Top10;

import java.util.Scanner;

class Tree01{
	
	class Node{
		int data; 
		Node left; 
		Node right; 
		public Node(int data){
			this.data = data; 
		}
	}
	
	Node root; 
	public Node makeTreeR(int[] a, int start, int end){
		
		if(start>end)return null; 
		int mid = (start+end) /2; 
		Node node = new Node(a[mid]); 
		node.left = makeTreeR(a, start,mid-1); 
		node.right=makeTreeR(a, mid+1, end);
		return node; 
	}
	
	public void makeTree(int[] a){
		root = makeTreeR(a,0, a.length-1); 
	}
	
	public int searchTree(Node n , int find){
			if(n==null){
				return 0; 
			}
			
			Node node = n; 
			Node left  =n.left;
			Node right=n.right;
			
			if(find > node.data){
				 return searchTree(right, find); 
				  
			}else if(find <node.data){
				 return searchTree(left, find); 
				 
			}else{
				return 1;		
				
			}
		 
	}	
}

public class ÀÌÁøÅ½»ö02 {
	//https://www.acmicpc.net/problem/1920
	public static void main(String[] args) {

		int[] arr = new int[5]; 
		arr[0]=4;
		arr[1]=1;
		arr[2]=5;
		arr[3]=2;
		arr[4]=3;
		
		Tree01 t = new Tree01();
		t.makeTree(arr);

	}
}
