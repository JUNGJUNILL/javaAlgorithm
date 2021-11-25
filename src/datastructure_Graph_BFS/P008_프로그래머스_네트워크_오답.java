package datastructure_Graph_BFS;

import java.util.*;


public class P008_���α׷��ӽ�_��Ʈ��ũ_���� {

	
	 /*
	   
	   {
			{1,1,0},
			{1,1,0},
			{0,0,1} 
	   }
	  
		0�� 1�� ����
			1�� 1�� ����
			2�� 2�� ���� 
		
		
		(0,0)=1 (0,1)=1 (0,2)=0
		(1,0)=1 (1,1)=1 (1,2)=0
		(2,0)=0 (2,1)=0 (2,2)=1
		
		
		{
		 	{1, 1, 0}, 
		 	{1, 1, 1}, 
		 	{0, 1, 1}
		 }
		 
		 0�� 1�� ����
		 1�� 2�� ���� 
		 
		(0,0)=1 (0,1)=1 (0,2)=0
		(1,0)=1 (1,1)=1 (1,2)=1
		(2,0)=0 (2,1)=1 (2,2)=1
		 
		
	  */
	
	static int[][] array =	{
			{1,0,0},
			{0,1,0},
			{0,0,1} 
		 
		 }; 
	static int n=3; 
	static int[][] D ={
			{-1,0},  //���� ��ĭ(��)
			{1,0},   //�Ʒ��� ��ĭ(��)
			{0,-1},  //���� ��ĭ (��)
			{0,1},   //������ ��ĭ(��)  �� �ϴ� �����̴�.
	};

	
	static int solution(int n, int[][] computers){
		
		 boolean[][] visited = new boolean[n][n]; 
		 int[][] newArray;
		int answer=0; 

		
		for(int i=0; i<computers.length; i++){
			for(int j=0; j<computers[i].length; j++){
				if(computers[i][j]==1 && !visited[i][j]){
					Stack<int[][]> stack =new Stack<>(); 
					newArray= new int[1][2]; 
					newArray[0][0]=i;
					newArray[0][1]=j;
					stack.push(newArray); 

					
					while(!stack.isEmpty()){
						int[][] curr = stack.pop(); 
						visited[curr[0][0]][curr[0][1]]=true;
			
						for(int k=0; k<4; k++){
							int nr = curr[0][0] +D[k][0]; 
							int nc = curr[0][1] +D[k][1]; 
						

							if(nr<0 || nr>2 || nc<0 ||nc>2)continue; 
							if(visited[nr][nc])continue; 
							if(computers[nr][nc]==0)continue; 
				
							visited[nr][nc]=true; 
							
							newArray= new int[1][2]; 
							newArray[0][0]=nr;
							newArray[0][1]=nc;
						
							stack.push(newArray); 
							
						}//end of for 

					}//end of while
					answer++;

					
				}	
			}
		}
		

		return answer; 
		
		
	
		
	
	}
	

	//https://programmers.co.kr/learn/courses/30/lessons/43162
	public static void main(String[] args) throws Exception{
	
		for(int i=0; i<array.length; i++){
			for(int j=0; j<array[i].length; j++){
				System.out.print(array[i][j]+" ");
			}
			System.out.println();

		}
	
		System.out.println();
		System.out.println(solution(3,array));

		
	}
}


