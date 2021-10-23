import java.util.*;

class Graph{
	class Node{
		int data; 
		LinkedList<Node> adjacent; 
		boolean marked;
		
		public Node(int data){
			this.data=data;
			this.marked=false;
			adjacent = new LinkedList<Node>(); 
		}
	}
	
	Node[] nodes; 
	public Graph(int size){
		nodes=new Node[size]; 
		for(int i=0; i<size; i++){
			nodes[i] =new Node(i);
		}
	}
	
	public void addEdge(int v1, int v2){
		Node n1 = nodes[v1];
		Node n2 = nodes[v2];
		if(!n1.adjacent.contains(n2)){
			n1.adjacent.add(n2); 
		}
		if(!n2.adjacent.contains(n1)){
			n1.adjacent.add(n1); 
		}
		
	}
	
	public void DFS(){
		DFS(0); 
	}
	
	public void DFS(int index){
		Node root = nodes[index]; 
		Stack<Node> stack = new Stack<Node>(); 
		stack.push(root); 
		root.marked=true;
		
		while(!stack.isEmpty()){
			Node r=stack.pop(); 
			for(Node n : r.adjacent){
				if(n.marked==false){
					n.marked=true;
					stack.push(n); 
				}
			}
			visit(r);
		}
		
	}
	
	public void visit(Node n){
		System.out.print(n.data);
	}
	
	
	
	
	
	
	
}

public class Practice {
	
	public static void main(String[] args) {
		
		Graph g =new Graph(9);
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 4);
		g.addEdge(2, 3);
		
		g.addEdge(3, 4);
		g.addEdge(3, 5);
		g.addEdge(5, 6);
		g.addEdge(5, 7);
		g.addEdge(6, 8);
		g.DFS();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//			//Stack 다시한번 말하지만 후입선출
//			Stack<Integer> stack =new Stack<Integer>(); 
//			
//			stack.add(1);
//			stack.add(2);
//			stack.add(3);
//				
//			while(!stack.isEmpty()){
//				System.out.println(stack.pop());
//			}
//			
//			
//			System.out.println("======================");
//			
//			
//			//queue 다시한번 말하지만 선입선출
//			Queue<Integer> q = new LinkedList<Integer>(); 
//			
//			
//			q.offer(3);
//			q.offer(2);
//			q.offer(1);
//
//			
//
//			System.out.println();
//			int temp=0; 
//			Iterator<Integer> itor=q.iterator();
//			while(itor.hasNext()){
//				temp = itor.next();
//			}
//			System.out.println("q의 가장 위에 있는 요소 반환="+temp);
			
			
			
	}
}

