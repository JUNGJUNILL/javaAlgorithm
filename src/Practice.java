import java.beans.Visibility;
import java.util.*;


public class Practice {

	
	 /*
	   
	   {
			{1,1,0},
			{1,1,0},
			{0,0,1} 
	   }
	  
		0컴 1컴 연결
			1컵 1컴 연결
			2컵 2컴 연결 
		
		
		(0,0)=1 (0,1)=1 (0,2)=0
		(1,0)=1 (1,1)=1 (1,2)=0
		(2,0)=0 (2,1)=0 (2,2)=1
		
		
		{
		 	{1, 1, 0}, 
		 	{1, 1, 1}, 
		 	{0, 1, 1}
		 }
		 
		 0컴 1컴 연결
		 1컴 2컴 연결 
		 
		(0,0)=1 (0,1)=1 (0,2)=0
		(1,0)=1 (1,1)=1 (1,2)=1
		(2,0)=0 (2,1)=1 (2,2)=1
		 
		
	  */
	
	static int[][] array =	{
		 	{1, 1, 0}, 
		 	{1, 1, 1}, 
		 	{0, 1, 1}
		 
		 }; 
	static int n=3; 
	static int[][] D ={
			{-1,0},  //위로 한칸(상)
			{1,0},   //아래로 한칸(하)
			{0,-1},  //왼쪽 한칸 (좌)
			{0,1},   //오른쪽 한칸(우)  를 하는 로직이다.
	};
	static boolean[][] visited = new boolean[n][n]; 
	static int[][] newArray; 
	
	static int solution(int n, int[][] computer){
		
		int answer=0; 

		
		for(int i=0; i<computer.length; i++){
			for(int j=0; j<computer[i].length; j++){
				if(computer[i][j]==1 && !visited[i][j]){
					//System.out.println("BFS("+i+","+j+")");
					Stack<Integer> stack =new Stack<>(); 
					stack.push(computer[i][j]); 
					 
					
					while(!stack.isEmpty()){
						int curr = stack.pop(); 
						visited[i][j]=true;
			
						
						
						for(int k=0; k<4; k++){
							int nr = i +D[k][0]; 
							int nc = j +D[k][1]; 

							if(nr<0 || nr>n-1 || nc<0 || nc>n-1)continue; 
							if(visited[nr][nc])continue; 
							if(computer[nr][nc]==0)continue; 
							visited[nr][nc]=true; 
							stack.push(computer[nr][nc]); 
							
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
		System.out.println();
		for(int i=0; i<visited.length; i++){
			for(int j=0; j<visited[i].length; j++){
				System.out.print(visited[i][j]+" ");
			}
			System.out.println();

		}
		
	}
}


