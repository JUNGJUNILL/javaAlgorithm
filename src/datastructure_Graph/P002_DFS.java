package datastructure_Graph;

class StackNode{
	int data; 
	StackNode link; 
}


class LinkedStack{
	StackNode top; 
	
	public boolean isEmpty(){
		return (top == null);
	}
	
	public void push(int item){
		StackNode newNode = new StackNode(); 
		newNode.data = item; 
		newNode.link = top; 
		top = newNode;
		
	}
	
	
	public int pop(){
		if(isEmpty()){
			System.out.println("Deleting fail!");
			return 0;
		}else{
			int item = top.data;
			top = top.link;
			return item; 
		}
	}
	
}




class GraphNode01 {
	int vertex; 
	GraphNode01 link;
	
}

class AdjList01{
	
	GraphNode01[] head=new GraphNode01[10];
	private int totalV=0; 
	
	public void insertVertex(int v){
		totalV++;
	}
	
	public void insertEdge(int v1, int v2){
		if(v1>=totalV || v2>=totalV){
			System.out.println("그래프에 없는 정점입니다.");
		}else{
			GraphNode01 gNode =new GraphNode01(); 
			gNode.vertex = v2; 
			gNode.link = head[v1]; 
			head[v1] = gNode;
			
		}
	}
	
	public void printAdjList(){
		GraphNode01 gNode = new GraphNode01(); 
		
		for(int i=0; i<totalV; i++){
			System.out.printf("\n정점 %c의 인접리스트 ",i+65);
			gNode = head[i]; 
			while(gNode!=null){
				System.out.printf("-> %c",gNode.vertex+65);
				gNode = gNode.link; 
			}
		}
		
	}
	
	
	public void DFS(int v){
		GraphNode01 w = new GraphNode01(); 
		LinkedStack	S = new LinkedStack(); 
		boolean[] visited = new boolean[10]; 
		S.push(v);
		visited[v] = true; 
		System.out.printf(" %c",v+65);
		
		while(S.top != null){
			w = head[v]; 

			while(w !=null){
				
				if(visited[w.vertex]==false){
					S.push(w.vertex);
					visited[w.vertex]=true;
					System.out.printf(" %c",w.vertex+65);
					v = w.vertex;
					w = head[v]; 
					
				}else{
					w = w.link;
				}
                               
			}
			
			v=S.pop();
			
		}
		
	}
	
	
	
	
}



public class P002_DFS {

	
	public static void main(String[] args) {
		
		AdjList01 G9 = new AdjList01(); 
		
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
		System.out.printf("\n\n 깊이 우선 탐색 >>");
		G9.DFS(0);

		
		
		
		
		
	}

}
