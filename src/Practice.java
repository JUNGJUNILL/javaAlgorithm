import java.util.*;


public class Practice {

	static class Tree{
		class Node{
			Node left;
			Node right;
			int data; 
			public Node(int data){
				this.data = data; 
			}
		}
		
		Node root; 
		

		public Node MakeRtree(int[] arr, int start ,int end){
			
			if(start>end) return null; 
			int mid = (start+end) / 2; 
			Node node = new Node(arr[mid]); 
			node.left = MakeRtree(arr, start, mid-1); 
			node.right = MakeRtree(arr, mid+1, end); 
			
			
			return node; 
		}
		
		
		public void makeTree(int[] a){
			
			root = MakeRtree(a, 0, a.length-1); 

		}
	}
	
	static int searchBinary(int[] arr, int key){
		
		int start=0; 
		int end =arr.length-1; 
		
		while(start<=end){
			int mid = (start+end) / 2; 
			
			if(key<arr[mid]){
				end = mid-1; 
			}else if(key>arr[mid]){
				start = mid+1; 
			}else{
				return mid; 
			}
			
		}
		
		
		
		return -1; 
	}
	
	
	public static void main(String[] args) throws Exception{
		
		int[] a = new int[11];
		//[2,3,4,6,7,9,13,15,17,18,20]
		a[0]=2;
		a[1]=3;
		a[2]=4;
		a[3]=6;
		a[4]=7;
		
		a[5]=9;
		
		a[6]=13;
		a[7]=15;
		a[8]=17;
		a[9]=18;
		a[10]=20;
		
		Tree t = new Tree(); 
		
		t.root = t.MakeRtree(a, 0, a.length-1); 

		if(searchBinary(a, 17)>=0){
			System.out.println("있어");
		}else{
			System.out.println("없어");
		}
		

		
	}
}


