package 백준_알고리즘_기초02;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class P008_그래프1_이분그래프 {
	
	
	//3-c 
	//(3-1)1->2로 바꿀수 있고, 
	//(3-2)2->1로 바꿀 수 있다.
	public static boolean DFS(ArrayList<Integer>[] a,int[] color,int x, int c){
		color[x]=c; 
		for(int y : a[x]){
			if(color[y] == 0){ //방문 노드 확인 
				
				if(!DFS(a,color,y,3-c)){ //같은 그룹이 아니다! 이분 그래프이다!
					return false; 
				}
				
			}else if(color[y]==color[x]){ //같은 그룹이다! 즉, 이분 그래프가 아니다! 
				return false; 
			}
		}
		return true; 
	}

	public static void main(String[] args) {	
		int n=4;  //노드의 갯수 
		int m=4; //간선의 갯수 
		ArrayList<Integer>[] a=(ArrayList<Integer>[])new ArrayList[n+1]; 
		
		for(int i=1; i<=n; i++){
			a[i]=new ArrayList<Integer>(); 
		}
		
		/*
		 1 2
		 2 3
		 3 4
		 4 2 
		 */
		a[1].add(2);
		a[2].add(1);
		
		a[2].add(3);
		a[3].add(2);
		
		a[3].add(4);
		a[4].add(3);
		
		a[4].add(2);
		a[2].add(4);

		/*
		 [0,0,0,0]
		 
		 a[1]={2}
		 a[2]={1,3,4}
		 a[3]={2,4}
		 a[4]={2,3}
		 */
		
		int[] color=new int[n+1]; 
		boolean ok=true; 
		
		for(int i=1; i<=n; i++){
			if(color[i]==0){
				if(!DFS(a,color,i,1)){
					ok=false; 
				}
			}
		}
		
	/*
  	 [0,0,0,0,0]
	 
	 a[1]={2}
	 a[2]={1,3,4}
	 a[3]={2,4}
	 a[4]={2,3}
	 
	 FOR 
	 1 color[1]==0 true 
	 	DFS(a,color,1,1)
	 	color[1]=1 , [0,1,0,0,0]
	 	a[1]={2}
	 	FOR 1번 순회 
	 	y=2 
	 	color[2]==0 true
	 								DFS(a,color,2,2)
	 								color[2]=2 , [0,1,2,0,0]
	 								a[2]={1,3,4}
	 								FOR 3번 순회
	 								y=1
	 								color[1]==0 false  
	 								color[1]==color[2] false 
	 								
	 								y=3
	 								color[3]==0 true
	 															DFS(a,color,3,1) 
	 															color[3]=1  , [0,1,2,1,0]
	 															a[3]={2,4}
	 															FOR
	 															y=2
	 															color[2]==0 false  
	 															color[2]==color[3] false 
	 															
	 															y=4
	 															color[4]==0 true 
	 																						DFS(a,color,4,2)
	 																						color[4]=2 , [0,1,2,1,2]
	 																						a[4]={2,3}
	 																						FOR
	 																						y=2
	 																						color[2]==0 false 
	 																						color[2]==color[4] return false 여기서 종료되어버린다.
	 																						
	 																						y=3
	 								
	 								y=4
	 
	 2
	 
	 3
	 
	 4
	
	 
	 
	 */
		
		
		
		
		   if (ok) {
               System.out.println("YES");
           } else {
               System.out.println("NO");
           }
		
	
	}
}