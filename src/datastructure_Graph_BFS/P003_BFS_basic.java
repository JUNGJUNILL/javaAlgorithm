package datastructure_Graph_BFS;

import java.util.*;
/*
 7 8
 
0 1
0 2
1 3
1 4
2 4
3 6
4 6
5 6
 
무방향 그래프의 인접행렬은 대칭을 이룬다. 
 */

public class P003_BFS_basic {
	
	static int[][] graph; 
	static int V;
	static int E; 
	
	static void BFS(int node){
		
		boolean[] visited = new boolean[V]; 
		Queue<Integer> q=new LinkedList<Integer>(); 
		visited[node] =true; 
		q.add(node); 
		
		while(!q.isEmpty()){
			
			int curr = q.poll(); 
			
			System.out.printf("%c" , curr+65);
			for(int i=0; i<V; i++){
				//방문하지 않은 노드 인 경우 
				if(!visited[i] && graph[curr][i]==1){
					visited[i] = true; 
					q.add(i); 
				}
			}	
		}
	}
	
	/*
	 Q : 0(A) visited[0] true 
	    Q.curr = 0 print(A)
	    for 7 
	    0 !visited[0] false continue 
	    1 !visited[1] true and graph[0][1]==1 Q : 1(B) , visited[1]=true 
	    2 !visited[2] true and graph[0][2]==1 Q : 2(C) , visited[2]=true 
	    3 !visited[3] true and graph[0][3]==0 continue
	    4 !visited[4] true and graph[0][4]==0 continue 
	    5 !visited[5] true and graph[0][5]==0 continue
	    6 !visited[6] true and graph[0][6]==0 continue
		
	Q : 2(C) 
		Q.curr = 1 print(B)  
		for 7
		0 !visited[0] false continue 
	    1 !visited[1] false continue
	    2 !visited[2] false continue
	    3 !visited[3] true and graph[1][3]==1 Q : 3(D) , visited[3]=true
	    4 !visited[4] true and graph[1][4]==1 Q : 4(E) , visited[4]=true
	    5 !visited[5] true and graph[1][5]==0 continue
	    6 !visited[6] true and graph[1][6]==0 continue
	    
	Q : 3(D) 
	 	Q.curr = 2 print(C) 
	 	for 7
	 	0 !visited[0] false continue 
	    1 !visited[1] false continue
	    2 !visited[2] false continue
	    3 !visited[3] false continue
	    4 !visited[4] false continue
	    5 !visited[5] true and graph[2][5]==0 continue
	    6 !visited[6] true and graph[2][6]==0 continue

	Q: 4(E) 
		Q.curr = 3 print(D)
		for 7 
		0 !visited[0] false continue 
	    1 !visited[1] false continue
	    2 !visited[2] false continue
	    3 !visited[3] false continue
	    4 !visited[4] false continue
	    5 !visited[5] true and graph[3][5]==0 continue
	    6 !visited[6] true and graph[3][6]==1 Q : 6 , visited[6]=true

    Q: 6(G)
        Q.curr = 4 print(E) 
        for 7
        0 !visited[0] false continue 
	    1 !visited[1] false continue
	    2 !visited[2] false continue
	    3 !visited[3] false continue
	    4 !visited[4] false continue
	    5 !visited[5] true and graph[4][5]==0 continue
	    6 !visited[6] false continue
	
	Q: 
		Q.curr = 6 print(G) 
	    for 7
	    0 !visited[0] false continue 
	    1 !visited[1] false continue
	    2 !visited[2] false continue
	    3 !visited[3] false continue
	    4 !visited[4] false continue
	    5 !visited[5] true and graph[6][5]==1 Q : 5(F) , visited[5]=true 
	    6 !visited[6] false continue
  	
  	Q: 
		Q.curr = 5 print(F) 
		전체 노드 다 방문했고, Q도 EMPTY이므로 BFS를 종료한다.

	*/
	
	public static void main(String[] args) throws Exception{
	
		Scanner sc = new Scanner(System.in);
		
		V= sc.nextInt(); //노드의 갯수
		E= sc.nextInt(); //간선의 갯수
	
		graph =new int[V][V]; 
		
		for(int i=0; i<E; i++){
			int row =sc.nextInt(); 
			int col  =sc.nextInt(); 
			
			graph[row][col] = graph[col][row] = 1; 
		}
		
		System.out.println("그래프의 모양");
		for(int i=0; i<graph.length; i++){
			for(int j=0; j<graph[i].length; j++){
				System.out.print(graph[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("=========================");
		
		BFS(0); 
		
		
	}
}

