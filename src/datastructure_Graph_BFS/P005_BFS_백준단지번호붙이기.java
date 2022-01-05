package datastructure_Graph_BFS;

import java.util.*;

public class P005_BFS_백준단지번호붙이기 {
	
	static int[][] apartment; 
	static boolean[][] visited; 

	static int[][] D={
			{-1,0},
			{1,0},
			{0,-1},
			{0,1}
	}; 
	
	static class Point{
		int row, col; 
		public Point(int r, int c){
			this.row = r; 
			this.col = c; 
		}
	}
	//DFS
	static int searchApartment(int o1, int o2){
		Stack<Point> q = new Stack<Point>(); 
		q.push(new Point(o1, o2)); 
		int count=0; 
		
		while(!q.isEmpty()){
			Point curr = q.pop(); 
			visited[curr.row][curr.col]=true; 
			count++; 
			
			for(int i=0; i<4; i++){
				
				int nr = curr.row + D[i][0]; 
				int nc = curr.col + D[i][1]; 
				if(nr<0 || nr>apartment.length-1 || nc<0 || nc>apartment.length-1)continue; 
				if(visited[nr][nc]) continue; 
				if(apartment[nr][nc]==0) continue; 
				
				visited[nr][nc]=true; 
				q.push(new Point(nr,nc)); 
				
			}
			
		}
		return count; 
	}

	//https://www.acmicpc.net/problem/2667
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in); 
		int num = sc.nextInt(); 
		apartment = new int[num][num]; 
		visited = new boolean[num][num]; 
		
		ArrayList<Integer> list =new ArrayList<>(); 
		for(int i=0; i<num; i++){
			String input = sc.next(); 
			for(int j=0; j<num; j++){
				apartment[i][j] = input.charAt(j)-'0';
			}
		}
		
		for(int i=0; i<apartment.length; i++){
			for(int j=0; j<apartment[i].length; j++){
				
				if(!visited[i][j] && apartment[i][j]==1){
					list.add(searchApartment(i,j));
				 
				}
			}
		}

		
	
		
		System.out.println(list.size());
		Collections.sort(list);
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
	
		
	}

}
