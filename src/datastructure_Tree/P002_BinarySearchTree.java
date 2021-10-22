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
	

	
	//�����˼� ����
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
	
	//�����˻� ã�� 
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
		
		//root==null ���ǽ��� �ִ� ������ 
		//ã�� key�� �ش� Ʈ���� ���� ��쿡 null�� ��ȯ�ϱ� �����̴�.
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
		
		//������ ��带 ã�ư��� ����---------------
		if(root == null){return root;}
		else if(data < root.data){root.left = Delete(root.left, data);}
		else if(data > root.data){root.right = Delete(root.right, data);}
		//--------------------------------
		
		else{
			
			//�������� ����...
			
			//case 1. �ڽ��� ���� ��� 
			//�׳� nulló�� �ع����� �ȴ�.
			if(root.left == null && root.right == null){
			
				return null; 
				
			//case 2. �ڽ��� �ϳ� �� ���	
			}else if(root.left == null){
				
				return root.right;
				
			}else if(root.right == null){
				
				return root.left;
				
			//case 3. �ڽ��� �� �� ���
			}else{
				Node temp = minimum(root.right); //�������� �� ���̴�.
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
	//������ ū���߿� ���� ������
	public Node Successor(Node root,int data){
		
		
		Node currentNode = searchBTree(root,data); 
		if(currentNode == null){ return null;}
		
		//case 1. : ������ ����� right Node�� ���� ���
		if(currentNode.right !=null ){
			return minimum(currentNode.right);
		
		//case 2. : ������ �ڽ��� ���� ���
		}else{
			Node successor =null;
			Node ancestor  =root; 
			
			//������ ����ȴ�.
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
	

	//Ʈ���� �ּҰ��� ��Ÿ���� �Լ�
	public Node minimum(Node node){
		
		if(node.left==null) return node;	
		return minimum(node.left);

	}
	
	//Ʈ���� �ִ밪�� ��Ÿ���� �Լ�
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

		//�̷� Ʈ���� �����ȴ�...
		//				                   9
		//								    ��   ��
		//								��            ��
		//				         	  4         17
		//							��   ��                  ��       ��
		//						     ��           ��           ��              ��
		//                       3        6  13        18               
		//	     			       ��                         ��    ��                      ��
		//         		             ��	       	            ��    ��                      ��
		//       		    2		 	      7  15        20    
		
		
		Tree t = new Tree(); 
		t.makeTree(a);
		t.Insert(99);
		System.out.println(t.maximum(t.root).data);
		System.out.println("-----------------------");
		t.searchBTree(t.root, 20);
		System.out.println("-----------------------");
		
		
		System.out.println("17�� ������="+t.Successor(t.root, 17).data);
		
		t.Delete(17);
		System.out.println(t.root.right.data+ " : " + t.root.right.right.data);
		
//		System.out.println(t.Successor(t.root, 13.).data);
//
//		System.out.println("���� ������ ��� ==>"  + t.searchBTree(t.root,9).left.right.data);	
//		System.out.println("Successor ==>" + t.Successor(t.root, 13).data);
//		
//		System.out.println("���� ������ ��� ==>"  + t.searchBTree(t.root,2).data);		
//		System.out.println("���� ==>"  + t.Delete(t.root,18));
		

		
		
//		System.out.println(	"Tree�� �ּҰ� : " + t.minimum(t.root).data);
//		System.out.println(	"Tree�� �ִ밪 : " + t.maximum(t.root).data);
//		System.out.println(t.Successor(t.root).data);
//		System.out.println(t.Successor(t.root.right).data);
//		System.out.println(t.Successor(t.root.left).data);

		

	
	}

}
