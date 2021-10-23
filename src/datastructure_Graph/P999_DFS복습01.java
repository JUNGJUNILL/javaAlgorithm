package datastructure_Graph;
import java.util.Stack;

class GraphNode02 {
	int vertext; 
	GraphNode02 link;

}

class AdjList02{
	GraphNode02[] head =new GraphNode02[10]; 
	public int totalV =0; 
	
	public void insertVertex(int v){
		totalV++;
	}
	
	public void insertEdge(int v1, int v2){
		if(v1>=totalV || v2>=totalV){
			System.out.println("�׷����� ���� �����Դϴ�.");
		}else{
			GraphNode02 gNode=new GraphNode02(); 
			gNode.vertext = v2; 
			gNode.link    =head[v1]; 
			head[v1] = gNode;			
		}
	}
	
	public void printAdjList02(){
		GraphNode02 gNode = new GraphNode02(); 
		
		for(int i=0; i<totalV; i++){
			System.out.printf("\n���� %c�� ��������Ʈ ",i+65);
			gNode = head[i]; 
			while(gNode !=null ){
				System.out.printf("-> %c",gNode.vertext+65);
				gNode = gNode.link; 
			}
		
			
		}
		
	}
	
	public void DFS(int v){
		GraphNode02 w=new GraphNode02(); 
		Stack<Integer> stack = new Stack<Integer>();
		boolean[] visited =new boolean[10]; 
		stack.add(v); 
		visited[v]=true; 
		System.out.printf(" %c",v+65);
		
		//01.������ �� ������ �ݺ��ϸ鼭...
		while(!stack.isEmpty()){
			w=head[v]; 
			
			//�ش� ������ ���� �������� �湮�ϰ�
			while(w!=null){
			
				//02.�ش� ��忡 ���� �湮 ���ߴ�.
				if(visited[w.vertext]==false){
					
					stack.add(w.vertext); 
					visited[w.vertext]=true; 
					System.out.printf(" %c",w.vertext+65);
					v=w.vertext;
					w=head[v]; 
						
				//�ش� ��忡 �̹� �湮 �Ͽ���. 
				}else{
					w=w.link; 
				}
				
			}
			
			//03.
			//�ش� �������� ���� ��带 ��� �湮���� �� 
			//STACK(���Լ���) �� �����͸� �ϳ��� ������.
			v=stack.pop();
			
		}
		
	
	}
	
	
	
	
}


public class P999_DFS����01 {
	
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
		G9.printAdjList02();
		System.out.println();
		System.out.printf("\n\n ���� �켱 Ž�� >>");
		G9.DFS(0);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
	}
}

