package datastructure_Tree;


class Tree {
	class Node {
		int data; 
		Node left; 
		Node right; 
		Node (int data){
			this.data = data; 
		}
	}
	
	Node root; 
	

	
	//이진검섹 생성
	public Node makeTreeR(int[] a ,int start,int end){

		if(start > end) return null; 
		int mid = (start + end) / 2; 
		Node  node = new Node(a[mid]); 
		node.left = makeTreeR(a, start, mid-1);
		node.right = makeTreeR(a, mid+1, end);
		return node; 
	}
	
	public void makeTree(int[] a){
		root = makeTreeR(a,0,a.length-1); 
	}
	
	//이진검색 찾기 
	public Node searchBTree (Node n, int find){
		
		
		Node node  = n;
		Node leftNode = n.left; 
		Node rightNode= n.right;
		
		
	
		if(find < node.data){
		
			//System.out.println("Data is smaller then " + n.data);
			return searchBTree(leftNode, find);
		
		}else if(find > node.data){
			
			//System.out.println("Data is bigger then " + n.data);
			return searchBTree(rightNode, find);
			
		}else{
			System.out.println("Data found "  +n.data);
			return node;
			
		}
		

	}
	
	
	//SELECT 
	public Node search(Node root, int key){
		
		//root==null 조건식이 있는 이유는 
		//찾는 key가 해당 트리에 없을 경우에 null을 반환하기 위함이다.
		if(root==null || root.data ==key){
			return root;
		}		
		if(key < root.data){
			return search(root.left,key); 
		}else{
			return search(root.right,key); 
		}
	}
	
	
	//INSERT
	public Node Insert(Node root, int data){
		
		
		if(root == null){
			root = new Node(data); 
			return root;
		}
		
		if(data < root.data){
			root.left = Insert(root.left, data); 
		}else if(data > root.data){
			root.right = Insert(root.right, data);
		}
		
		return root;		
		
	}

	public void Insert(int data){
		root = Insert(root,data); 
	}
	
	//DELETE 
	public Node Delete(Node root, int data){
		
		//삭제할 노드를 찾아가는 여정---------------
		if(root == null){return root;}
		else if(data < root.data){root.left = Delete(root.left, data);}
		else if(data > root.data){root.right = Delete(root.right, data);}
		//--------------------------------
		
		else{
			
			//이제부터 시작...
			
			//case 1. 자식이 없는 경우 
			//그냥 null처리 해버리면 된다.
			if(root.left == null && root.right == null){
			
				return null; 
				
			//case 2. 자식이 하나 인 경우	
			}else if(root.left == null){
				
				return root.right;
				
			}else if(root.right == null){
				
				return root.left;
				
			//case 3. 자식이 둘 인 경우
			}else{
				Node temp = minimum(root.right); //석세서가 될 것이다.
				root.data = temp.data;
				root.right = Delete(root.right, temp.data); 
				return root;	
			}
			
		}
		return root;	

	}
	
	public void Delete(int data){
		root =Delete(root,data);
	}
	
	
	//Successor
	//나보다 큰놈중에 가장 작은놈
	public Node Successor(Node root,int data){
		
		
		Node currentNode = searchBTree(root,data); 
		if(currentNode == null){ return null;}
		
		//case 1. : 선택한 노드의 right Node가 있을 경우
		if(currentNode.right !=null ){
			return minimum(currentNode.right);
		
		//case 2. : 오른족 자식이 없는 경우
		}else{
			Node successor =null;
			Node ancestor  =root; 
			
			//같으면 종료된다.
			while(ancestor != currentNode){

				if(currentNode.data < ancestor.data){
					successor = ancestor;
					ancestor = ancestor.left;
				}else{
					ancestor = ancestor.right;
				}
			
			}
			return successor;
		}
	}
	

	//트리의 최소값을 나타내는 함수
	public Node minimum(Node node){
		
		if(node.left==null) return node;	
		return minimum(node.left);

	}
	
	//트리의 최대값을 나타내는 함수
	public Node maximum(Node node){
		
		if(node.right==null) return node; 
		return maximum(node.right); 
	}
	
	

}

public class P002_BinarySearchTree {

	public static void main(String[] args) {
		
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

		//이런 트리가 생성된다...
		//				                   9
		//								    ↙   ↘
		//								↙            ↘
		//				         	  4         17
		//							↙   ↘                  ↙       ↘
		//						     ↙           ↘           ↙              ↘
		//                       3        6  13        18               
		//	     			       ↙                         ↘    ↘                      ↘
		//         		             ↙	       	            ↘    ↘                      ↘
		//       		    2		 	      7  15        20    
		
		
		Tree t = new Tree(); 
		t.makeTree(a);
		t.Insert(99);
		System.out.println(t.maximum(t.root).data);
		System.out.println("-----------------------");
		t.searchBTree(t.root, 20);
		System.out.println("-----------------------");
		
		
		System.out.println("17의 석세서="+t.Successor(t.root, 17).data);
		
		t.Delete(17);
		System.out.println(t.root.right.data+ " : " + t.root.right.right.data);
		
//		System.out.println(t.Successor(t.root, 13.).data);
//
//		System.out.println("내가 선택한 노드 ==>"  + t.searchBTree(t.root,9).left.right.data);	
//		System.out.println("Successor ==>" + t.Successor(t.root, 13).data);
//		
//		System.out.println("내가 선택한 노드 ==>"  + t.searchBTree(t.root,2).data);		
//		System.out.println("삭제 ==>"  + t.Delete(t.root,18));
		

		
		
//		System.out.println(	"Tree의 최소값 : " + t.minimum(t.root).data);
//		System.out.println(	"Tree의 최대값 : " + t.maximum(t.root).data);
//		System.out.println(t.Successor(t.root).data);
//		System.out.println(t.Successor(t.root.right).data);
//		System.out.println(t.Successor(t.root.left).data);

		

	
	}

}
