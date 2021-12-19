
import java.util.*;

class Union_Find{
	
	public int getParent(int[] parent, int x){
		if(parent[x]==x) return x; 
		return getParent(parent, parent[x]); 
	}
	
	public void unionParent(int[] parent, int a, int b){
		
		a=getParent(parent, a); 
		b=getParent(parent, b); 
		
		if(a<b){
			parent[b]=a;
		}else{
			parent[a]=b; 
		}
		
	}
	
	//연결시 서클 생성 여부 
	public int findParent(int[] parent, int a , int b){
		a=getParent(parent, a); 
		b=getParent(parent, b); 
		
		if(a==b){
			return 1;
		}else{
			return 0; 
		}
	}
	
}

class Edge implements Comparable<Edge>{
	
	public int[] node=new int[2]; 
	public int distance; 
	
	public Edge(int a, int b, int distance){
		this.node[0]=a;
		this.node[1]=b; 
		this.distance=distance; 
	}
	
	@Override
	public int compareTo(Edge o) {
			return this.distance - o.distance; 
	}
	
}


public class Practice {

	public static void main(String[] args) {

		
		int node=3+1; 
		int d=3; 
		
		int[] table=new int[node]; 
		
		//table = {0,1,2,3} 
		for(int i=1; i<node; i++){
			table[i]=i; 
		}
		
		ArrayList<Edge> list =new ArrayList<>(); 
		list.add(new Edge(1, 2, 1)); 
		list.add(new Edge(2, 3, 2)); 
		list.add(new Edge(1, 3, 3)); 
		int sum=0; 
		Collections.sort(list);
		
		Union_Find u=new Union_Find(); 
		//3번 순회
		for(int i=0; i<list.size(); i++){


			if(u.findParent(table, list.get(i).node[0], list.get(i).node[1])==0){
				sum+=list.get(i).distance; 
				u.unionParent(table, list.get(i).node[0], list.get(i).node[1]);
			}
			
		}
		System.out.println(sum);
		
		
		
	}
}




