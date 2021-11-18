package datastructure_Graph_BFS;

import java.util.LinkedList;
import java.util.Queue;



class GraphNode02 {
	int vertex; 
	GraphNode02 link;
	
}

class AdjList02{
	
	GraphNode02[] head=new GraphNode02[10];
	private int totalV=0; 
	
	public void insertVertex(int v){
		totalV++;
	}
	
	public void insertEdge(int v1, int v2){
		if(v1>=totalV || v2>=totalV){
			System.out.println("그래프에 없는 정점입니다.");
		}else{
			GraphNode02 gNode =new GraphNode02(); 
			gNode.vertex = v2; 
			gNode.link = head[v1]; 
			head[v1] = gNode;
			
		}
	}
	
	public void printAdjList(){
		GraphNode02 gNode = new GraphNode02(); 
		
		for(int i=0; i<totalV; i++){
			System.out.printf("\n정점 %c의 인접리스트 ",i+65);
			gNode = head[i]; 
			while(gNode!=null){
				System.out.printf("-> %c",gNode.vertex+65);
				gNode = gNode.link; 
			}
		}
		
	}
	
	
	public void BFS(int v){
		GraphNode02 w=new GraphNode02(); 
		Queue<Integer> Q=new LinkedList<Integer>();
		boolean[] visited = new boolean[10]; 
		visited[v]=true; 
		System.out.printf(" %c",v+65);
		Q.add(v);
		
		//Queue가 빌 때까지 반복
		while(!Q.isEmpty()){
			v = Q.poll(); 
			for(w=head[v]; w!=null; w=w.link){
				if(visited[w.vertex]==false){
					visited[w.vertex]=true; 
					System.out.printf(" %c",w.vertex+65);
					Q.add(w.vertex);
				}
			}
		}
		
	}
	
	
	
	
}


public class P001_BFS_basic {

	public static void main(String[] args) {
		
		AdjList02 G9 = new AdjList02(); 
		
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
		
		System.out.printf("\n 그래프 G9의 인접리스트 :");
		G9.printAdjList();
		System.out.println();
		System.out.println();
		System.out.printf("\n\n 너비 우선 탐색 >>");
		G9.BFS(0);

		

	}

}
