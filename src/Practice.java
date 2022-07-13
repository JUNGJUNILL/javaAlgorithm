import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Practice {
	
	static int v; 
	static ArrayList<Integer>[] a;
	static boolean[] visited; 

	static void BFS(int start){
		visited[start]=true; 
		Queue<Integer> q=new LinkedList<>(); 
		q.add(start); 
	
		while(!q.isEmpty()){
			int curr = q.poll(); 
			System.out.print(curr+1+" ");
			
			for(int i : a[curr]){
				if(!visited[i]){
					visited[i]=true; 
					q.add(i); 
				}
			}	
		}
		
	}
	
	public static void main(String[] args) {

		//Á¤Á¡ÀÇ °¹¼ö
		v=8; 

		a= new ArrayList[v]; 
		
		visited = new boolean[v];
		
		
		for(int i=0; i<v; i++){
			a[i]=new ArrayList<>(); 
		}
		
		a[0].add(1);
		a[0].add(2);
		
		a[1].add(0);
		a[1].add(3);
		a[1].add(4);

		a[2].add(0);
		a[2].add(4);
		a[2].add(7);
		a[2].add(6);
		
		a[3].add(1);
		a[3].add(4);
		
		a[4].add(1);
		a[4].add(2);
		a[4].add(5);
		
		a[5].add(4);
		
		a[6].add(2);
		a[6].add(7);

		a[7].add(2);
		a[7].add(6);

		BFS(0); 
		
		
		
	}
}
