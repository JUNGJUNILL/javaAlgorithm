
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
	
	
	public Node makeTreeR(int[] arr, int start, int end){
		
		if(start>end)return null; 
		int mid = (start+end) / 2; 
		Node node = new Node(arr[mid]); 
		node.left = makeTreeR(arr, start, mid-1); 
		node.right = makeTreeR(arr, mid+1, end); 
		return node; 
		
	}
	
	public void makeTree(int[] arr){
		root = makeTreeR(arr, 0, arr.length-1); 
	}
	
	public Node searchTree(Node n ,int find){
		
		if(n==null){
			return null; 
		}
		
		Node node =n; 
		Node nodeLeft = n.left; 
		Node nodeRight = n.right; 
		
		
		if(find > node.data){
			
			return searchTree(nodeRight, find);
			
		}else if(find < node.data){
			return searchTree(nodeLeft, find); 
		}else{
			return node; 
		}
		

	}
	
	
}




public class Practice {
	
	public static void main(String[] args) throws Exception{

		int[] arr ={1,2,3,4,5}; 
		
		Tree t =new Tree(); 
		
		t.makeTree(arr);
		if(t.searchTree(t.root, 89)==null){
			System.out.println("없음");
		}else{
			System.out.println("있음");
		}
			
		
	}
}

