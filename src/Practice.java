import java.awt.print.Book;
import java.util.LinkedList;
import java.util.Queue;

import javax.print.DocFlavor.CHAR_ARRAY;

class GraphNode{
	
	int vertex; 
	GraphNode link; 
	
}

class AdjList{
	GraphNode[] head = new GraphNode[10]; 
	private int totalV=0; 
	
	
	public void insertVertex(int v){
		totalV++; 
	}
	
	public void insertEdge(int v1, int v2){
		
		if(v1 >= totalV || v2 >=totalV){
			System.out.println("그래프에 없는 정점입니다.");
		}else{
			GraphNode gNode = new GraphNode(); 
			gNode.vertex = v2; 
			gNode.link = head[v1]; 
			head[v1] = gNode;
		}
	}
	
	public void BFS(int v){
		GraphNode w = new GraphNode(); 
		Queue<Integer> q = new LinkedList<Integer>(); 
		boolean[] visited =new boolean[10]; 
		visited[v] = true; 
		System.out.printf(" %c",v+65);
		q.add(v); 
		
		while(!q.isEmpty()){
			v = q.poll(); 
			
			for(w=head[v]; w !=null; w=w.link){
				if(visited[w.vertex] == false){
					visited[w.vertex] = true; 
					System.out.printf(" %c",w.vertex+65);
					q.add(w.vertex);
				}
			}
			
			
			
		}
		
		
		
		
	}
	
	
}


public class Practice {
	
	public static void main(String[] args) throws Exception{

		AdjList G9 =new AdjList(); 		
		for(int i=0; i<7; i++){
			
			G9.insertVertex(i);
		}
		G9.insertEdge(0, 2);
		G9.insertEdge(0, 1);
		G9.insertEdge(1, 4);
		G9.insertEdge(1, 3);
		G9.insertEdge(1, 0);
		G9.insertEdge(2, 4);
		G9.insertEdge(2, 0);
		G9.insertEdge(3, 6);
		G9.insertEdge(3, 1);
		G9.insertEdge(4, 6);
		G9.insertEdge(4, 2);
		G9.insertEdge(4, 1);
		G9.insertEdge(5, 6);
		G9.insertEdge(6, 5);
		G9.insertEdge(6, 4);
		G9.insertEdge(6, 3);
		
		G9.BFS(0);
		
	}
}

