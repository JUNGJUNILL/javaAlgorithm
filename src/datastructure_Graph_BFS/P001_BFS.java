package datastructure_Graph_BFS;


class QNode{
	int data; 
	QNode link; 
}

class LinkedQueue{
	QNode front; 
	QNode rear;
	
	public LinkedQueue(){
		front = null; 
		rear  = null; 
	}
	
	public boolean isEmpty(){
		return (front==null); 
	}
	
	
	public void enQueue(int item){
			
		QNode newNode=new QNode(); 
		newNode.data = item; 
		newNode.link = null; 
	
		if(isEmpty()){			
			
			//front와 rear는 같은 객체를 참조 하고 있으므로... 
			front = newNode;
			rear  = newNode;
			//System.out.println("front==rear="+(front==rear));
		}else{
			
			//rear.link에 2를 넣는 순간 front.link도 같은 rear.link를 바라볼 수 밖에 없다..
			rear.link = newNode;
			//System.out.println("front.link==rear.link="+(front.link==rear.link));
			rear      = newNode;
		

		}
	
	}
	
	public int deQueue(){
		
		
		if(isEmpty()){
			System.out.print("Deleting fail! Linked Queue is empty!!    ");
			return 0; 
		}else{
			int item = front.data; 
			front    = front.link; 


			if(front == null){
				rear = null; 
			}
			return item; 
		}
	}

	
}



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
		LinkedQueue Q=new LinkedQueue(); 
		boolean[] visited = new boolean[10]; 
		visited[v]=true; 
		System.out.printf(" %c",v+65);
		Q.enQueue(v);
		
		//Queue가 빌 때까지 반복
		while(!Q.isEmpty()){
			v = Q.deQueue(); 
			for(w=head[v]; w!=null; w=w.link){
				if(visited[w.vertex]==false){
					visited[w.vertex]=true; 
					System.out.printf(" %c",w.vertex+65);
					Q.enQueue(w.vertex);
				}
			}
		}
		
	}
	
	
	
	
}


public class P001_BFS {

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
